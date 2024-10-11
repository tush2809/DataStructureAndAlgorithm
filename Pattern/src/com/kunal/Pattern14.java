package com.kunal;

public class Pattern14 {

    public static void main(String[] args) {
          /*
                            1
                          2 1 2
                        3 2 1 2 3
                      4 3 2 1 2 3 4
                        3 2 1 2 3
                          2 1 2
                            1
           */
        int n =4;

        for (int i = 1; i <=2*n-1 ; i++) {

            int space=n-i;
            int stars=

            if(i<n){
                for (int j = 1; j <=n-i ; j++) {
                    System.out.print(" ");
                }

                for (int j = i; j >=1 ; j--) {
                    System.out.print(j);
                }

                for (int j = 2; j <=i; j++) {
                    System.out.print(j);
                }
            }else {
                for (int j = 1; j <=i-n ; j++) {
                    System.out.print(" ");
                }

                for (int j = 2*n-i; j >=1 ; j--) {
                    System.out.print(j);
                }

                for (int j = 2; j <=2*n-i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }



    }
}
