package com.example.iprwc_springapi.dao;

import com.example.iprwc_springapi.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
}
