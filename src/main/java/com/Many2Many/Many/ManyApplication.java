package com.Many2Many.Many;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ManyApplication.class, args);
	}
//
//	@Autowired
//	private CustomerRepo customerRepo;
//
//	@Autowired
//	private ProductRepo productRepo;

//	@Override
//	public void run(String... args) throws Exception {
//		Customer customer = new Customer();
//		customer.setId(1);
//		customer.setCname("Suvarna");
//		customer.setAdd("Pune");
//		customer.setNo("8454567198");
//
//		Product product = new Product();
//		product.setPCode(3127);
//		product.setPName("Mobile");
//		product.setPquentity(2);
//		product.setPrice(10000);
//
//		customer.setProduct(product);
//		product.setCustomer(customer);
//
//		customerRepo.save(customer);
//		Optional<Customer> C = customerRepo.findById(2);
//		System.out.println(C);
//
//	}

}
