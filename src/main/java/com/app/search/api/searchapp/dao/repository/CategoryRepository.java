/**
 * 
 */
package com.app.search.api.searchapp.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.search.api.searchapp.dao.dto.CategoryEntity;

/**
 * @author tpurusot
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
	
	public CategoryEntity findByName(String categoryName);

}
