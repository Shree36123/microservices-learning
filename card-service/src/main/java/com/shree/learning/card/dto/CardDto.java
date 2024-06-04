package com.shree.learning.card.dto;

import lombok.*;

@Data
public class CardDto {
    private String mobileNumber;
    private String cardNumber;
    private String cardType;
    private Double totalLimit;
    private Double amountUsed;
    private Double availableAmount;
}
