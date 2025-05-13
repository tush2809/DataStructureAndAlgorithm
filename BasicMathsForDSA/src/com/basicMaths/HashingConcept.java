package com.basicMaths;

import java.util.Arrays;
import java.util.Scanner;

public class HashingConcept {
    public static void main(String[] args) {;
        Scanner  scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {
            numberArray[i] = scanner.nextInt();;
        }
        System.out.println(Arrays.toString(numberArray));
        int[] hash = new int[13];
        for (int i = 0; i < numberArray.length; i++) {
            hash[numberArray[i]] +=1;
        }
        System.out.println(Arrays.toString(hash));
        int q;
        q = scanner.nextInt();
        while (q-- != 0) {
            int number = scanner.nextInt();
            System.out.println(hash[number]);
        }

    }

}
