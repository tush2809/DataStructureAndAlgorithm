import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortProblem {
    public static void main(String[] args) {

       /*  int[] input={3,5,2,1,4};
         cyclicSort(input);
        System.out.println(Arrays.toString(input));*/

        /*int[] input = {3,0,1};
        System.out.println(missingNumber(input));*/

        /*int[] input ={4,3,2,7,8,2,3,1};
        int[] input ={1,1};
        System.out.println(findAllNumberDisAppearedFromAnArray(input));*/

        /*int[] input = {1,2,3,4,2};
        int[] input={1,1,3,4,2};
        System.out.println(findDuplicatesInAnArray(input));*/

        /*int[] input ={4,3,2,7,8,2,3,1};
        int[] input ={1,1,2};
        int[] input ={1};
        System.out.println(findAllDuplicatesInAnArray(input));*/

        /*int[] input={1,2,2,4};
        int[] input={1,1};
        System.out.println(setMismatch(input));*/

        /*int[] input ={3,4,-1,1};
        int[] input ={0,1,2};
        System.out.println(firstMissingPositive(input));*/


    }




    static void cyclicSort(int []input){
         int i=0;
         while (i<input.length){
              int correctIndex=input[i]-1;
             if (input[correctIndex]!=input[i]){
                 int temp=input[correctIndex];
                 input[correctIndex]=input[i];
                 input[i]=temp;
             }else {
                 i++;
             }
         }
     }

    private static void swap(int[] input,int x, int y){
        int temp=input[x];
        input[x]=input[y];
        input[y]=temp;
    }

      static int missingNumber(int[] input){
        int i=0;
          while (i<input.length){
               int correctIndex=input[i];
              if (correctIndex>=input.length){
                   i++;
                   continue;
              }

              if (input[correctIndex]!=input[i]){
                  swap(input,correctIndex,i);
              }else {
                  i++;
              }
          }
          int j = 0;
          for (j = 0; j < input.length; j++) {
              if (input[j]!=j){
                  return j;
              }
          }
          return j;
      }


       static List<Integer> findAllNumberDisAppearedFromAnArray(int[] input){
           int i=0;
           while (i<input.length){
                int correctIndex= input[i]-1;
                if (input[correctIndex]!=input[i]){
                    swap(input,correctIndex,i);
                }else {
                    i++;
                }
           }
         List<Integer> output = new ArrayList<>();
           for (int j = 0; j < input.length; j++) {
                if (input[j]!=(j+1)){
                      output.add((j+1));
                }
           }
           return output;
       }

       static int findDuplicatesInAnArray(int[] input){
            int i=0;
             while (i<input.length){
                 int correctIndex=input[i]-1;
                 if (input[correctIndex]!=input[i]){
                      swap(input,correctIndex,i);
                 }else {
                     i++;
                 }
             }
             return input[input.length-1];
       }

    private static List<Integer> findAllDuplicatesInAnArray(int[] input) {

        int i=0;

         while (i<input.length){
              int correctIndex=input[i]-1;
              if (input[correctIndex]!=input[i]){
                    swap(input,correctIndex,i);
              }else {
                  i++;
              }
         }
        List<Integer> output = new ArrayList<>();
        for (int j = 0; j < input.length; j++) {
            if (input[j]!= (j+1)){
                 output.add(input[j]);
            }
        }
        return output;
    }

    //find repetating and missing number
    private static List<Integer> setMismatch(int[] input) {

        int i=0;

        while (i<input.length){
            int correctIndex=input[i]-1;
            if (input[correctIndex]!=input[i]){
                swap(input,correctIndex,i);
            }else {
                i++;
            }
        }
        List<Integer> output = new ArrayList<>();
        for (int j = 0; j < input.length; j++) {
            if (input[j]!= (j+1)){
                output.add(input[j]);
                output.add(j+1);
            }
        }
        return output;
    }

    private static int firstMissingPositive(int[] input) {
        int i=0;
        while (i<input.length){
            int correctIndex=input[i];
            if (correctIndex<0){
                i++;
                continue;
            }
            if (correctIndex>input.length-1){
                i++;
                continue;
            }
            if (input[correctIndex]!=input[i]){
                swap(input,correctIndex,i);
            }else {
                i++;
            }
        }
        for (int j = 0; j < input.length; j++) {
            if (input[j]<input.length-1 && input[j]!=j){
                return j;
            }
        }
        return input.length;
    }

}


