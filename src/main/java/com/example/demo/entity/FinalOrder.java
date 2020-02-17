package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="OrderFinal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinalOrder {
	 
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		Long id;
		@Column(name = "customerid")
		Long customerid;
		@Column(name = "salepersonid")
		String salepersonid;

		
}
