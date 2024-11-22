package co.edu.umanizales.rentadevehiculos.controller;

public class vehiclecontroler {
    package co.edu.umanizales.rentadevehiculos.controller;

package com.example.vehiclesystem.model;

import jakarta.persistence.*;

    @Entity
    public class Vehicle {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String brand;
        private String model;
        private int year;
        private String plateNumber;

        public Vehicle(Long id, String brand, String model, int year, String plateNumber) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.plateNumber = plateNumber;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getPlateNumber() {
            return plateNumber;
        }

        public void setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
        }
        // Gettersandsetters

    }

}
