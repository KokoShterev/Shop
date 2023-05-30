package com.example.proekt.controller.resources;
import lombok.Data;
@Data
public class AddressResource {
    private Long id;
    private String street;
    private String number;
    private String city;
    private String country;
    private String postalCode;
}
