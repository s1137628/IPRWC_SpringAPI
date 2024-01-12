package com.example.iprwc_springapi.dao;

import com.example.iprwc_springapi.exception.NotFoundException;
import com.example.iprwc_springapi.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Component
public class OrderDAO {

    @Autowired
    private OrderRepository orderRepository;


    public ArrayList<Order> all(){
        ArrayList<Order> allOrders = (ArrayList<Order>) this.orderRepository.findAll();
        return allOrders;
    }

    public Order getById(UUID id){
        Optional<Order> optionalOrder = this.orderRepository.findById(id);
        if(optionalOrder.isEmpty()){
            throw new NotFoundException("Product with id: " + id + "not found");
        }
        return optionalOrder.get();
    }

    public Order save(Order newOrder){
        Order order = this.orderRepository.save(newOrder);
        return order;
    }

    public Order replace(Order newOrder, UUID id) throws NotFoundException{
        Optional<Order> optionalOrder = this.orderRepository.findById(id);

        if(optionalOrder.isEmpty()){
            throw new NotFoundException("Product with id: " + id + " not found");
        }

        Order currentOrder = optionalOrder.get();
        currentOrder.setOrderId(newOrder.getOrderId());
        currentOrder.setUserId(newOrder.getUserId());
        currentOrder.setTotalPrice(newOrder.getTotalPrice());


        this.orderRepository.save(currentOrder);
        return currentOrder;
    }


    public Order update(Order updatedOrder, UUID id) throws NotFoundException{
        Optional<Order> optionalOrder = this.orderRepository.findById(id);

        if(optionalOrder.isEmpty()){
            throw new NotFoundException("Product with id: " + id + " not found");
        }

        Order currentOrder = optionalOrder.get();
        currentOrder.setOrderId(updatedOrder.getOrderId());
        currentOrder.setUserId(updatedOrder.getUserId());
        currentOrder.setTotalPrice(updatedOrder.getTotalPrice());


        this.orderRepository.save(updatedOrder);
        return updatedOrder;
    }

    public void delete(UUID id) throws NotFoundException{
        Optional<Order> optionalOrder = this.orderRepository.findById(id);

        if(optionalOrder.isEmpty()){
            throw new NotFoundException("Product with id: " + id + " not found");
        }

        Order order = optionalOrder.get();
        this.orderRepository.delete(order);
    }

}
