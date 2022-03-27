/**
 * 
 */
package com.app.search.api.searchapp.dao.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * @author tpurusot
 *
 */
@Entity
@Table(name = "product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="category_id", nullable = false)
	private int category_id;
	
	@Column(name="name")
	private String product_name;
	
	@Column(name="brand")
	private String brand_name;
	
	@Column(name="price")
	private int price;
	
	@Column(name="replacement")
	private int replacementdays;
	
	@Column(name="warrenty")
	private int warrentyInYears;
	
	@Column(name="model_name")
	private String model_name;
	
	@Column(name="available")
	private int availability;
	

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false, updatable = false )
	private CategoryEntity category;

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
	 * @return the category_id
	 */
	public int getCategory_id() {
		return category_id;
	}

	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the brand_name
	 */
	public String getBrand_name() {
		return brand_name;
	}

	/**
	 * @param brand_name the brand_name to set
	 */
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the replacementdays
	 */
	public int getReplacementdays() {
		return replacementdays;
	}

	/**
	 * @param replacementdays the replacementdays to set
	 */
	public void setReplacementdays(int replacementdays) {
		this.replacementdays = replacementdays;
	}

	/**
	 * @return the warrentyInYears
	 */
	public int getWarrentyInYears() {
		return warrentyInYears;
	}

	/**
	 * @param warrentyInYears the warrentyInYears to set
	 */
	public void setWarrentyInYears(int warrentyInYears) {
		this.warrentyInYears = warrentyInYears;
	}

	/**
	 * @return the model_name
	 */
	public String getModel_name() {
		return model_name;
	}

	/**
	 * @param model_name the model_name to set
	 */
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	/**
	 * @return the availability
	 */
	public int getAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(int availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", category_id=" + category_id + ", product_name=" + product_name
				+ ", brand_name=" + brand_name + ", price=" + price + ", replacementdays=" + replacementdays
				+ ", warrentyInYears=" + warrentyInYears + ", model_name=" + model_name + ", availability="
				+ availability + "]";
	}
	
	

}
