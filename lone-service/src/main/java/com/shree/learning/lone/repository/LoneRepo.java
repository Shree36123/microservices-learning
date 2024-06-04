package com.shree.learning.lone.repository;

import com.shree.learning.lone.model.Lone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoneRepo extends JpaRepository<Lone, Long> {
}
