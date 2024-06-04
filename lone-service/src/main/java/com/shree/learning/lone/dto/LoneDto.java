package com.shree.learning.lone.dto;

import lombok.*;

@Data
public class LoneDto {
    private String loneType;
    private String phoneNumber;
    private Double totalLone;
    private Double amountPaid;
    private Double outStandingAmount;
}
