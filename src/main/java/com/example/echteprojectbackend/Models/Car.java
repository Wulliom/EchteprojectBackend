package com.example.echteprojectbackend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    private String Licenceplate;
    private String Brandname;
    private String Typecar;
    private String Yearofbuild;

}
