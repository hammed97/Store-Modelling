package org.example.sevices;



import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Store;

import java.util.ArrayList;

public interface CashierService {
    String providesReceipt(Customer customer, ArrayList<Product> cart);

    public String sellProduct(Customer customer, Product product, Store store);
}
