package com.Many2Many.ManyRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Many2Many.Many.Entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
