/**
 * 
 */
package com.app.search.api.searchapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.search.api.searchapp.dao.dto.Product_Attribute_Entity;

/**
 * @author tpurusot
 *
 */
public interface ProductAttributeRepository extends JpaRepository<Product_Attribute_Entity, Integer> {

}
