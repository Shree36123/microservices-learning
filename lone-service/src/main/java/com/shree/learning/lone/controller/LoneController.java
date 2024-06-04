package com.shree.learning.lone.controller;

import com.shree.learning.lone.dto.LoneDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class LoneController {
    @GetMapping("/fetch/account")
    public LoneDto fetchCustomer(@PathVariable String phoneNumber) {
        return null;
    }

    @PostMapping("/create/account")
    public String createAccount(@RequestBody LoneDto LoneDto) {
        return "Successfully added";
    }

    @PutMapping("/update/account")
    public String updateAccount(@RequestBody LoneDto LoneDto) {
        return "Successfully updated";
    }

    @DeleteMapping
    public void deleteAccount(String phoneNumber) {

    }


}
