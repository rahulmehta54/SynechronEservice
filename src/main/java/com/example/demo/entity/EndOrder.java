package com.example.demo.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Endorder" )

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EndOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Long id;
	@Column(name = "customerId")
	Long customerId;
	@Column(name = "saleperson")
	String saleperson;
	@Column (name="date")
	LocalDateTime date;
	@Column(name="Total")
	Double total;
	
}
