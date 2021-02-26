package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Orders;



public interface OrderRepo extends JpaRepository<Orders, Long>{

		
}
