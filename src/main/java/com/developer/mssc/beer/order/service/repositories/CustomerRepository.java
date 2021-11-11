package com.developer.mssc.beer.order.service.repositories;

import com.developer.mssc.beer.order.service.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created By Rohit on 11-11-2021.
 */
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findAllByCustomerNameLike(String customerName);
}
