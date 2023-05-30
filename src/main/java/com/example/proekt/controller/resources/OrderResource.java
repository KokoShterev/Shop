package com.example.proekt.controller.resources;

import lombok.Data;

@Data
public class OrderResource {
    private Long id;
    private Long userId;
    private Long productId;
    private Long quantity;
    private String address;
    private String phoneNumber;
    private String status;
}
