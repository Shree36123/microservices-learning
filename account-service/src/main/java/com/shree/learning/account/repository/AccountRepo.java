package com.shree.learning.account.repository;

import com.shree.learning.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long> {
}
