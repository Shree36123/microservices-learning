package com.shree.learning.account.services;

import com.shree.learning.account.model.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    public Account fetchAccount(String phoneNumber);

    public void createAccount(Account Account);

    public void updateAccount(Account Account);

    public void deleteAccount(String phoneNumber);

}
