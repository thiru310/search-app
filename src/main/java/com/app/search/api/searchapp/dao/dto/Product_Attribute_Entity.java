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
@Table(name = "product_attr")
public class Product_Attribute_Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="product_id", nullable = false)
	private int productId;
	
	@Column(name = "attribute_value_id", nullable =  false)
	private int attributeValueId;

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
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the attributeValueId
	 */
	public int getAttributeValueId() {
		return attributeValueId;
	}

	/**
	 * @param attributeValueId the attributeValueId to set
	 */
	public void setAttributeValueId(int attributeValueId) {
		this.attributeValueId = attributeValueId;
	}

	@Override
	public String toString() {
		return "Product_Attribute_Entity [id=" + id + ", productId=" + productId + ", attributeValueId="
				+ attributeValueId + "]";
	}
	
	

}
