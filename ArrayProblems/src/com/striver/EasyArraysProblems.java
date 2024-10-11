package com.striver;

import java.util.*;

public class EasyArraysProblems {
    public static void main(String[] args) {
        //int[] input = {1,2,3,4,5,6,88,95,66,74};
        //int[] input = {1,2,3,4,5,6};

        //System.out.println(maxElement(input));
        //System.out.println(secondMaxElement(input));
        //System.out.println(checkArrayIsSorted(input));

        //int[] input = {1,1,2,2,2,3,3};
        //System.out.println(removeDuplicatedFromSortedArray(input));

        //System.out.println(Arrays.toString(arrayRotateLeftByOnePlace(input)));

       // System.out.println(Arrays.toString(arrayRotateLeftByKthPlace(3,input)));
       // System.out.println(Arrays.toString(optimalApproachForArrayRotateLeftByKthPlace(2,input)));

        /*int[] input = {1 ,0,2,3,2,0,0,4,5,1};
        System.out.println(Arrays.toString(movesZeroToEnd(input)));
        System.out.println(Arrays.toString(movesZerosToEndUsingTwoPointApproach(input)));*/

        /*int[] input = {1,3,4,5,6,7};
        int[] input2 = {1,2,3,6,7,8};
        int[] input = {1,2,2,3,3,4,5,6};
        int[] input2 = {2,3,3,5,6,6,7};
        System.out.println(Arrays.toString(unionOfTwoArrayWithBruteForceApproach(input,input2)));
        System.out.println(unionOfTwoArrayWithTwoPointerApproach(input,input2));
        System.out.println(intersectionOfTwoArrays(input,input2));*/

        /*int[] input = {1,2,4,5,6};
        System.out.println(missingNumber(input));
        System.out.println(missingNumberUsingHashing(input));
        System.out.println(missingNumberWithSumOfDigit(input));
        System.out.println(missingNumberWithXOR(input,6));*/

        /*int[] input = {1,1,0,0,1,1,1,1,0,1,1,1};
        System.out.println(numberOfConsecutiveOnceInAnArray(input));*/

        int[] input = {1,1,2,2,3,3,5,4,4};
        //System.out.println(findNumberThatAppearsOnceInArray(input));
        System.out.println(findNumberThatAppearsOnce(input));


    }



    static int maxElement(int[] array){

        int max=array[0];
        for (int i = 1; i < array.length; i++) {
             if(max<array[i]){
                 max=array[i];
             }
        }

        return max;
    }

