package com.striver;

import java.util.*;

public class MediumArraysProblem {


    public static void main(String[] args) {
        /*int[] intputArray = {2,6,5,8,11};
        System.out.println(findTwoSum(intputArray,14));
        System.out.println(findTwoSumByHashing(intputArray,14));
        System.out.println(findTwoSumByUsingTwoPointApproach(intputArray,8));*/


        /*int[] inputArray = {0,1,2,0,1,2,1,2,0,0,0,1};
              //This problem is solved in any sorting technique but TL is in merger sort is  0(nlogn)that's why this is Brute force approach
        System.out.println(Arrays.toString(SortAnArrayOf0s1sAnd2s(inputArray)));
        System.out.println(Arrays.toString(SortAnArrayOf0s1sAnd2sUsingDeutcheNationalFlagAlgorithm(inputArray)));*/

       /* int[] inputArray = {2,2,3,3,1,2,2};
        System.out.println(majorityElementsGreaterThanNBy2Times(inputArray));
        System.out.println(majorityElementsGreaterThanNBy2TimesUsingHashing(inputArray));
        int[] inputArray = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majorityElementsGreaterThanNBy2TimesUsingMooresVotingAlgorithm(inputArray));*/

       // int[] input = {-2,-3,4,-1,-2,1,5,-3};
        //System.out.println(maximumSubArraySum(input));
        //System.out.println(maximumSubArraySumWithBetterApproach(input));
        //System.out.println(Arrays.toString(maximumSubArraySumUsingKadanesAlgorithm(input)));

      /*  int[] input={1 ,2 ,3,4};
        int[] input = {2, 100, 150, 120};
        System.out.println(bestTimeToStockBuyAndSellBrute(input));
        System.out.println(bestTimeToStockBuyAndSell(input));*/

        /*int[] input = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArrayElementsBySignWithBruteForce(input)));
        System.out.println(Arrays.toString(rearrangeArrayElementsBySign(input)));*/

        /*int[] input = {3,1,-6,5,7,4,2,-8,-9};
        System.out.println(Arrays.toString(rearrangeArrayElementsBySignWithSecondVariant(input)));*/

        /*int[] input = {1,2,3,4,5};
        leadersInAnArray(input);
        leadersInAnArrayByOptimalApproach(input);*/

        /*int[] input = {102,4,100,1,101,3,2,1,1};
        System.out.println(longestConsecutiveSequence(input));
        int[] input= {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(longestConsecutiveSequenceWithBetterApproach(input));
        int[] input={102,4,100,1,101,3,2,1,1};
        System.out.println(longestConsecutiveSequenceWithOptimalApproach(input));*/

        /*int[][] inputArray = new int[][]{
                {1,1,1,1},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };
        System.out.println(Arrays.deepToString(setMatrixWithZero(inputArray)));
        int[][] inputArray = new int[][]{
                {1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {1,0,0,1}
        };
        System.out.println(Arrays.deepToString(setMatrixWithZeroWithBetterApproach(inputArray)));*/

        int[][] inputArray = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        //System.out.println(Arrays.deepToString(rotateMatrixBy90Degrees(inputArray)));
        System.out.println(Arrays.deepToString(rotateMatrixBy90DegreesWithOptimalApproach(inputArray)));

    }
    // Brute Force Approach
     static String findTwoSum(int[] inputArray,int target){
         for (int i = 0; i < inputArray.length; i++) {
             for (int j = i+1; j < inputArray.length; j++) {
                 if (inputArray[i]+inputArray[j]==target){
                      return "YES";
                 }
             }
         }
         return "NO";
     }

     // Better Approach
     static String findTwoSumByHashing(int[] input, int target){
          // Index value  and Index Position
         Map<Integer,Integer> hashing = new HashMap<>();
         for (int i = 0; i < input.length; i++) {
              int temp = target - input[i];
              if(hashing.containsKey(temp)){
                  return "YES";
              }
              hashing.put(input[i],i);
         }
             return "NO";
     }

