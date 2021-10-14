package com.mhope;

import java.util.ArrayList;
import java.util.List;

public class CriteriaBalanceGreaterThan implements Criteria {

    List<Customer> customers;
    Double balance;

    public CriteriaBalanceGreaterThan(List<Customer> customers, Double balance) {
        this.customers = customers;
        this.balance = balance;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers, Double balance) {
       List<Customer> customerList = new ArrayList<>();

       for (Customer customer : customers){
           if(customer.getBalance() >= balance){
               customerList.add(customer);
           }
       }
       return customerList;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers) {
        return null;
    }

    @Override
    public List<Customer> meetCriteria(List<Customer> customers, int numberOfYears) {
        return null;
    }
}
