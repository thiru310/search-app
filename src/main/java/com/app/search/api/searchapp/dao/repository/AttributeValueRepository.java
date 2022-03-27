/**
 * 
 */
package com.app.search.api.searchapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.search.api.searchapp.dao.dto.Attribute_Value_Entity;

/**
 * @author tpurusot
 *
 */
public interface AttributeValueRepository extends JpaRepository<Attribute_Value_Entity, Integer> {

}
