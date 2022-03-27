/**
 * 
 */
package com.app.search.api.searchapp.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.search.api.searchapp.dao.dto.ProductEntity;

/**
 * @author tpurusot
 *
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT p.*, av.value as attributeValue, an.name as attributeName, an.description FROM search_app.product P\r\n" + 
			"INNER JOIN search_app.product_attr pa on pa.product_id= p.id\r\n" + 
			"INNER JOIN search_app.attribute_values av on pa.attribute_value_id = av.id\r\n" + 
			"INNER JOIN search_app.attribute_name an on av.attribute_name_id = an.id\r\n" + 
			"where p.name = ?1")
	public List<Object[]> getProductAndAttributes(String productName);
//	@SqlResultSetMapping(name = "ProductAttributeMapping",
//    classes = @ConstructorResult(
//            targetClass = Product.class,
//            columns = {               
//                    @ColumnResult(name = "id", type = Integer.class),
//                    @ColumnResult(name = "name"),
//                    @ColumnResult(name = "brand"),
//                    @ColumnResult(name = "price"),
//                    @ColumnResult(name = "replacement"),
//                    @ColumnResult(name = "warrenty"),
//                    @ColumnResult(name = "model_name"),
//                    @ColumnResult(name = "available"),
//                    @ColumnResult(name = "warrenty"),
//            })

}
