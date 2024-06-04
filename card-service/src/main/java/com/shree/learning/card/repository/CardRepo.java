package com.shree.learning.card.repository;

import com.shree.learning.card.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepo extends JpaRepository<Card, Long> {
}
