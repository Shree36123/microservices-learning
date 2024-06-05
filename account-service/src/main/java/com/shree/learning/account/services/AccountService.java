package com.shree.learning.account.services;

import com.shree.learning.account.dto.CustomerDto;
import com.shree.learning.account.model.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    public Account fetchAccount(String phoneNumber);

    void createAccount(CustomerDto customerDto);

    public void updateAccount(CustomerDto customerDto);

    public void deleteAccount(String phoneNumber);

}
