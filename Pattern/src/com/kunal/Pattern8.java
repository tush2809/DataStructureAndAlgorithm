package com.kunal;

public class Pattern8 {

    /*
                                     Space   Star   Space
           * * * * * * * * *           0       9      0
             * * * * * * *             1       7      1
               * * * * *               2       5      2
                 * * *                 3       3      3
                   *                   4       1      4

     */

    public static void main(String[] args) {
      int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }

            for (int j = 0;j<2*(n-i)-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
