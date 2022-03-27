/**
 * 
 */
package com.app.search.api.searchapp.dao.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author tpurusot
 *
 */

@Entity
@Table(name = "attribute_value")
public class Attribute_Value_Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;

	@Column(name = "attribute_name_id", nullable = false)
	private int attributeId;
	
	@Column(name="value")
	private String value;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attribute_name_id", referencedColumnName = "id", insertable = false, updatable = false )
	private Attribute_Name_Entity attributeName;

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
	 * @return the attributeId
	 */
	public int getAttributeId() {
		return attributeId;
	}

	/**
	 * @param attributeId the attributeId to set
	 */
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the attributeName
	 */
	public Attribute_Name_Entity getAttributeName() {
		return attributeName;
	}

	/**
	 * @param attributeName the attributeName to set
	 */
	public void setAttributeName(Attribute_Name_Entity attributeName) {
		this.attributeName = attributeName;
	}

	@Override
	public String toString() {
		return "Attribute_Value_Entity [id=" + id + ", attributeId=" + attributeId + ", value=" + value
				+ ", attributeName=" + attributeName + "]";
	}
	
	
}
