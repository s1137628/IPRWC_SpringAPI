package com.example.iprwc_springapi.controller;


import com.example.iprwc_springapi.dao.OrderDAO;
import com.example.iprwc_springapi.exception.NotFoundException;
import com.example.iprwc_springapi.model.ApiResponse;
import com.example.iprwc_springapi.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/orders")
public class OrderController {
    @Autowired
    private OrderDAO orderDAO;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ApiResponse all() {
        return new ApiResponse(HttpStatus.ACCEPTED, this.orderDAO.all());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ApiResponse get(@PathVariable UUID id) {
        Order order;
        try {
            order = this.orderDAO.getById(id);
        } catch (NotFoundException exception) {
            return new ApiResponse(HttpStatus.NOT_FOUND, "No order with that id");
        }
        return new ApiResponse(HttpStatus.ACCEPTED, order);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse save(@RequestBody Order newOrder){
        Order order = this.orderDAO.save(newOrder);
        return new ApiResponse(HttpStatus.ACCEPTED, order);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public ApiResponse replace(@RequestBody Order order, @PathVariable UUID id){
        try{
            this.orderDAO.replace(order, id);
        } catch(NotFoundException exception){
            return new ApiResponse(HttpStatus.NOT_FOUND, exception.getMessage());
        }

        return new ApiResponse(HttpStatus.ACCEPTED, "You replaced order: " + order.getOrderId() + " successfully.");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    @ResponseBody
    public ApiResponse update(@RequestBody Order order, @PathVariable UUID id){
        try{
            this.orderDAO.update(order, id);
        } catch(NotFoundException exception){
            return new ApiResponse(HttpStatus.NOT_FOUND, exception.getMessage());
        }

        return new ApiResponse(HttpStatus.ACCEPTED, "You updated order: " + order.getOrderId() + " successfully.");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ApiResponse delete(@PathVariable UUID id){
        try{
            this.orderDAO.delete(id);
        } catch(NotFoundException exception){
            return new ApiResponse(HttpStatus.NOT_FOUND, exception.getMessage());
        }

        return new ApiResponse(HttpStatus.ACCEPTED, "You deleted order: " + id + " successfully.");
    }
}
