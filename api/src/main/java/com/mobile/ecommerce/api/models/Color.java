package com.mobile.ecommerce.api.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Color implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private long id;
	
	private String type;
}
