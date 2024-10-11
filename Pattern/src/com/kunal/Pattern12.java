package com.kunal;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Pattern12 {
    public static void main(String[] args) {
         /*
                    * * * * *
                     * * * *
                      * * *
                       * *
                        *
                       * *
                      * * *
                     * * * *
                    * * * * *
          */

        int n=5; int space=0;
        for (int i = 0; i < 2*n-1; i++) {
            int stars = i>=n ? n-space+1:n-i;
            space =n-stars;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
