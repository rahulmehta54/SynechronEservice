package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Entity
@Component
@Table(name = "cart")
public class Cart {

}
