package com.kunal;

public class Pattern4 {
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
        for (int i = 1; i <=(2*5)-1; i++) {
          int stars=i;
              if(i>n)
                  stars=2*n-i;

            for (int j = 1; j <=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
