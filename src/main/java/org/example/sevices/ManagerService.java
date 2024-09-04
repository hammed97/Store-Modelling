package org.example.sevices;


import org.example.model.Cashier;
import org.example.model.Manager;

public interface ManagerService {
    public String hireCashier(Cashier cashier, Manager manager);

    public String listCashiers(Manager manager);
}
