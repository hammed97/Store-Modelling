package org.example.sevices;


import org.example.model.Customer;
import org.example.model.Product;

public interface CustomerService {
    public void addToCart(Product product, Customer customer);
}
