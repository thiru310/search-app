/**
 * 
 */
package com.app.search.api.searchapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.app.search.api.searchapp.dao.dto.CategoryEntity;
import com.app.search.api.searchapp.dao.dto.ProductEntity;
import com.app.search.api.searchapp.dao.repository.CategoryRepository;
import com.app.search.api.searchapp.dao.repository.ProductRepository;
import com.app.search.api.searchapp.model.Attributes;
import com.app.search.api.searchapp.model.Categories;
import com.app.search.api.searchapp.model.Products;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tpurusot
 *
 */
@Service
@Slf4j
public class SearchApplicationService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Categories> getCategories() {
		List<CategoryEntity> categoryEntityList = categoryRepository.findAll();
		System.out.println("categoryEntity :: "+categoryEntityList);
		List<Categories> categoriesList = new ArrayList<>();
		for(CategoryEntity categoryEntity : categoryEntityList) {
			categoriesList.add(mapResponsetoCategory(categoryEntity.getName(), categoryEntity.getProducts()));
			
		}
		return categoriesList;
	}
	
	public List<Products> getCategoryByName(String categoryName) {
		CategoryEntity categoryEntity = categoryRepository.findByName(categoryName);
		System.out.println("categoryEntity :: "+categoryEntity.toString());
		List<Products> productList = new ArrayList<>();
		for(ProductEntity productEntity : categoryEntity.getProducts()) {
			productList.add(getProductsAndAttributes(productEntity.getProduct_name()));
		}
		return productList.stream().filter(x -> x != null).collect(Collectors.toList());
	}
	
	public Products getProductsAndAttributes(String productName) {
		Map<Integer, Products> productsMap = new HashMap<>();
		List<Object[]> objectList = productRepository.getProductAndAttributes(productName);
		if(!CollectionUtils.isEmpty(objectList)){
		objectList.stream().forEach((record) -> {
	        int id = (Integer)  record[0];
	        String name = (String) record[2];
	        String brand = (String) record[3];
	        Integer price = (Integer) record[4];
	        Integer replacement = (Integer) record[5];
	        Integer warrenty = (Integer) record[6];
	        String modelName =  (String) record[7];
	        Integer available =  (Integer) record[8];
	        String attributeValue =  (String) record[9];
	        String attributeName =  (String) record[10];
	        
	        System.out.println("id :: "+id);
	        System.out.println("name :: "+ name);
	        System.out.println("brand :: "+brand);
	        System.out.println("price :: "+price);
	        
	        Attributes attributes = new Attributes(attributeName, attributeValue);
			
			Optional<Products> product =  Optional.ofNullable(productsMap.get(id));
	        if(product.isPresent()){
	        	product.get().getAttributeList().add(attributes);
	        }else{
	        	Products newProduct = new Products(id, name, brand, price, replacement, warrenty, modelName, available, attributeValue, attributeName);
	        	productsMap.put(id, newProduct);
	        }
	
	        
			
	});
		List<Products> productList = productsMap.values().stream().collect(Collectors.toList());
		productList.forEach(product -> System.out.println(product.toString()));
		return productList.get(0);
		}
		return null;
	
	}
	
	public Categories mapResponsetoCategory(String name, List<ProductEntity> productEntityList) {
		Categories category = new Categories();
		category.setCategory_name(name);
		List<Products> productsList = new ArrayList<>();
		for(ProductEntity productEntity : productEntityList) {
			Products productwithAttributes = getProductsAndAttributes(productEntity.getProduct_name());
			if(null != productwithAttributes) {
				productsList.add(productwithAttributes);
			}else {
				Products product = new Products(productEntity.getId(), 
						productEntity.getProduct_name(),
						productEntity.getBrand_name(),
						productEntity.getPrice(),
						productEntity.getReplacementdays(),
						productEntity.getWarrentyInYears(),
						productEntity.getModel_name(),
						productEntity.getAvailability());
				productsList.add(product);
			}
			
		}
		category.setProducts(productsList);
		return category;
	}
	
	
	

}
