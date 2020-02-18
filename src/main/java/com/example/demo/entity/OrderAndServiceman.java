package com.example.demo.entity;

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
@Table(name="OrderAndServiceman")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderAndServiceman {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "orderid")
	private Long orderid;
	@Column(name = "salepersonid")
	private Long salepersonid;
	
	
}
