/**
 * 
 */
package com.app.search.api.searchapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.search.api.searchapp.dao.dto.Category_Attribute_Entity;

/**
 * @author tpurusot
 *
 */
public interface CategoryAttributeRepository extends JpaRepository<Category_Attribute_Entity, Integer> {

}
