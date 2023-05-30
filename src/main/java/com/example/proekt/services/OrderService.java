package com.example.proekt.services;

import com.example.proekt.controller.resources.OrderResource;

import java.util.List;

public interface OrderService {
    List<OrderResource> findAll();
    OrderResource save(OrderResource orderResource);
    OrderResource update(OrderResource orderResource);
}
