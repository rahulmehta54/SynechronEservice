package com.eservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "tbl_category")
@Component
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NonNull
	@Length(min = 2, message = "Category name should contain at least two characters.")
	private String name;

	private int status;

	public Category() {
		super();
	}

}
