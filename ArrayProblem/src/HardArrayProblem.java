
import java.util.*;
import java.util.List;

public class HardArrayProblem {
    public static void main(String[] args) {
        /*
          1
          1 1
          1 2 1
          1 3 3 1
          1 4 6 4 1
          1 5 10 10 5 1

          => nCr => row-1^C col-1
          
        int row=11; int column=4;
        System.out.println(givenRowAndColumnTellMeValue(row,column));
        int rows=6;
        printNthRowOfPascalTriangle(rows);
        printNthRowOfPascalTriangleWithBetter(rows);
        givenNPrintEntirePascalTriangle(rows);
        */

        /*int[] input = {1,1,1,1,1,1,3,3,2,2,2,6,6,6,6,6,6};
        System.out.println(findMajorityElementNBy3(input));
        System.out.println(findMajorityElementNBy3WithBetter(input));
        System.out.println(findMajorityElementNBy3WithOptimal(input));*/

        /*int[] input = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(input));
        System.out.println(threeSumWithBetter(input));
        int[] input = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        System.out.println(threeSumWithOptimal(input));*/

        /*int[] input ={1,0,-1,0,-2,2};
        int target=0;
        System.out.println(fourSumProblem(input,target));
        System.out.println(fourSumProblemWithBetter(input,target));
        int[] input ={2,2,2,1,1,1,1,4,4,4,5,5,3,3,3,3};
        System.out.println(fourSumProblemWithOptimal(input,8));*/

        /*int[] input ={4,2,2,6,4};
        System.out.println(numberOfSubArraysWithXorK(input,6));
        System.out.println(numberOfSubArraysWithXorKWithBetter(input,6));
        System.out.println(numberOfSubArraysWithXorKWithOptimal(input,6));*/

        /*int [][]input = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        System.out.println(mergeOverlappingIntervals(input));
        System.out.println(mergeOverlappingIntervalsForOptimal(input));*/

        /*int[] a={1,3,5,7};
        int[] b={0,2,6,8,9};
        mergeSortedArraysWithoutExtraSpace(a, b);
        mergeSortedArraysWithoutExtraSpaceWithOptimal(a,b);
        mergeSortedArraysWithoutExtraSpaceWithOptimalSecondApproach(a,b);*/

        /*int[] input = {1,2,3,-3,1,1,1,4,2-3};
        System.out.println(countSubArraySumEqualsK(input,3));
        System.out.println(countSubArraySumEqualsKWithBetter(input,3));
        System.out.println(countSubArraySumEqualsKWithOptimal(input,3));*/

        /*int[] input = {4,3,6,2,1,1};
        System.out.println(Arrays.toString(findTheMissingAndRepeatingNumber(input)));
        System.out.println(Arrays.toString(findTheMissingAndRepeatingNumberSecond(input)));
        System.out.println(Arrays.toString(findTheMissingAndRepeatingNumberWithBetter(input)));
        System.out.println(Arrays.toString(findTheMissingAndRepeatingNumberWithOptimal(input)));*/

        /*int []input = {5,3,2,4,1};
        System.out.println(countInversionArray(input));*/

        /*int []input ={40,25,19,12,9,6,2};
        System.out.println(reversePairs(input));*/

        /*int []input={2,3,-2,4};
        int []input={-2,3,4,-1,0,-2,3,1,4,0,4,6,-1,4};
        System.out.println(maximumProductSubArray(input));
        System.out.println(maximumProductSubArrayWithOptimal(input));*/



        /*int[] input ={8,5,4,2,1};
        System.out.println(chocalatesPerBoys(input,5,20));*/



    }

    //Pascals Triangle Problem
    //nCr => 10C2 => 10th row & 2nd column
    static int givenRowAndColumnTellMeValue(int row, int column) {
        ;
        int result = 1;
        row = row - 1;
        for (int i = 0; i < column - 1; i++) {
            result *= (row - i);
            result /= (i + 1);
        }
        return result;
    }

