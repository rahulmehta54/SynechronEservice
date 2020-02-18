package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Endorder")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EndOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "customerId")
	private Long customerId;

	@Column(name = "date")
	private LocalDateTime date;
	@Column(name = "Total")
	private Double total;

	@OneToMany
	@JoinTable(name = "order_products")
	private List<SalesPerson> salesPersonList;

}
