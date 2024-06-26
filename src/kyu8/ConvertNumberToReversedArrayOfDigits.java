package kyu8;

import java.util.Arrays;


public class ConvertNumberToReversedArrayOfDigits {
    public static void main(String[] args) {
        int[] test1 = digitize(654321);
        int[] test2 = digitize2(123456789);

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));

    }
    // Solution 1
    private static int[] digitize(long n) {
        String temp = Long.toString(n);
        int[] newGuess = new int[temp.length()];

        for (int i = temp.length() - 1, k = 0; i >= 0; i--) {
            newGuess[k++] = temp.charAt(i) - '0';
        }

        return newGuess;
    }

    // Solution 2
    private static int[] digitize2(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
