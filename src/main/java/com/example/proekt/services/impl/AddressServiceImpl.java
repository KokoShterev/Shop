package com.example.proekt.services.impl;

import static com.example.proekt.mapper.AddressMapper.ADDRESS_MAPPER;

public class AddressServiceImpl implements com.example.proekt.services.AddressService{
    private final com.example.proekt.repository.AddressRepository addressRepository;

    public AddressServiceImpl(com.example.proekt.repository.AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public java.util.List<com.example.proekt.controller.resources.AddressResource> findAll() {
        return addressRepository.findAll().stream().map(ADDRESS_MAPPER::toResource).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public com.example.proekt.controller.resources.AddressResource save(com.example.proekt.controller.resources.AddressResource addressResource) {
        com.example.proekt.entity.Address address = ADDRESS_MAPPER.fromResource(addressResource);
        return ADDRESS_MAPPER.toResource(addressRepository.save(address));
    }

    @Override
    public com.example.proekt.controller.resources.AddressResource update(com.example.proekt.controller.resources.AddressResource addressResource) {
        com.example.proekt.entity.Address address = ADDRESS_MAPPER.fromResource(addressResource);
        return ADDRESS_MAPPER.toResource(addressRepository.save(address));
    }
}
