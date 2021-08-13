package com.example.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.customers.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
