package com.company.sapriko;

class Car {

    private int yearModel;

    private String brand;

    private int priceModel;

    private int[] numberOfGears;

    Car(String brand) {
        this.brand = brand;
    }
	
	Car(String brand, int year) {
		yearModel = year;
		this.brand = brand;
	}

    Car(String brand, int year, int price, int[] number) {
        yearModel = year;
        this.brand = brand;
        priceModel = price;
        numberOfGears = number;
    }

    int getYearModel() {
        return yearModel;
    }

    String getBrand() {
        return brand;
    }

    int getPriceModel() {
        return priceModel;
    }

    int[] getNumberOfGears() {
        return numberOfGears;
    }
}