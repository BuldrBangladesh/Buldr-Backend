package com.example.cse_410_buldr_backend.Service;

import com.example.cse_410_buldr_backend.Entity.Order;
import com.example.cse_410_buldr_backend.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class OrderService {
    @Autowired
    OrderRepository orderRepo;

    @RequestMapping(value="/user-orders/{userId}",method= RequestMethod.GET)
    public List<Order> getUserOrders(@PathVariable("userId") long id){
        return orderRepo.searchByOrderByUserId(id);
    }
    @RequestMapping(value="/order/{id}",method= RequestMethod.GET)
    public Order getOrder(@PathVariable("id") long id){
        return orderRepo.searchByOrderById(id);
    }
    @RequestMapping(value="/order",method= RequestMethod.POST)
    public Order addPost(@RequestBody Order ordr){
        orderRepo.saveAndFlush(ordr);
        return ordr;
    }
}
