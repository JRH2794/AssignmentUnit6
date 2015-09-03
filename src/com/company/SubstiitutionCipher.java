package com.company;

import java.util.Arrays;

public class SubstiitutionCipher implements MessageEncoder {

    int shift;

    public SubstiitutionCipher(int shift) {
        this.shift = shift; }

    public String encode(String plainText) {
            char[] cipherOut = plainText.toCharArray();
                for (int i = 0; i < cipherOut.length; i++) {
                    if (Character.isLetter(cipherOut[i])) {
                        cipherOut[i] += cipherOut[i] + shift - cipherOut[i];
                    } }
            System.out.print(Arrays.toString(cipherOut));

        return null;  } }
