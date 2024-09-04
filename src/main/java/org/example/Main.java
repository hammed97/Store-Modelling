package org.example;

import org.example.model.*;
import org.example.servicesImplementation.CashierServiceImp;
import org.example.servicesImplementation.CustomerServiceImp;
import org.example.servicesImplementation.ManagerServiceImp;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        store.loadProductsFromFile("src/main/java/org/example/products.csv");



        Manager manager = new Manager("Bello", "male", "111", "0904443");


//the list of cashier applicants to be hired
        Cashier cashier1 = new Cashier("pelz", "male", "233", "090777", 7);
        Cashier cashier2 = new Cashier("mike", "male", "233", "090777", 3);
        Cashier cashier3 = new Cashier("nosa", "male", "233", "090777", 2);
        Cashier cashier4 = new Cashier("ernest", "male", "233", "090777", 6);

        ManagerServiceImp managerServiceImp = new ManagerServiceImp();
        String applicant1 = managerServiceImp.hireCashier(cashier1,manager);
        String applicant2 = managerServiceImp.hireCashier(cashier2,manager);
        String applicant3 = managerServiceImp.hireCashier(cashier3,manager);
        String applicant4 = managerServiceImp.hireCashier(cashier4,manager);

        System.out.println(applicant1);
        System.out.println(applicant2);
        System.out.println(applicant3);
        System.out.println(applicant4);


        // Customers buying product base on their wallet amount, if it's sufficient, they get the products in their cart else they won't

        // First customer
        Customer customer1 = new Customer("Hassan", "0909999", 1000000);
        Product product1 = store.products.get(2);
        Product product2 = store.products.get(1);


        // Second customer
        Customer customer2 = new Customer("eben", "090889", 100000);
        Product product3 = store.products.get(5);
        Product product4 = store.products.get(1);

        CustomerServiceImp customerServiceImp = new CustomerServiceImp();
        customerServiceImp.addToCart(product1, customer1);
        customerServiceImp.addToCart(product2, customer1);
        customerServiceImp.addToCart(product3,customer2);
        customerServiceImp.addToCart(product4,customer2);


        // Creating object for receipt generating for each customer
        CashierServiceImp cashierServiceImp = new CashierServiceImp();
        cashierServiceImp.providesReceipt(customer1, customer1.getCart());
        String generate = cashierServiceImp.providesReceipt(customer2, customer2.getCart());
        System.out.println(generate);
    }
}