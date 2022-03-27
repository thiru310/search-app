/**
 * 
 */
package com.app.search.api.searchapp.dao.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tpurusot
 *
 */
@Entity
@Table(name = "category_attr")
public class Category_Attribute_Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="attribute_name_id", nullable = false)
	private int attributeNameId;
	
	@Column(name="category_id", nullable = false)
	private int categoryId;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the attributeNameId
	 */
	public int getAttributeNameId() {
		return attributeNameId;
	}

	/**
	 * @param attributeNameId the attributeNameId to set
	 */
	public void setAttributeNameId(int attributeNameId) {
		this.attributeNameId = attributeNameId;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Category_Attribute_Entity [id=" + id + ", attributeNameId=" + attributeNameId + ", categoryId="
				+ categoryId + "]";
	}
	
	

}
