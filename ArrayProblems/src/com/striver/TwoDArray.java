package com.striver;

public class TwoDArray {

    public static void main(String[] args) {

          int[][] twoDArrays = new int[][]{
                  {1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}
          };

        for (int row = 0; row < twoDArrays.length; row++) {
            for (int col = 0; col < twoDArrays.length; col++) {
                System.out.println(twoDArrays[row][col]);
            }
        }

        int[][] twoArrays = {
                {1,2,3,4},
                {5,6,7},
                {9,10,11},
                {13,14}
        };

        twoArrays[2][1] =100;
        twoArrays[3] = new int[] {13,14,0};
        twoArrays[3][2]=100;
        for (int row = 0; row < twoArrays.length; row++) {
            for (int col = 0; col < twoArrays[row].length; col++) {
                System.out.println(twoArrays[row][col]);
            }
        }


    }
}
