package org.example.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public ArrayList<Product> products;


    public Store() {

        products = new ArrayList<>();
    }



    // Reading in the CSV file
    public void loadProductsFromFile(String filePath) {
        Scanner scanner = null;
        try {
            File file = new File(filePath);
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                Integer price = Integer.parseInt(parts[1]);
                String model = parts[2];
                Product product = new Product(name, price, model);
                products.add(product);
            }
            //scanner.close();

            System.out.println("Available Product in the store");
            System.out.println(products);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            throw new RuntimeException(e);
        }
        finally {
            if(scanner != null) {
                scanner.close();
            }

        }

    }
}
