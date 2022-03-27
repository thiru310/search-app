/**
 * 
 */
package com.app.search.api.searchapp.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author tpurusot
 *
 */
public class Categories implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7127960907579941758L;
	private String category_name;
	private List<Products> products;
	/**
	 * @return the category_name
	 */
	public String getCategory_name() {
		return category_name;
	}
	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	/**
	 * @return the products
	 */
	public List<Products> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Categories [category_name=" + category_name + ", products=" + products + "]";
	}

	
	

}
