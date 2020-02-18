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
@Table(name="finalcart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Finalcart {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private	Long id;
	@Column(name="userid")
	private Long userId;
	@Column(name="salespersonid")
	private Long salespersonid;

}



