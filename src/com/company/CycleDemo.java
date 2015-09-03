package com.company;

import java.util.Scanner;
public class CycleDemo {

    public static void main(String[] args) {

        int weight, numberOfWheels;
        String request;

// Creates object:
        System.out.println("Enter the number of wheels on the vehicle: ");
        Scanner keyboard = new Scanner(System.in);
        numberOfWheels = keyboard.nextInt();

        System.out.println("Enter the vehicle's weight: ");
        weight = keyboard.nextInt();

// Allows the user a chance to edit the created object:
        System.out.println("Enter 'Edit' to change vehicles weight and number of wheels.\n" +
                "Or enter 'Display' to see the current values for your vehicle.");
        request = keyboard.next();
        Cycle biCycle = new Cycle(numberOfWheels, weight);

        if (request.equalsIgnoreCase("edit")) {
            System.out.println("Enter new number of wheels: ");
            numberOfWheels = keyboard.nextInt();
            System.out.println("Enter new weight: ");
            weight = keyboard.nextInt();

            Cycle newCycle = new Cycle(numberOfWheels, weight);
            System.out.println(newCycle.toString()); }

        else { System.out.println(biCycle.toString()); } } }