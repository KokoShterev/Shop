package com.example.proekt.services;

import com.example.proekt.controller.resources.AddressResource;

import java.util.List;

public interface AddressService {
    List<AddressResource> getAll();
//    getById
    AddressResource getById(Long id);
    AddressResource save(AddressResource addressResource);
    AddressResource update(AddressResource addressResource, Long id);
    void delete(Long id);
}
