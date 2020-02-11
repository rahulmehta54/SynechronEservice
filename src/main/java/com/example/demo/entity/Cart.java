package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

	private int 	cId;
	private String name;
private String location;
@Override
public String toString() {
	return "Cart [cId=" + cId + ", name=" + name + ", location=" + location + "]";
}


}
