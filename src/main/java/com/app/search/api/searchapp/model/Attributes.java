/**
 * 
 */
package com.app.search.api.searchapp.model;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author tpurusot
 *
 */
@Data
@Getter
@Setter
@ToString
public class Attributes implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2960119788818358846L;

	private String attributeName;
	
	private String attributeValue;

	public Attributes(String attributeName, String attributeValue) {
		super();
		this.attributeName = attributeName;
		this.attributeValue = attributeValue;
	}

	public Attributes() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the attributeName
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * @param attributeName the attributeName to set
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * @return the attributeValue
	 */
	public String getAttributeValue() {
		return attributeValue;
	}

	/**
	 * @param attributeValue the attributeValue to set
	 */
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	@Override
	public String toString() {
		return "Attributes [attributeName=" + attributeName + ", attributeValue=" + attributeValue + "]";
	}
	

}
