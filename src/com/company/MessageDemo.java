package com.company;

public class MessageDemo {

    public static void main (String[] args) {

        System.out.println("Substitution Cipher: (entered 'Substitutions' with a shift of 4)");
        SubstiitutionCipher Sub1 = new SubstiitutionCipher(4);
        Sub1.encode("Substitutions");

        System.out.println("\n\nShuffle Cipher: (entered 'Shuffles' with a shuffle of 1)");
        ShuffleCipher Suf1 = new ShuffleCipher(1);
        System.out.println(Suf1.encode("Shuffles"));

     } }
