package com.Many2Many.ManyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Many2Many.ManyRepo.CustomerRepo;
import com.Many2Many.ManyRepo.ProductRepo;

@RestController
public class ManyController {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private ProductRepo productRepo;
	
}
