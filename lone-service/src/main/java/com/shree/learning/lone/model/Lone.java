package com.shree.learning.lone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lone {
    @Id
    @Column(name = "id", nullable = false)
    private Long LoneId;
    private String loneType;
    private String phoneNumber;
    private Double totalLone;
    private Double amountPaid;
    private Double outStandingAmount;
}
