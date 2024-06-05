package com.shree.learning.account.repository;

import com.shree.learning.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account, Long> {
    Optional<Account> findByPhoneNumber(String phoneNumber);
}
