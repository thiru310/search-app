/**
 * 
 */
package com.app.search.api.searchapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.search.api.searchapp.dao.dto.Attribute_Name_Entity;

/**
 * @author tpurusot
 *
 */
public interface AttributeNameRespository extends JpaRepository<Attribute_Name_Entity, Integer> {

}
