package com.company;

import java.math.BigDecimal;

public abstract class HazardPay extends PayCalculator {

    HazardPay(BigDecimal payRate) {
        super(payRate); }

    BigDecimal computePay(double hours) {
        System.out.println("Earnings at Hazard Pay Rate: $"
                + payRate.multiply(new BigDecimal(hours)).multiply(new BigDecimal(1.5), mathContext).setScale(2, BigDecimal.ROUND_HALF_UP));
        return payRate.multiply(new BigDecimal(hours)).multiply(new BigDecimal(1.5)) ;
    } }
