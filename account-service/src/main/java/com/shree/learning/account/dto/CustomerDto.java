package com.shree.learning.account.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Data
public class CustomerDto {
    private String name;
    private String email;
    private String phoneNumber;
    private AccountDto accountDto;
}
