package com.kunal;

public class Pattern11 {
    public static void main(String[] args) {

         /*
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
                 * * * *
                  * * *
                   * *
                    *
          */


         int n=5;
        for (int i = 0; i <2*n; i++) {
            int stars=i>n ? 2 * n-i:i;
            int spaces=n-stars;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0;j < stars ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
