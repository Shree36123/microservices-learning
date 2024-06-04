package com.shree.learning.account.services;

import com.shree.learning.account.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public Customer fetchCustomer(String phoneNumber);

    public void createCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void deleteCustomer(String phoneNumber);

}
