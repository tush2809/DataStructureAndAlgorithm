import java.util.*;

public class EasyArrayProblem {
    public static void main(String[] args) {
        /*int[] input = {1,2,3,4,7,7,5};
        System.out.println(maxElement(input));
        System.out.println(secondMaxElement(input));
        System.out.println(secondMaxElementBrute(input));*/

        /*int[] input = {1,2,2,3,3,4,5,6,7};
        System.out.println(isSortedArray(input));*/

        /*int[] input = {1,2,2,3,3,4,5,6,7};
        System.out.println(Arrays.toString(removeDuplicateElementsFromSortedArrayBruteForce(input)));
        System.out.println(removeDuplicateElementsFromSortedArrayOptimal(input));*/

        /*int[] input = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(leftRotateTheArrayByOnePlace(input)));*/

       /* int[] input = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(leftRotateTheArrayByDPlace(input,2)));*/

        /*int[] input = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(leftRotateTheArrayByDPlaceWithOptimalApproach(input,3)));*/

        /*int[] input={1,0,2,3,2,0,0,4,5,1};
        System.out.println(Arrays.toString(movesZeroAtEndBruteForceApproach(input)));
        System.out.println(Arrays.toString(movesZeroAtEndOptimalApproach(input)));*/

       /* int[] arr={1,1,2,3,4,5};
        int[] arr1={2,3,4,4,5,6};
        System.out.println(Arrays.toString(unionOfTwoSortedArray(arr,arr1)));
        System.out.println(Arrays.toString(unionOfTwoSortedArrayOptimal(arr,arr1)));*/


       /* int[] arr={1,2,2,3,3,4,5,6};
        int[] arr1={2,3,3,5,6,6,7};
        System.out.println(Arrays.toString(intersectionOfTwoArrayOptimal(arr,arr1)));
        System.out.println(Arrays.toString(intersectionOfTwoArray(arr,arr1)));*/

        /*int[] input ={1,2,4,5};
        System.out.println(missingNumberFromAnArray(input));
        System.out.println(missingNumberFromAnArrayBrute(input));
        System.out.println(missingNumberFromAnArrayBetterApproach(input));
        System.out.println(missingNumberFromAnArrayOptimalApproach(input));
        System.out.println(missingNumberWithXOR(input, 6));*/

        /*int[] input ={1,1,0,1,1,1,0,1,1};
        System.out.println(maximumConsecutiveOnce(input));*/

        /*int[] input = {1,1,2,3,3,4,4};
        System.out.println(findElementThatAppearsOnce(input));
        System.out.println(findElementThatAppearsOnceWithBetter(input));
        System.out.println(findElementThatAppearsOnceWithSecondBetter(input));
        System.out.println(findElementThatAppearsOnceOptimal(input));*/


    }
    
