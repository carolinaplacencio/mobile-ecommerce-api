package com.mobile.ecommerce.api.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private long id;
	
	private String imagen;
	
	private String brand;
	
	private String model;

	private String price;

	private String cpu;

	private String ram;

	private String operatingSystem;

	private String screenResolution;

	private String battery;

	private String camera;

	private String dimensions;

	private String weight;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			  name = "product_storage", 
			  joinColumns = { @JoinColumn(name = "product_id") }, 
			  inverseJoinColumns = { @JoinColumn(name = "storage_id") })
    private List<Storage> storages;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			  name = "product_color", 
			  joinColumns = { @JoinColumn(name = "product_id") }, 
			  inverseJoinColumns = { @JoinColumn(name = "color_id") })
    private List<Color> colors;
	
}
