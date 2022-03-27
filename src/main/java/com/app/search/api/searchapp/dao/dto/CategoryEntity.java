/**
 * 
 */
package com.app.search.api.searchapp.dao.dto;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author tpurusot
 *
 */
@Entity
@Table(name = "category")
public class CategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 private List<ProductEntity> products;

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
	 * @return the category_name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String name) {
		this.name = name;
	}

	/**
	 * @return the category_description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return the products
	 */
	public List<ProductEntity> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	/**
	 * @param category_description the category_description to set
	 */
	public void setCategory_description(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", category_name=" + name + ", category_description="
				+ description + ", products=" + products + "]";
	}
	 
	 
}
