package org.example.servicesImplementation;


import org.example.model.Customer;
import org.example.model.Product;
import org.example.sevices.CustomerService;

public class CustomerServiceImp implements CustomerService {

    @Override
    public void addToCart(Product product, Customer customer) {

            customer.getCart().add(product);


        }

    }