     //Optimal Approach (Greedy Approach)
    static String findTwoSumByUsingTwoPointApproach(int[] input, int target){
        int i=0; int j=input.length-1;
        // {2,5,6,8,11}
         /* Here we need to sort the array because
                if our sum is less than target we need to value increase (i++) and
                       if our sum is more than target we need to value decrease (j--) this thing is more efficient

                       */
        Arrays.sort(input);
        while (i<=j){
            int sum = input[i] + input[j];
              if(sum != target){
                      if(sum<target){
                           i++;
                      }else {
                          j--;
                      }
              }else {
                  return "YES";
              }
        }
        return "NO";
    }

     // Better Approach (2n)
    static int[] SortAnArrayOf0s1sAnd2s(int[] inputArray) {
        int count0=0; int count1=0; int count2=0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i]==0){
                count0++;
            } else if (inputArray[i]==1) {
                count1++;
            }else {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            inputArray[i] = 0;
        }

        for (int i = count0; i <count0+count1; i++) {
             inputArray[i]=1;
        }

        for (int i = count0+count1; i < inputArray.length; i++) {
            inputArray[i] =2;
        }
         return inputArray;
    }

    // Optimal Approach using Dutch national Flag  algorithm (3 Pointer Approach)
    static int[] SortAnArrayOf0s1sAnd2sUsingDeutcheNationalFlagAlgorithm(int[] inputArray) {

        int low=0; int mid=0; int high = inputArray.length-1;

        while (mid<=high){
            if(inputArray[mid]==0){
                int temp=inputArray[low];
                 inputArray[low]=inputArray[mid];
                 inputArray[mid]=temp;
                 mid++;
                 low++;
            } else if (inputArray[mid]==2) {
                int temp=inputArray[high];
                inputArray[high]= inputArray[mid];
                inputArray[mid]=temp;
                high--;
            }else {
                mid++;
            }
        }

        return inputArray;
    }

    //Brute Force Approach
     static int majorityElementsGreaterThanNBy2Times(int[] inputArray) {

         for (int i = 0; i < inputArray.length; i++) {
             int count=0;
             for (int j = i; j < inputArray.length; j++) {
                  if(inputArray[i]==inputArray[j]){
                       count++;
                  }
             }
             if(count>(inputArray.length/2)){
                  return inputArray[i];
             }
         }
         return 0;
    }

    // Better Approach
   static int majorityElementsGreaterThanNBy2TimesUsingHashing(int[] inputArray){
         HashMap<Integer, Integer> hash = new HashMap<>();
       for (int i = 0; i < inputArray.length; i++) {
           //hash.put(inputArray[i], hash.getOrDefault(inputArray[i], 0) + 1);
           if (hash.containsKey(inputArray[i])) {
               hash.put(inputArray[i], hash.get(inputArray[i]) + 1);
           } else {
               hash.put(inputArray[i], 1);
           }
       }

       for (Map.Entry<Integer,Integer> hashing: hash.entrySet()){
            if(hashing.getValue()> (inputArray.length/2)){
                 return hashing.getKey();
            }
       }
       return 0;
   }

   //Optimal Approach Using Moore’s Voting Algorithm
   static int majorityElementsGreaterThanNBy2TimesUsingMooresVotingAlgorithm(int[] inputArray){

    int element=0; int count=0;
       for (int i = 0; i < inputArray.length; i++) {
           if (count==0){
                 count++;
                 element=inputArray[i];
           }
           if(element==inputArray[i]){
                count++;
           }else {
                count--;
           }
       }
       int secondcounter =0;
       for (int i = 0; i < inputArray.length; i++) {
           if(element==inputArray[i]){
            secondcounter++;
           }

           if (secondcounter>(inputArray.length/2)){
                 return element;
           }
       }
       return -1;
    }

    //Brute Force Approach 0(n3)
    static int maximumSubArraySum(int[] inputArray){
          int sum=0;  int maxi =Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < inputArray.length; j++) {
                sum=0;
                for (int k = i; k <=j; k++) {
                      sum += inputArray[k];
                }
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }

    //Better approach 0(n2)
    static int maximumSubArraySumWithBetterApproach(int[] inputArray){
        int sum=0;  int maxi =Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            sum=0;
            for (int j = i; j < inputArray.length; j++) {
               sum += inputArray[j];
               maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }

    //Optimal Approach using Kadane's Algorithm
    static int[] maximumSubArraySumUsingKadanesAlgorithm(int[] inputArray){
        int sum= 0; int maxi=Integer.MIN_VALUE; int start=0; int end=inputArray.length-1;
        int [] array = new int[start+end]; int ansStart=0;
        for (int i = 0; i < inputArray.length; i++) {
            sum +=inputArray[i];
            if(maxi<sum){
                maxi=sum;
                ansStart=start;
                end=i;
            }
            if(sum<0){
                sum=0;
            }

            if(sum==0){
                start=i+1;
            }
        }
        int count=0;
        for (int i = ansStart; i <=end ; i++) {
            array[count]=inputArray[i];
            count++;
        }
        return array;
    }

      static int bestTimeToStockBuyAndSellBrute(int[] inputArray){
            int maxProfit=0;
          for (int i = 0; i < inputArray.length; i++) {
              for (int j = i+1; j < inputArray.length; j++) {
                     int profit = inputArray[j] - inputArray[i];
                     maxProfit=Math.max(profit,maxProfit);
              }
          }
          return maxProfit;
      }

        //Optimal Approach
        static int bestTimeToStockBuyAndSell(int[] inputArray){
                 int maxProfit=0;
                 int sum=0;  int mini=inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                  int profit=inputArray[i] - mini;
                  mini=Math.min(mini,inputArray[i]);
                maxProfit=Math.max(profit,maxProfit);
            }
          return maxProfit;
        }


    static int[] rearrangeArrayElementsBySignWithBruteForce(int[] input){

        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if(input[i]>0){
                 posList.add(input[i]);
            }else {
                negList.add(input[i]);
            }
        }
        for (int i = 0; i < input.length/2; i++) {
              input[2*i] = posList.get(i);
              input[2*i+1] = negList.get(i);
        }
     return input;
    }

    //Optimal Approach
    static int[] rearrangeArrayElementsBySign(int[] input){
        int[] array = new int[input.length];
        int posIndex=0;  int negIndex=1;
        for (int i = 0; i < input.length; i++) {
            if(input[i]>0){
                 array[posIndex] = input[i];
                 posIndex +=2;
            }else {
                 array[negIndex] = input[i];
                 negIndex+=2;
            }
        }
         return array;
    }


    // Rearrange Array Elements By Sign By Second Varient
    static int[] rearrangeArrayElementsBySignWithSecondVariant(int[] input){

        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for (int i = 0; i <input.length; i++) {
            if(input[i]>0){
                 posList.add(input[i]);
            }else {
                negList.add(input[i]);
            }
        }
        int i =0; boolean isPos=false; int index=0;
        if(posList.size()>=negList.size()){
            index=posList.size()-negList.size();
            isPos=true;
            for (i = 0; i < negList.size(); i++) {
                input[2*i] = posList.get(i);
                input[2*i+1] = negList.get(i);
            }
        }else {
            index=negList.size()-posList.size();
            for (i =0; i < posList.size(); i++) {
                input[2*i] = posList.get(i);
                input[2*i+1] = negList.get(i);;
            }
        }
        if(isPos){
            int posIndex=negList.size()*2;
            for (int j = i; j < input.length-(negList.size()); j++) {
                input[posIndex] = posList.get(j);
                posIndex++;
            }
        }else {
            int negIndex=posList.size()*2;
            for (int j = i; j < input.length-(posList.size()); j++) {
                input[negIndex] = negList.get(j);
                negIndex++;
            }
        }

        return input;
    }
    // Brute Force Approach
    static void leadersInAnArray(int[] input){

       for (int i = 0; i < input.length; i++) {
           boolean isLeader= true;
           for (int j = i+1; j <input.length; j++) {
               if(input[i]<input[j]){
                   isLeader=false;
                     break;
               }
           }
           if(isLeader)
               System.out.print(input[i] + " ");

       }
   }

   static void leadersInAnArrayByOptimalApproach(int[] input){
      int max = input[input.length-1];
       System.out.print(max + " ");
       for (int i = input.length-2; i>=0; i--) {
           if (max<input[i]){
               max=input[i];
               System.out.print(max + " ");
           }
       }
   }

   //Brute Force Approach
   static int longestConsecutiveSequence(int[] input){
         int longest=1; int count=0;int x=0;
       for (int i = 0; i < input.length; i++) {
           count=1;
           x=input[i];
           while (linearSearch(input,x+1)){
                x +=1;
                count++;
           }
           if(longest<count){
               longest=count;
           }
       }
       return longest;
   }

    private static boolean linearSearch(int[] input, int x) {
        for (int j = 0; j < input.length; j++) {
              if (x==input[j]){
                   return true;
              }
        }
        return false;
    }

    //Better Approach
    static int longestConsecutiveSequenceWithBetterApproach(int[] input){

        List<Integer> list = new ArrayList<>();
        for (int i : input) {
            list.add(i);
        }
        Collections.sort(list);

         int longest=1; int count=1;
        for (int i = 0; i < list.size()-1; i++) {
               int x=list.get(i);
               if ((x+1) ==  list.get(i+1)){
                     count++;
               }else if(x < list.get(i+1)){
                    if(longest<count){
                        longest=count;
                    }
                    count=1;
               }
        }
        return longest;
    }

    // Optimal Approach (TC = O(3N) & SC= O(N))
    static int longestConsecutiveSequenceWithOptimalApproach(int[] input) {
          LinkedHashSet<Integer> integers = new LinkedHashSet<>();
          for(int i:input){
              integers.add(i);
          }
         int count=1; int longest=1;
          for(int i : integers){
                if(!integers.contains(i-1)){
                      int temp = i;
                    while (integers.contains((temp+1))) {
                        count++;
                        temp = temp+1;
                        if (longest < count) {
                            longest = count;
                        }
                    }
                    count=1;
                }
          }
        return longest;
    }
     //Brute Force Approach (row*col) * (row+col) * (row*col) == N3
     static int[][] setMatrixWithZero(int[][] array){
         for (int row = 0; row < array.length; row++) {
             for (int col = 0; col< array.length; col++) {
                 if(array[row][col]==0){
                     markTheRows(row,array);
                     markTheCols(col,array);
                 }
             }
         }

         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array.length; j++) {
                   if(array[i][j] == (-1)){
                        array[i][j] = 0;
                   }
             }
         }

         return array;
     }

    private static void markTheCols(int col,int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][col]!=0){
                 array[i][col]=-1;
            }
        }
    }

    private static void markTheRows(int row,int[][] array) {
        for (int i = 0; i < array.length; i++) {
                if(array[row][i] != 0){
                       array[row][i]=-1;
                }
        }
    }

    //Better Approach TC => 0(2*i*j) & SC => O(i)+O(j)
    static int[][] setMatrixWithZeroWithBetterApproach(int[][] array){

          int[] row = new int[4];
          int[] col = new int[4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                 if(array[i][j]==0){
                      row[i]=1;
                      col[j]=1;
                 }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    //Optimal Approach
    static int[][] setMatrixWithZeroWithOptimalApproach(int[][] array){

        return null;
    }

    //Brute Force Approach
    static int[][] rotateMatrixBy90Degrees(int[][] input){
           int[][] newArray = new int[4][4];
           int count = input.length-1;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j <input.length ; j++) {
                  newArray[j][count] = input[i][j];
            }
            count--;
        }
        return newArray;
    }

    //Optimal Approach
    static int[][] rotateMatrixBy90DegreesWithOptimalApproach(int[][] input){

        for (int i = 0; i < input.length-1; i++) {
            for (int j = i+1; j < input.length; j++) {
                 int temp=input[j][i];
                  input[j][i]= input[i][j];
                  input[i][j]=temp;
            }
        }

        for (int i = 0; i < input.length; i++) {
            int p1=0;
            int p2=input[i].length-1;
            while (p1<p2){
                int temp = input[i][p1];
                input[i][p1] = input[i][p2];
                input[i][p2] = temp;
                p1++;
                p2--;
            }
        }

        return input;

    }
   
     
     





}