    //Brute Force Approach (TC=> O(N) * O(row) & SC=> O(1))
    static void printNthRowOfPascalTriangle(int row) {

        for (int i = 0; i < row; i++) {
            printElement(row - 1, i);
        }
    }

    private static void printElement(int row, int col) {
        long result = 1;
        for (int i = 0; i < col; i++) {
            result = result * (row - i);
            result = result / (i + 1);
        }
        System.out.print(result + " ");

    }

    //Better Approach(TC=> O(N) & SC=> O(1))
 static void printNthRowOfPascalTriangleWithBetter(int size) {
        int result = 1;
        int row = size - 1;
        System.out.print(result + " ");
        for (int i = 0; i < size - 1; i++) {
            result *= (row - i);
            result /= (i + 1);
            System.out.print(result + " ");
        }
    }

    //Optimal Approach (TC=> O(N) * O(N)=> O(N^2) & SC=> O(N))
    static void givenNPrintEntirePascalTriangle(int n) {
        int result = 1;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> tempList = new ArrayList<>();
            result = 1;
            tempList.add(result);
            for (int j = 0; j < i; j++) {
                result = result * (i - j);
                result = result / (j + 1);
                tempList.add(result);
            }
            ans.add(tempList);
        }
        for (List<Integer> i : ans) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //Brute Force Approach (TC=> O(N) * O(N)=> O(N^2) & SC=> O(N))
    static List<Integer> findMajorityElementNBy3(int[] input) {
        int count = 0;
        List<Integer> majorityElement = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            count = 1;
            for (int j = i + 1; j < input.length; j++) {
                if (!majorityElement.contains(input[i])) {
                    if (input[i] == input[j]) {
                        count++;
                    }
                } else {
                    break;
                }
            }
            if (count > (input.length / 3)) {
                majorityElement.add(input[i]);
            }
        }
        return majorityElement;
    }

    //Better Approach(TC=> O(N) & SC=> O(N))
    static List<Integer> findMajorityElementNBy3WithBetter(int[] input) {
        Map<Integer, Integer> majority = new LinkedHashMap<>();
        List<Integer> majorityElement = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            majority.put(input[i], majority.containsKey(input[i]) ? majority.get(input[i]) + 1 : 1);
            if (majority.get(input[i]) > (input.length / 3)) {
                majorityElement.add(input[i]);
            }
        }
        return majorityElement;
    }

    //Optimal Approach(TC=> O(N) & SC=> O(1))
    static List<Integer> findMajorityElementNBy3WithOptimal(int[] input) {
        List<Integer> majorityElement = new ArrayList<>();
        int count1 = 0;
        int element2 = 0;
        int count2 = 0;
        int element1 = 0;
        for (int i = 0; i < input.length; i++) {
            if (count1 == 0) {
                count1 = 1;
                element1 = input[i];
            } else if (count2 == 0) {
                count2 = 1;
                element2 = input[i];
            } else if (element1 == input[i]) {
                count1++;
            } else if (element2 == input[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        majorityElement.add(element1);
        majorityElement.add(element2);
        return majorityElement;
    }

    //Brute Force Approach(TC=>O(N) * O(N) * O(N) => O(N^3) + O(N log N) & SC=>2*O(no of triplets))
    static List<List<Integer>> threeSum(int[] input) {
        Set<List<Integer>> temp = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    if (input[i] + input[j] + input[k] == 0) {
                        List<Integer> temps = new ArrayList<>(List.of(input[i], input[j], input[k]));
                        Collections.sort(temps);
                        temp.add(temps);
                    }
                }
            }
        }
        return new ArrayList<>(temp);
    }


    // Better Approach(TC=>O(N) * O(N) * O(log M) => O(N^2) + log(M) & SC=> O(N) + 2*O(no of triplets)
    // M => M is the size of set )
    static List<List<Integer>> threeSumWithBetter(int[] input) {

        Set<List<Integer>> tempList = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            HashSet<Integer> hash = new HashSet<>();
            for (int j = i + 1; j < input.length; j++) {
                int temp = -(input[i] + input[j]);
                if (hash.contains(temp)) {
                    List<Integer> list = Arrays.asList(input[i], input[j], temp);
                    //Collections.sort(list);
                    list.sort(null);
                    tempList.add(list);
                } else {
                    hash.add(input[j]);
                }
            }
        }
        return new ArrayList<>(tempList);
    }
    //Optimal Approach(TC=>Nlog(N) + (O(N) * O(N)) & SC=>O(no of triplets)
    static List<List<Integer>> threeSumWithOptimal(int[] input) {

        int j = 1;
        int k = input.length;
        List<List<Integer>> output = new ArrayList<>();
        int addition = 0;
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
             if (i!=0 && input[i]==input[i-1])
                  continue;
            j=i+1;
            k=input.length-1;
             while (j<k){
                 addition=input[i] + input[j] + input[k];
                  if (addition==0){
                      List<Integer> integerList = Arrays.asList(input[i],input[j],input[k]);
                      output.add(integerList);
                      j++;
                      k--;
                      while (j<k && input[j]==input[j-1])j++;
                      while (j<k && input[k]==input[k+1])k--;
                  } else if (addition<0) {
                      j++;
                  }else {
                      k--;
                  }
             }
        }
        return output;
    }

    


    //Brute Force Approach(TC=>O(N)*O(N)*O(N)*O(N)=> O(N^4)+O(log M) & SC=>2*O(no of quards)
    // M= Size of quards)
    static List<List<Integer>> fourSumProblem(int[] input,int target){
        Set<List<Integer>> output = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                for (int k = j+1; k < input.length; k++) {
                    for (int l = k+1; l < input.length; l++) {
                        if (input[i]+input[j]+input[k]+input[l]==target){
                            List<Integer> temp = Arrays.asList(input[i],input[j],input[k],input[l]);
                            Collections.sort(temp);
                            output.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(output);
    }

    // Better Approach(Tc=> O(N^3) + log(M) & SC=> O(N) + 2*O(no of quards)
    static List<List<Integer>> fourSumProblemWithBetter(int[] input,int target){
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                HashSet<Integer> hash = new HashSet<>();
                for (int k = j+1; k < input.length; k++) {
                    int temp = target - (input[i]+input[j]+input[k]);
                    if (hash.contains(temp)) {
                        List<Integer> tempList = Arrays.asList(input[i],input[j],input[k],temp);
                        Collections.sort(tempList);
                        set.add(tempList);
                    }else {
                        hash.add(input[k]);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    // Optimal Approach ()
    static List<List<Integer>> fourSumProblemWithOptimal(int[] input,int target){
      List<List<Integer>> output = new ArrayList<>();
      Arrays.sort(input);
     for (int i = 0; i < input.length; i++) {
         if (i!=0 && input[i]==input[i-1])
              continue;
          for (int j= i+1; j < input.length; j++) {
              if (j > i + 1 && input[j] == input[j - 1])
                  continue;
              int l = j + 1;
              int k = input.length - 1;
              while (l<k){
                  int sum = input[i]+input[j]+input[l]+input[k];
                  if (sum==target){
                      output.add(Arrays.asList(input[i],input[j],input[l],input[k]));
                      l++;
                      k--;
                      while (l<k && input[l]==input[l+1])
                          l++;
                      while (l<k && input[k]==input[k-1])
                          k--;
                  } else if (sum<target) {
                      l++;
                  } else {
                      k--;
                  }
              }
          }
       }
     return output;
     }

     //Brute Force Approach (TC=> O(N) * O(N) * O(N) = O(N^3) & SC=> O(N) => use for return answer)
    // If in problem say return subArray this is better approach and
     // if problem say return only subArray count this is Brute force approach.
     static List<List<Integer>> numberOfSubArraysWithXorK(int[] input, int k){
         List<List<Integer>>  output = new ArrayList<>();
          int xor=0;
         for (int i = 0; i < input.length; i++) {
             xor=0;
             for (int j = i; j < input.length; j++) {
                 xor ^=input[j];
                 if (xor==k){
                     List<Integer> tempList = new ArrayList<>();
                     int count=i;
                     while (j>=count){
                         tempList.add(input[count]);
                         count++;
                     }
                     output.add(tempList);
                 }
             }
         }
     return output;
     }
    // Better Approach (TC=> O(N) * O(N) = O(N^2) & SC=> O(1))
    // if problem say return only subArray count this is Better approach.
    static int numberOfSubArraysWithXorKWithBetter(int[] input, int k){
        int xor=0; int count=0;
        for (int i = 0; i < input.length; i++) {
            xor=0;
            for (int j = i; j < input.length; j++) {
                xor ^=input[j];
                if (xor==k){
                    count++;
                }
            }
        }
        return count;
    }

    // Optimal Approach (TC=> O(N) + N log (N) & SC=> O(N))
    //  xor = xor ^ a[i]
    //  int x = xor ^ k
    //Here Use Prefix Sum concept
    static int numberOfSubArraysWithXorKWithOptimal(int[] input, int k){
         HashMap<Integer,Integer> xorFront = new HashMap<>();// stores the previous element xor.
         xorFront.put(0,1);
         int xor=0; int count=0;
        for (int i = 0; i < input.length; i++) {
            xor = xor^input[i];
            int x = xor^k;
            if(xorFront.containsKey(x)){
                 count+=xorFront.get(x);
            }
            xorFront.put(xor,xorFront.containsKey(xor)?xorFront.get(xor)+1:1);
        }
        return count;
    }

    //Brute Force Approach (TC=> N log(N) + O(N^2) && O(N)=> use for return answer)
    static List<List<Integer>> mergeOverlappingIntervals(int [][]input){
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(input,(a,b)-> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
        for (int i = 0; i < input.length; i++) {
            if(!output.isEmpty() && output.getLast().get(1)>=input[i][1]){
                continue;
            }
            int start= input[i][0];
            int end= input[i][1];
            for (int j = i+1; j < input.length; j++) {
                if(end>=input[j][0]){
                    end=Integer.max(end,input[j][1]);
                }else {
                    break;
                }
            }
            List<Integer> tempList = Arrays.asList(start,end);
            output.add(tempList);
        }
        return output;
    }

    static List<List<Integer>> mergeOverlappingIntervalsForOptimal(int [][]input){
        List<List<Integer>> output = new ArrayList<>();
         Arrays.sort(input,(a,b)->{
              if(a[0] !=b[0]) {
                  return Integer.compare(a[0], b[0]);
              }else {
                   return Integer.compare(a[1], b[1]);
              }
         });

         int start = input[0][0];
         int end = input[0][1];
        for (int i = 1; i < input.length; i++) {
             if (end>=input[i][0]){
                  end=Integer.max(end,input[i][1]);
             }else {
                 output.add(List.of(start,end));
                 start=input[i][0];
                 end=input[i][1];
             }
        }
        output.add(List.of(start,end));
        return output;
    }

    //Brute Force Approach (TC=> O(a+b) + O(a+b) && SC => O(a+b))
    static void mergeSortedArraysWithoutExtraSpace(int[] a, int[] b){

         int i=0;
         int j=0; int count=0;
         int[] output=new int[a.length+b.length];
         while (i<a.length && j<b.length){
             if (a[i]>b[j]){
                 output[count++]=b[j];
                 j++;
             } else if (a[i]<b[j]) {
                 output[count++]=a[i];
                 i++;
             }
         }

         while (i<a.length){
             output[count++] =a[i];
             i++;
         }

        while (j<b.length){
            output[count++] =b[j];
            j++;
        }
        int n=a.length; int m=b.length;
        for (int k = 0; k < n+m; k++) {
            if(k<a.length){
                a[k]=output[k];
            }else {
                b[k-n]=output[k];
            }
        }
        System.out.println();
    }

    //Optimal Approach(TC=> O(min length of (a and b) + O(a log a) + O(a log b) && SC=> O(1) ))
    static void mergeSortedArraysWithoutExtraSpaceWithOptimal(int[] a, int[] b){
        int i=a.length-1; int j=0;
        while (i>=0 && j< b.length){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i] = b[j];
                b[j]= temp;
                i--;
                j++;
            }else if(a[i]<b[j]) {
                 break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println();
    }

    //Optimal Approach(TC=> log2(b.length+a.length) * O(b.length+a.length) && SC=> O(1)))
    //Use Shell Sort (Gap Method)
    static void mergeSortedArraysWithoutExtraSpaceWithOptimalSecondApproach(int[] a, int[] b){
        int n=a.length; int m=b.length;
        int len=(n+m);
        double gap = Math.ceil((double) (n + m) /2);
        while (gap>0){
            int left=0;
            int right =(int) gap;
             while (right<len){
                 if (left<n && right>=n){
                     swapIfGreater(a,b,left,right-n);
                 }else if(left>=n){
                     swapIfGreater(b,b,left-n,right-n);
                 }else {
                     swapIfGreater(a,a,left,right);
                 }
                 left++;right++;
             }
            if (gap==1){
                break;
            }else {
                gap=gap/2;
                gap= Math.ceil(gap);
            }
        }


    }

    private static void swapIfGreater(int[] a, int[] b, int left, int right) {
           if (a[left]>b[right]){
               int temp=b[right];
               b[right]=a[left];
               a[left]=temp;
           }
    }

   //Brute force Approach(Tc=> O(N^3) && SC=> O(1))
   private static int countSubArraySumEqualsK(int[] input,int k){
       int count=0; int sum=0;
       for (int i = 0; i < input.length; i++) {
           for (int j = i; j < input.length; j++) {
               sum=0;
               for (int l = i; l <=j ; l++) {
                   sum+=input[l];
               }
               if(sum==k){
                   count++;
               }
           }
       }
     return count;
   }

   //Better Approach(TC=> O(N^2) && SC=> O(1))
   private static int countSubArraySumEqualsKWithBetter(int[] input, int k){
         int count=0;
       for (int i = 0; i < input.length; i++) {
            int sum=0;
           for (int j = i; j < input.length; j++) {
                sum +=input[j];
                if (sum==k){
                    count++;
                }
           }
       }
       return count;
   }

    // Optimal Approach (TC=> O(N*logN)  & SC=> O(N))
    //Use Prefix Sum concept
   private static int countSubArraySumEqualsKWithOptimal(int[] input,int k){
        HashMap<Integer, Integer> frontSum = new HashMap<>();
        frontSum.put(0,1);
        int count=0;
        int presum=0;
        for (int i = 0; i < input.length; i++) {
             presum+=input[i];
             int sum=presum-k;
             frontSum.put(presum,frontSum.containsKey(presum)?frontSum.get(presum)+1:1);
             if (frontSum.containsKey(sum)){
                 count+=frontSum.get(sum);
             }
        }
        return count;
    }

    //Brute Force Approach(TC=> N log N+ O(N) & SC=> O(2))
    static int[] findTheMissingAndRepeatingNumber(int[] input){
      Arrays.sort(input);
     int[] output= new int[2];
        int i;
        for (i = 0; i < input.length-1; i++) {
                if (input[i]==input[i+1]){
                     output[0]=input[i];
                     continue;
                }
                if (input[i]!=i){
                    break;
                }
        }
        output[1]=i;
        return output;
    }

    //Brute Force Approach second(TC=> O(N^2) & SC=> O(2))
    static int[] findTheMissingAndRepeatingNumberSecond(int[] input){
        int[] output= new int[2];
          int repeating=-1; int missing=-1;
          int count=0;
        for (int i = 1; i < input.length; i++) {
            count=0;
            for (int j = 0; j < input.length; j++) {
                if (input[j]==i){
                    count++;
                }
            }
            if (count==2){
                repeating=i;
            } else if (count==0){
                missing=i;
            }
            if (missing==-1 && repeating==-1){
                break;
            }
        }
        output[0]=repeating;
        output[1]=missing;
     return output;
    }

    //Better Approach(Tc=> O(N) +O(N)=> O(2N) && O(N))
    static int[] findTheMissingAndRepeatingNumberWithBetter(int[] input){
        int[] hashmap = new int[input.length+1];
        int[] output= new int[2];
        int repeating=-1; int missing=-1;
        for (int i = 0; i < input.length; i++) {
           int value= hashmap[input[i]];
            hashmap[input[i]]=value+1;
        }
        for (int i = 1; i < hashmap.length; i++) {
            if (hashmap[i]==2){
                repeating=i;
                output[0]=repeating;
            }
            if (hashmap[i]==0){
                missing=i;
                output[1]=missing;
            }
        }
        return output;
    }

    //Optimal Approach(TC=> O(N) & SC=> O(1))
    static int[] findTheMissingAndRepeatingNumberWithOptimal(int[] input){
        //x => Repeating
        //y => Missing
        int[] output= new int[2];
        long n = input.length;
         long actualSum = ( n*(n+1) ) / 2;
          long actualSquareProduct=(n * (n+1) * (2*n+1) ) / 6;
         int sum=0;
         int squareProduct=0;
        for (int i = 0; i < input.length; i++) {
             sum+=input[i];
             squareProduct+=input[i]*input[i];
        }
        long val1 = actualSum-sum; //x-y
        long val2 = (actualSquareProduct-squareProduct)/val1; //x+y
        long y    = (val1+val2) / 2;
        long x    = val2 - y;
        output= new int[]{(int) x, (int) y};
       return output;
    }

    //Optimal Approach(TC=> O(N) & SC=> O(1))
    //By Using XOR
    /*static int[] findTheMissingAndRepeatingNumberWithOptimalSecondApproach(int[] input){

    }*/

    //Brute Force Approach(TC=> O(N^2) & SC=> O(1))
    static int countInversionArray(int[] input){
         int count=0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i]>input[j]){
                    count++;
                }
            }
        }
        return count;
    }

    //Optimal Approach
    //After Learning Merge Sort
   /* static int countInversionArrayWithOptimal(int input){

    }*/

    //Brute Force Approach(TC=> O(N^2) & SC=> O(1))
    static int reversePairs(int[] input){
        int count=0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                 int pair=2* input[j];
                if (input[i]> pair){
                    count++;
                }
            }
        }
        return  count;
    }

    //Optimal Approach
    //After Merge Sort
    /*static int reversePairsWithOptimal(int []input){

    }*/

    //Brute Force Approach(TC=> O(N^2) & SC=> O(1))
    static int maximumProductSubArray(int []input){
        int maxProduct=Integer.MIN_VALUE;
        int product=1;
        for (int i = 0; i < input.length; i++) {
              product=1;
            for (int j = i; j < input.length; j++) {
                  product*=input[j];
                 if(maxProduct<product){
                     maxProduct=product;
                 }
            }
        }
        return maxProduct;
    }

    // Optimal Approach (TC=> O(N) & SC=> O(1))
    static int maximumProductSubArrayWithOptimal(int []input){
         int prefix=1; int suffix=1; int max= Integer.MIN_VALUE;
                                     int sMAx=Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (prefix==0){
                prefix=1;
            } else if (suffix==0) {
                suffix=1;
            }
            prefix*=input[i];
            suffix*=input[input.length-1-i];
             if (max<prefix){
                 max=prefix;
             }else if (sMAx<suffix){
                 sMAx=suffix;
             }
        }
        if (max>sMAx) {
            return max;
        }
        return sMAx;
    }


    static Map<Integer,Integer> chocalatesPerBoys(int[] input,int boys,int totalChocaltes){
        Map<Integer,Integer> output = new LinkedHashMap<>();
        int perBoysChocaltes= totalChocaltes/boys;
        int boysCount=0;
        int calculation=0;
        for (int i = 0; i < input.length; i++) {
             calculation+=input[i];
             calculation-=perBoysChocaltes;
             output.put(boysCount++,perBoysChocaltes);
        }
        return output;
    }





}