    static int secondMaxElement(int[] array){
        int max=array[0];  int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i <array.length; i++) {
            if(max<array[i]){
                secondMax=max;
                max=array[i];
            }else if(array[i]<max && secondMax<array[i]){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    static boolean checkArrayIsSorted(int[] inputArray){
        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] > inputArray[i + 1]) {
                return false;
            }
        }
         return true;
    }

    static int removeDuplicatedFromSortedArray(int[] inputArray){
        int j=0;
        for (int i = 1; i < inputArray.length; i++) {
                   if (inputArray[j]!=inputArray[i]){
                             inputArray[j+1]=inputArray[i];
                             j++;
                   }
        }
        return j+1;
    }

    static int[]  arrayRotateLeftByOnePlace(int[] inputArray){

        int temp=inputArray[0];
        for (int i = 1;i <inputArray.length ; i++) {
              inputArray[i-1]=inputArray[i];
        }
        inputArray[inputArray.length-1]=temp;

        return inputArray;
    }


    //Brute Force Approach
    static int[] arrayRotateLeftByKthPlace(int k, int[] inputArray){
        k =k>inputArray.length?inputArray.length%k:k;
         int[] temp= new int[k];
        for (int i = 0; i < k; i++) { // TC => 0(K)
            temp[i]=inputArray[i];
        }
        for (int i = k; i < inputArray.length; i++) { // TC => 0(K-D)
              inputArray[i-k] = inputArray[i];
        }

        for (int i = 0; i < temp.length; i++) { // TC => 0(k)
             inputArray[inputArray.length-k+i]=temp[i];
        }

        // Total =0(k) + 0(n-k) + 0(k) = 0(n+d)
        // SC => 0(d)
        return inputArray;
    }

    //Optimal Approach for arrayRotateByKthPlace
    static int[] optimalApproachForArrayRotateLeftByKthPlace(int k, int[] inputArray){

          reverseArray(inputArray,0,k);
          reverseArray(inputArray,k+1,inputArray.length-1);
          reverseArray(inputArray,0,inputArray.length-1);
          return inputArray;
    }

    private static void reverseArray(int[] inputArray, int start, int end) {
        while (start<=end){
            int temp = inputArray[end];
            inputArray[end] = inputArray[start];
            inputArray[start] = temp;
            start++;
            end--;
        }
    }

    static int[] movesZeroToEnd(int[] inputArray){
      int count = inputArray.length-1;
        for (int i = 0; i < count; i++) {
            if (inputArray[i]==0){
                 int temp=inputArray[count];
                 inputArray[count]=0;
                 inputArray[i] = temp;
                 count--;
            }
        }
        return inputArray;
    }

    static int[] movesZerosToEndUsingTwoPointApproach(int[] inputArray){
          int j=0;
        for (int i = 0; i < inputArray.length; i++) {
               if(inputArray[i]==0){
                    j=i;
                    break;
               }
        }

        for (int i = j+1; i <inputArray.length ; i++) {
              if(inputArray[i]!=0){
                   int temp = inputArray[i];
                   inputArray[j]=temp;
                   inputArray[i]=0;
                   j++;
              }
        }

        return inputArray;
    }


     static int[] unionOfTwoArrayWithBruteForceApproach(int[] inputArray, int[] inputArray2){

         Set<Integer> uniqueElements = new HashSet<>();

         for (int i = 0; i < inputArray2.length; i++) {
             uniqueElements.add(inputArray2[i]);
         }

         for (int i = 0; i < inputArray.length; i++) {
             uniqueElements.add(inputArray[i]);
         }

         int[]  unique = new int[uniqueElements.size()];
         int i=0;
         for (Integer elements : uniqueElements){
             unique[i++] = elements;
         }
         return unique;
     }

     // unique in both array
    static List<Integer> unionOfTwoArrayWithTwoPointerApproach(int[] inputArray, int[] inputArray2){
        int i=0;
        int j=0;
        List<Integer> unionList = new ArrayList<>();
          while (i< inputArray.length && j<inputArray2.length){
              if(inputArray[i]<=inputArray2[j]){
                   if(unionList.isEmpty() || unionList.getLast()!=inputArray[i]){
                        unionList.add(inputArray[i]);
                   }
                   i++;
              } else  {
                  if(unionList.isEmpty() || unionList.getLast()!=inputArray2[j]){
                       unionList.add(inputArray2[j]);
                  }
                  j++;
              }
          }

          while (inputArray.length>i){
               if(unionList.isEmpty() || unionList.getLast() != inputArray[i]){
                     unionList.add(inputArray[i]);
               }
                 i++;
          }
          while (j<inputArray2.length){
                if (unionList.isEmpty() || unionList.getLast() != inputArray[j]){
                    unionList.add(inputArray[j]);
                }
                j++;
          }
    return unionList;
    }

    static List<Integer> intersectionOfTwoArrays(int[] arrayOne, int[] arrayTwo){
         int i=0;
         int j=0;
         List<Integer> intersection = new ArrayList<>();
         while (i<arrayOne.length && j< arrayTwo.length){
              if(arrayOne[i]==arrayTwo[j]){
                  intersection.add(arrayOne[i]);
                      i++;
                      j++;
              }else if(arrayOne[i]<arrayTwo[j]){
                  i++;
              }else {
                  j++;
              }
         }
         return intersection;
    }

    // 1St Approach
    static int missingNumber(int[] n){
          int temp=0;
        for (int i = 0; i < n.length; i++) {
             temp++;
             if(n[i]==temp){
                 continue;
             }
             return temp;
        }
        return 0;
    }

     //2nd Optimal Approach
    static int missingNumberWithSumOfDigit(int[] input){

        int number = input[input.length-1];
        int realSum = number*(number+1)/2;
        int actualSum=0;

        for (int i = 0; i < input.length; i++) {
             actualSum += input[i];
        }

        return (realSum-actualSum);

    }
   //3rd Optimal Approach
    static int missingNumberWithXOR(int[] input, int n) {
        int expectedXOR = 0;
        int actualXOR = 0;

        // XOR of all numbers from 1 to n-1
        for (int i = 0; i < n - 1; i++) {
            actualXOR ^= input[i];  // XOR of all elements in the array
            expectedXOR ^= (i + 1); // XOR of numbers from 1 to n-1
        }

        // XOR with n to get the full range [1, n]
        expectedXOR ^= n;

        // XOR of the expected and actual XOR values will give the missing number
        return expectedXOR ^ actualXOR;
    }


    //Better Approach
    static int missingNumberUsingHashing(int[] input){
         //1 2 4 5
        int[] hashing = new int[input[input.length-1]+1];
        for (int i = 0; i < input.length; i++) {
              hashing[input[i]] = input[i];
        }
        for (int i = 1; i < hashing.length; i++) {
             if (hashing[i]==0){
                   return i;
             }
        }
        return 0;
    }

    static int numberOfConsecutiveOnceInAnArray(int[] input){
         int count=0;  int max=0;
        for (int i = 0; i < input.length; i++) {
              if(input[i]==1){
                    count++;
                    if(max<count){
                        max=count;
                    }
              }else {
                   count=0;
              }
        }
        return max;
    }

    //Brute Force Approach
    static int findNumberThatAppearsOnceInArray(int[] input){
          int count=0;  int num=0;
        for (int i = 0; i < input.length; i++) {
                num = input[i];
                count=0;
            for (int j = 0; j < input.length; j++) {
                   if (input[j]==num){
                       count++;
                   }
            }
                if(count==1){
                    return num;
                }
        }
          return 0;
    }

    static int findNumberThatAppearsOnce(int[] input){

         int i=0; int j=0; int count=0;
         while (i<input.length&& j<input.length){
             if(input[i]==input[j]){
                 count++;
                 j++;
             }else{
                 if(count==1){
                     return input[i];
                 }
                 count=0;
                  i=j;
             }

         }
       return 0;
    }




}
