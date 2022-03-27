package com.app.search.api.searchapp.dao.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "attribute_name")
public class Attribute_Name_Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "attributeName", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Attribute_Value_Entity> attributeValueEntity;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

	/**
	 * @return the attributeValueEntity
	 */
	public List<Attribute_Value_Entity> getAttributeValueEntity() {
		return attributeValueEntity;
	}

	/**
	 * @param attributeValueEntity the attributeValueEntity to set
	 */
	public void setAttributeValueEntity(List<Attribute_Value_Entity> attributeValueEntity) {
		this.attributeValueEntity = attributeValueEntity;
	}

	@Override
	public String toString() {
		return "Attribute_Name_Entity [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	

}
