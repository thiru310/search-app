/**
 * 
 */
package com.app.search.api.searchapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.search.api.searchapp.dao.dto.CategoryEntity;
import com.app.search.api.searchapp.model.Categories;
import com.app.search.api.searchapp.model.Products;
import com.app.search.api.searchapp.service.SearchApplicationService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tpurusot
 *
 */
@RestController
@RequestMapping(path = "/app/search")
@CrossOrigin(origins = "*")
@Slf4j
public class SearchAppController {
	
	@Autowired
	private SearchApplicationService searchApplicationService;
	
	@GetMapping(path="/categories", produces = {"application/json"})
	public List<Categories> getCategoryData(){
		List<Categories> categoriesList = searchApplicationService.getCategories();
		
		return categoriesList;
	}
	
	@GetMapping(path="/categories/{name}", produces = {"application/json"})
	public ResponseEntity<List<Products>> getCategoryData(@PathVariable(name="name") String categoryName){
		List<Products> productsList = searchApplicationService.getCategoryByName(categoryName);
		
		return new ResponseEntity<List<Products>>(productsList, HttpStatus.OK);
	}
	
	
	@GetMapping(path="/product/{productname}", produces = {"application/json"})
	public ResponseEntity<Products> getProductsAndAttributes(@PathVariable(name="productname") String productname){
		Products product = searchApplicationService.getProductsAndAttributes(productname);
	
		return new ResponseEntity<Products>(product, HttpStatus.OK);
	}
	
	

}
