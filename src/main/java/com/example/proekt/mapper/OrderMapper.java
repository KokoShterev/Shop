package com.example.proekt.mapper;

import com.example.proekt.controller.resources.OrderResource;
import com.example.proekt.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    public OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

    //@Mapping()
    OrderResource toResource(Order order);

    Order fromResource(OrderResource orderResource);
}
