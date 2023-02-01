package com.Many2Many.ManyRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Many2Many.Many.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
