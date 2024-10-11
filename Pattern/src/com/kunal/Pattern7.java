package com.kunal;

public class Pattern7 {
    public static void main(String[] args) {

           /*
                                         Space stars Space
                     *                     4     1     4
                   * * *                   3     3     3
                 * * * * *                 2     5     2
               * * * * * * *               1     7     1
             * * * * * * * * *             0     9     0
            */

        int n =5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
