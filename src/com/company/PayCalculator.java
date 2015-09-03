package com.company;

import java.math.BigDecimal;
import java.util.Scanner;
import java.math.MathContext;

public abstract class PayCalculator {
    static BigDecimal payRate;
    MathContext mathContext = new MathContext(8);
    // Limited to six figure incomes with two decimal places.
    // Rounds up to avoid underpayment.

        PayCalculator(BigDecimal payRate) {
        this.payRate = payRate; }

        BigDecimal computePay(double hours) {
        System.out.println("Earnings at Regular Pay Rate: $"
                + payRate.multiply(new BigDecimal(hours), mathContext).setScale(2, BigDecimal.ROUND_HALF_UP));
                return payRate; }

public static void main (String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter pay rate: ");
        double pRate = keyboard.nextDouble();
        payRate = new BigDecimal(pRate);

    System.out.println("Enter hours worked: ");
    double hours = keyboard.nextDouble();

    HazardPay h1 = new HazardPay(payRate) {
        @Override // This was auto generated
        BigDecimal computePay(double hours) {
            return super.computePay(hours); } };

    h1.computePay(hours);

    RegularPay r1 = new RegularPay(payRate) {
        @Override
        BigDecimal computePay(double hours) {
            return super.computePay(hours); } };

    r1.computePay(hours);
} }