package com.shree.learning.account.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account {
    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    private Long customerId;
}