    public static int maxElement(int[]  input){
        int max=input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i]>max){
                max=input[i];
            }
        }
        return max;
    }

    // Brute Force Approach  (n log n + O(n))
    public static int secondMaxElementBrute(int[] input){
        int sMax=Integer.MIN_VALUE;

        Arrays.sort(input); // 1 2 3 4 5 7 7
        int max = input[input.length-1];
        for (int i = 0; i < input.length; i++) {
            if(input[i]>sMax && input[i] != max){
                  sMax=input[i];
            }
        }
        return sMax;
    }



    // Better cc => O(n)+O(n)= 2(n)
    public static int secondMaxElementBetter(int[] input){
        int max=input[0];
        int sMax=Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i]>max){
                max=input[i];
            }
        }
        for (int i = 0; i < input.length; i++) {
            if (max!=input[i] && max>sMax){
                sMax=input[i];
            }
        }
        return sMax;
    }


    // Optimal Approach O(n)
    public static int secondMaxElement(int[] input){
        int max=input[0]; int sMax=Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if(input[i]>max){
                sMax=max;
                max=input[i];
            } else if (input[i]<max && input[i]>sMax) {
                sMax=input[i];
            }
        }
        return sMax;
    }



    public static boolean isSortedArray(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            if(input[i]>input[i+1]){
                return false;
            }
        }
        return true;
    }

    //Brute Force Approach
    // TC=> (n log n + O(n)) & SC=> O(n)
    private static int[] removeDuplicateElementsFromSortedArrayBruteForce(int[] input) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }
        int[] output = new int[set.size()];
        int index=0;
        for(int value:set){
            output[index++] = value;
        }
        return output;
    }

    // Optimal Approach
    private static int removeDuplicateElementsFromSortedArrayOptimal(int[] input) {
        int i=0;
        for (int j = 1; j < input.length; j++) {
            if(input[i]!=input[j]){
                input[i+1] = input[j];
                i++;
            }
        }
        return i+1;
    }

    //Optimal (tc=> O(n) && sc=> O(1))
    static int[] leftRotateTheArrayByOnePlace(int[] input){
        int temp = input[0];
        for (int i=1;i<input.length;i++){
               input[i-1]=input[i];
        }
        input[input.length-1]=temp;
        return input;
    }

    // Brute Force approach (TC=> O(d)+O(n-d)+O(d)=O(n+d) & SC=> O(d))
    static int[] leftRotateTheArrayByDPlace(int[] input,int d){
         int[] temp= new int[d];
         int i=0;
        for (i = 0; i < d; i++) {
              temp[i]=input[i];
        }
        for (int j=i; j < input.length; j++) {
            input[j-d] =input[j];
        }
        for (int j=input.length-d;j<input.length;j++){
              input[j]=temp[j-(input.length-d)];
        }
        return input;
    }

    //Optimal approach
    static int[] leftRotateTheArrayByDPlaceWithOptimalApproach(int[] input,int d){
          reverseArray(input,0,d-1);
          reverseArray(input,d,input.length-1);
          reverseArray(input,0,input.length-1);
          return input;
    }

    private static void reverseArray(int[] input, int start, int end) {
        while (start<=end){
            int temp=input[end];
            input[end]=input[start];
            input[start]=temp;
            start++;
            end--;
        }
    }


    //Brute Force Approach (TC=> O(n) + O(x) + O(n-x)=O(2n) & SC=>O(x))
    private static int[] movesZeroAtEndBruteForceApproach(int[] input){

        List<Integer> temp = new ArrayList<>();
        
        for (Integer i:input){
            if(i!=0)
                temp.add(i);
        }

        for (int i = 0; i < temp.size(); i++) {
               input[i]=temp.get(i);
        }

        for (int i = temp.size(); i < input.length; i++) {
              input[i]=0;
        }

        return input;
    }
    
    //Optimal Approach (TC=> O(n) & SC=>O(1))
    private static int[] movesZeroAtEndOptimalApproach(int[] input){
        int i=0; int j=1;
          while (i<=input.length-1 && j<=input.length-1){
                if (input[i]==0 && input[j]!=0){
                    int temp=input[j];
                    input[j]=input[i];
                    input[i]=temp;
                    i++;
                    j++;
                } else if (input[j]==0 && input[i]!=0) {
                    i++;
                    j++;
                }else {
                    j++;
                }
          }
          return input;
    }

    //Brute Force (TC=> O(n1log(n) + O(n2log(n) + O(n1+n2)) & SC => O(n1+n2))
    private static int[] unionOfTwoSortedArray(int[] arr, int[] arr1) {

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!temp.contains(arr[i]))
                temp.add(arr[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            if(!temp.contains(arr1[i]))
                temp.add(arr1[i]);
        }

        int[] tempArray= new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            tempArray[i]=temp.get(i);
        }
        return tempArray;
    }

    //Optimal cc
    private static int[] unionOfTwoSortedArrayOptimal(int[] arr, int[] arr1) {
        List<Integer> temp = new ArrayList<>();
        int i=0; int j=0;
          while (i<=arr.length-1 && j<=arr1.length-1){
              if (arr[i]<=arr1[j]){
                  if (!temp.contains(arr[i])){
                      temp.add(arr[i]);
                  }
                  i++;
              } else if (arr[i]>=arr1[j]) {
                  if (!temp.contains(arr1[j])){
                      temp.add(arr1[j]);
                  }
                  j++;
              }
          }

          while (i<=arr.length-1){
              if (!temp.contains(arr[i])){
                  temp.add(arr[i]);
              }
              i++;
          }

        while (j<=arr1.length-1){
            if (!temp.contains(arr1[j])){
                temp.add(arr1[j]);
            }
            j++;
        }

          int[] outPutArray = new int[temp.size()];
          int k=0;
          for (Integer input: temp){
               outPutArray[k++]=input;
          }
          return outPutArray;
    }

    //Brute Force Approach (TC=> O(n1*n2) & SC=> O(n))
    static int[] intersectionOfTwoArray(int[] a,int[] b){
        List<Integer> interSectionList = new ArrayList<>();
        int[] visiting = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j] && visiting[j]==0){
                    interSectionList.add(a[i]);
                    visiting[j]=1;
                    break;
                }else if (a[i]<b[j]){
                    break;
                }
            }
        }

        int[] outPutArray = new int[interSectionList.size()];
        int k=0;
        for (Integer input: interSectionList){
            outPutArray[k++]=input;
        }
        return outPutArray;
    }


    //Optimal Approach
    static int[] intersectionOfTwoArrayOptimal(int[] a,int[] b){
        List<Integer> interSectionList = new ArrayList<>();
        int i=0; int j=0;
        while (i<= a.length-1 && j<=b.length-1){
             if(a[i]==b[j]){
                 interSectionList.add(a[i]);
                 i++;
                 j++;
             }else {
                  i++;
             }
        }
        int[] outPutArray = new int[interSectionList.size()];
        int k=0;
        for (Integer input: interSectionList){
            outPutArray[k++]=input;
        }
        return outPutArray;
    }


    //Brute Force Approach (TC=> 0(N*N) => O(N2) & SC=>O(1))
    static int missingNumberFromAnArrayBrute(int[] array){
        for (int i = 1; i <=array.length-1; i++) {
            int flag=0;
            for (int j = 0; j < array.length; j++) {
                 if(i==array[j]){
                      flag=1;
                      break;
                 }
            }
            if (flag==0){
                 return i;
            }
        }
      return 0;
    }

    //Better Approach (TC=> O(N)+O(N)=O(2N) & SC=> O(N)))
    static int missingNumberFromAnArrayBetterApproach(int[] input){
        int[] hashing = new int[input[input.length-1]+1];
        for (int i = 0; i < input.length; i++) {
            hashing[input[i]]=1;
        }
        for (int i = 1; i < hashing.length; i++) {
             if(hashing[i]==0){
                 return i;
             }
        }
        return 0;
    }

      //Optimal Approach (TC=> O(N) & SC=> O(1))
     static int missingNumberFromAnArrayOptimalApproach(int[] input){
        int actualSum=0;
         int number = input[input.length-1];
         int expectedSum = number*(number+1)/2;
         for (int i = 0; i < input.length; i++) {
             actualSum+=input[i];
         }
          return expectedSum-actualSum;
     }

   //First Optimal Approach
    static int missingNumberFromAnArray(int[] array){
        int count=0;
        int i=0;
        for (i = 0; i < array.length; i++) {
            count++;
            if(count!=array[i]){
                break;
            }
        }
        return count;
    }


    //Second Optimal Approach (TC=> O(N) & SC=> O(1))
    static int missingNumberFromAnArraySecondOptimalApproach(int[] input){
        int actualSum=0;
        int number = input[input.length-1];
        int expectedSum = number*(number+1)/2;
        for (int i = 0; i < input.length; i++) {
            actualSum+=input[i];
        }
        return expectedSum-actualSum;
    }


    //3rd Optimal Approach (TC=> O(N) & SC=> O(1))
    static int missingNumberWithXOR(int[] input, int n) {
        int expectedXOR = 0;
        int actualXOR = 0;

        // 1^1=0 2^2=0 3^3=0 4^4=0...
        // 1^2^3^4^5
        // 1^2^4^5

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

     //Optimal
    private static int maximumConsecutiveOnce(int[] input) {
         int count=0;
         int maxCount=0;
        for (int i = 0; i < input.length; i++) {
            if(input[i]==1){
                count++;
                if(maxCount<count){
                    maxCount=count;
                }
            }else {
                 count=0;
            }
        }
        return maxCount;
    }

    // Brute Force Approach (TC=> O(N) * O(N)= O(N2) & SC=> O(1))
    private static int findElementThatAppearsOnce(int[] input){
         int temp=0; int count;
        for (int i = 0; i < input.length; i++) {
                 count=0;
            for (int j = 0; j <=i; j++) {

                 if (input[i]==input[j]){
                      count++;
                 }
            }
            if(count==1){
                 temp=input[i];
            }
        }
        return temp;
    }

    //Better Approach (TC=> O(N)  & SC=> O(maxElementOfAnArray) => depends on input)
    /*we cant use hashing because some element is found negative or bigger element
     10^5 instead of this we can use map*/
    private static int findElementThatAppearsOnceWithBetter(int[] input){
        int[] hash = new int[input[input.length-1]+1];
        for (int i = 0; i < input.length; i++) {
              int value = hash[input[i]];
               value++;
               hash[input[i]]=value;
        }
        for (int i = 0; i < hash.length; i++) {
            if(hash[i]==1){
                 return i;
            }
        }
        return 0;
    }

    // Second Better Approach (TC=> NlogM + O(N/2+1) & SC=> O(N/2+1)
    //    M => size of the map
    //    size of map=> (N/2+1) )
    private static int findElementThatAppearsOnceWithSecondBetter(int[] input){
        Map<Integer, Integer> hash = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            hash.put(input[i],hash.containsKey(input[i])?hash.get(input[i]) + 1:1);
        }
        for (Map.Entry<Integer,Integer> i:hash.entrySet()) {
            if(i.getValue()==1){
                return i.getKey();
            }
        }
        return 0;
    }

    //Optimal Approach (TC=> O(N) & SC=> O(1))
    private static int findElementThatAppearsOnceOptimal(int[] input){
          int xorOutput=0;
        for (int i = 0; i < input.length; i++) {
               xorOutput ^=input[i];
        }
        return xorOutput;
    }









}