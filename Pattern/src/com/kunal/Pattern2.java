package com.kunal;

public class Pattern2 {
    public static void main(String[] args) {

         /*
              *
              * *
              * * *
              * * * *
              * * * * *
          */
          int  n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("==============================");

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
