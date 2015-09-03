/* The string is shuffled Define the method encode so that the message is shuffled numberOfShuffle times.
   To perform one shuffle, split the message in half and then take characters from each half alternately.
   For example, if the message is abcdefghi, the halves are abcde and fghi. The shuffled message is
   afbgchdie. (Hint: You may wish to define a private method that performs one shuffle.) */

package com.company;

public class ShuffleCipher implements MessageEncoder {
    int n;

    public ShuffleCipher(int n) {
        this.n = n; }

    public String encode(String plainText) {
        char[] cipherOut = plainText.toCharArray();

        for (int i = 0; i < cipherOut.length; i++) {
            if (Character.isLetter(cipherOut[i])) {
                System.out.print(cipherOut[i]); } }



        return "";
    } }



/*

public class ShuffleCipher implements MessageEncoder {
    int numberOfShuffle;

    public ShuffleCipher(int numberOfShuffle) {
     this.numberOfShuffle = numberOfShuffle; }

    public String encode(String plainText) {
        char[] cipherOut = plainText.toCharArray();
        char[] firstHalf = new char[cipherOut.length / 2];
        char[] secondHalf = new char[cipherOut.length / 2];

        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = cipherOut[i]; }

        for (int i = 0; i < secondHalf.length; i++) {
            secondHalf[i] = ++cipherOut[i];
        }

        System.out.println(Arrays.toString(firstHalf));
        System.out.println(Arrays.toString(secondHalf));

        System.out.println(Arrays.toString(cipherOut));

        return null;

    } }

    /* public String shuffler(String message) {
        String cipher ="";
        String newMessage[];

            newMessage = message.split("", -1);
            System.out.println(newMessage.length);

        for (int i = 0; i<(newMessage.length/2); i++) {
            String temp = newMessage[i+2];
            newMessage[i+2] = newMessage[(newMessage.length/2)+1];
        }
        return cipher;
    }  */

