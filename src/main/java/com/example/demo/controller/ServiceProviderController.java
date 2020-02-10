package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.repos.ServiceProviderRepository;

@Controller
public class ServiceProviderController {

	@Autowired
	private ServiceProviderRepository repo;
}
