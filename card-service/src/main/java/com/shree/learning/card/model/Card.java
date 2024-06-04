package com.shree.learning.card.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long cardId;
    private String mobileNumber;
    private String cardNumber;
    private String cardType;
    private Double totalLimit;
    private Double amountUsed;
    private Double availableAmount;
}
