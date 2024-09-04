package org.example.model;

import java.util.ArrayList;

public class Manager extends CodeBase{

    ArrayList<Cashier> cashiers;

    public Manager(String name, String gender, String id, String phoneNumber) {
        super(name, gender, id, phoneNumber);
        this.cashiers = new ArrayList<>();
    }


    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }

    public void setCashiers(ArrayList<Cashier> cashiers) {
        this.cashiers = cashiers;
    }
}
