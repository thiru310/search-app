/**
 * 
 */
package com.app.search.api.searchapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import lombok.Data;
import lombok.EqualsAndHashCode;
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
public class Products implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6903730705027519979L;
	private int id;
	private String name;
	private String brand;
	private Integer price;
	private String replacement;
	private String warrenty;
	private String model_name;
	private boolean available;
	private List<Attributes> attributeList;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * @return the replacement
	 */
	public String getReplacement() {
		return replacement;
	}
	/**
	 * @param replacement the replacement to set
	 */
	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}
	/**
	 * @return the warrenty
	 */
	public String getWarrenty() {
		return warrenty;
	}
	/**
	 * @param warrenty the warrenty to set
	 */
	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
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
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/**
	 * @return the attributeList
	 */
	public List<Attributes> getAttributeList() {
		return attributeList;
	}
	/**
	 * @param attributeList the attributeList to set
	 */
	public void setAttributeList(List<Attributes> attributeList) {
		this.attributeList = attributeList;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", replacement="
				+ replacement + ", warrenty=" + warrenty + ", model_name=" + model_name + ", available=" + available
				+ ", attributeList=" + attributeList + "]";
	}
	
//	private static Map<Integer, Products> productMap = new HashMap<>();
	public Products(int id, String name, String brand, int price, int replacement, int warrenty, String model_name, int available, String value, String description) {
		
		Attributes attributes = new Attributes(description, value);
//		
//		Optional<Products> productsList =  Optional.ofNullable(productMap.get(id));
//        if(productsList.isPresent()){
//        	productsList.get().attributeList.add(attributes);
//        }else{
        	this.id = id;
    		this.name = name;
    		this.brand = brand;
    		this.price = price;
    		this.replacement = replacement+" days";
    		this.warrenty = warrenty+ " year";
    		this.model_name = model_name;
    		this.available = (available == 1)? true : false;
            List<Attributes> attributesList = new ArrayList<>();
            attributesList.add(attributes);
            this.attributeList = attributesList;
//        }
        
//		productMap.put(id, this);
		
		
	}
	public Products(int id, String name, String brand, Integer price, int replacement, int warrenty,
			String model_name, int available) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.replacement = replacement+" days";
		this.warrenty = warrenty+ " year";
		this.model_name = model_name;
		this.available = (available == 1)? true : false;;
	}
	
	
	
	 
}
