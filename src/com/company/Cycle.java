package com.company;

public class Cycle {
    private double numberOfWheels, weight;

    public Cycle() { // Default using 'this'.
        this(0, 0); }

    public Cycle(int nNumberOW, int nWeight) {
        numberOfWheels = nNumberOW;
        weight = nWeight; }

    public String toString() {
        return "Weight: " + weight + "\n" +
                "Number of Wheels: " + numberOfWheels; } }
