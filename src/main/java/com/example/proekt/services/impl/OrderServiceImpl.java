package com.example.proekt.services.impl;

import static com.example.proekt.mapper.OrderMapper.ORDER_MAPPER;

public class OrderServiceImpl {
    private final com.example.proekt.repository.OrderRepository orderRepository;

    public OrderServiceImpl(com.example.proekt.repository.OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public java.util.List<com.example.proekt.controller.resources.OrderResource> findAll() {
        return orderRepository.findAll().stream().map(ORDER_MAPPER::toResource).collect(java.util.stream.Collectors.toList());
    }


    public com.example.proekt.controller.resources.OrderResource save(com.example.proekt.controller.resources.OrderResource orderResource) {
        com.example.proekt.entity.Order order = ORDER_MAPPER.fromResource(orderResource);
        return ORDER_MAPPER.toResource(orderRepository.save(order));
    }


    public com.example.proekt.controller.resources.OrderResource update(com.example.proekt.controller.resources.OrderResource orderResource) {
        com.example.proekt.entity.Order order = ORDER_MAPPER.fromResource(orderResource);
        return ORDER_MAPPER.toResource(orderRepository.save(order));
    }
}
