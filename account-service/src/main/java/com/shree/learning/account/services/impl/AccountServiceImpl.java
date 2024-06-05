package com.shree.learning.account.services.impl;

import com.shree.learning.account.dto.AccountDto;
import com.shree.learning.account.dto.CustomerDto;
import com.shree.learning.account.model.Account;
import com.shree.learning.account.model.Customer;
import com.shree.learning.account.repository.AccountRepo;
import com.shree.learning.account.repository.CustomerRepo;
import com.shree.learning.account.services.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Random;

public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepo accountRepo;
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Account fetchAccount(String phoneNumber) {
        Optional<Customer> optional = customerRepo.findByPhoneNumber(phoneNumber);
        Customer customer = optional.orElseThrow(() -> new RuntimeException("unable to find the account using the given name"));
        Account account = accountRepo.findById(customer.getId()).orElseThrow(() -> new RuntimeException("Account details Not found"));
        AccountDto accountDTO = new AccountDto();
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(account, accountDTO);
        BeanUtils.copyProperties(customer, customerDto);
        customerDto.setAccountDto(accountDTO);
        return account;

    }

    @Override
    public void createAccount(CustomerDto customerDto) {
        Optional<Customer> optional = customerRepo.findByPhoneNumber(customerDto.getPhoneNumber());
        if (optional.isPresent())
            throw new RuntimeException("Account already created with give phoneNumber");
        Customer customer = new Customer();
        BeanUtils.copyProperties(customer, customerDto);
        customerRepo.save(customer);
        Account account = createAccountFromCustomer(customer);
        accountRepo.save(account);
    }

    public Account createAccountFromCustomer(Customer customer) {
        Account account = new Account();
        account.setCustomerId(customer.getId());
        account.setAccountType("Saving");
        account.setBranchAddress("Bangaluru");
        account.setAccountNumber(12340000000L + new Random(1000000).nextInt());
        return account;
    }

    @Override
    public void updateAccount(CustomerDto customerDto) {

    }

    @Override
    public void deleteAccount(String phoneNumber) {

    }
}
