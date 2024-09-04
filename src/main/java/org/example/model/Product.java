package org.example.model;

public class Product {

    private String name;
    private Integer Price;
    private String brand;


    public Product(String name, Integer price, String brand) {
        this.name = name;
        Price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
