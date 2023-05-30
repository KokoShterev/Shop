package com.example.proekt.services;

import com.example.proekt.controller.resources.AddressResource;

import java.util.List;

public interface AddressService {
    List<AddressResource> findAll();
    AddressResource save(AddressResource addressResource);
    AddressResource update(AddressResource addressResource);
}
