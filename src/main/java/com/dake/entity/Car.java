package com.dake.entity;

import javax.validation.constraints.NotBlank;

public class Car {

    @NotBlank(message = "品牌不能为空")
    // 品牌
    private String brand;
    // 公司
    private String corp;
    // 价格
    private double price;
    // 最大速度
    private int maxSpeed;

    public Car() {
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Car(String brand, String corp) {
        this.brand = brand;
        this.corp = corp;
    }

    public Car(String brand, double price, int maxSpeed) {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String corp, double price, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
