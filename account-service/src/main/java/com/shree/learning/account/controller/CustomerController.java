package com.shree.learning.account.controller;

import com.shree.learning.account.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class CustomerController {
    @GetMapping("/fetch/account")
    public CustomerDto fetchCustomer(@PathVariable String phoneNumber) {
        return null;
    }

    @PostMapping("/create/account")
    public String createAccount(@RequestBody CustomerDto customerDto) {
        return "Successfully added";
    }

    @PutMapping("/update/account")
    public String updateAccount(@RequestBody CustomerDto customerDto) {
        return "Successfully updated";
    }

    @DeleteMapping
    public void deleteAccount(String phoneNumber) {

    }


}
