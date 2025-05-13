import com.sun.jdi.ArrayReference;

import java.util.*;

public class MediumArrayProblem {
    public static void main(String[] args) {

        /* int[] input ={2,6,5,8,11};
        System.out.println(twoSumProblem(input,14));
        System.out.println(twoSumProblemWithBetter(input,14));
        System.out.println(twoSumProblemWithOptimal(input,14));*/

        /*int[] input={0,1,2,0,1,2,1,2,0,0,0,1};
        System.out.println(Arrays.toString(sortAnArrayOf0s1s2s(input)));
        System.out.println(Arrays.toString(sortAnArrayOf0s1s2sWithOptimal(input)));*/

        /*int[] input= {2,2,3,3,1,2,2};
        System.out.println(majorityElementMoreThanNBy2Elements(input));
        System.out.println(majorityElementMoreThanNBy2ElementsWithBetter(input));
        int[] inputArray={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majorityElementMoreThanNBy2ElementsWithOptimal(inputArray));*/

        /*int[] input ={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maximumSubArraySum(input));
        System.out.println(maximumSubArraySumWithBetter(input));
        System.out.println(maximumSubArraySumWithOptimal(input));*/

        /*int[] input ={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArrayElementsBySign(input)));
        System.out.println(Arrays.toString(rearrangeArrayElementsBySignWithOptimal(input)));*/

      /*  int[] input = {-1,2,3,4,-3,1};
        System.out.println(Arrays.toString(secondVariantRearrangeArrayElementsBySign(input)));*/

        /*int[] input = {2,5,3,6,4,1,8,7};
        System.out.println(stocksBuysAndSell(input));*/

       /* int[] input = {10, 22, 12, 3, 0, 6};
        System.out.println(leadersInAnArray(input));
        System.out.println(leadersInAnArrayWithOptimal(input));*/

        //int[] input={102,4,100,1,101,3,2,1,1};
        //System.out.println(longestConsecutiveSequence(input));
       // int[] input={21 ,15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3 };
        int[] input={4,1,2,2,1};
        //System.out.println(longestConsecutiveSequenceWithBetter(input));
        System.out.println(longestConsecutiveSequenceWithOptimal(input));

     }

    //Brute Force Approach ( TC=> O(N) * O(N) = 0(N^2) )
    private static boolean twoSumProblem(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //Better Approach ( TC=> N*log N + 0(N^2) & SC=> O(N) )
    private static boolean twoSumProblemWithBetter(int[] input, int target) {
        Map<Integer, Integer> hashing = new LinkedHashMap<>();
        int reminder = 0;
        for (int i = 0; i < input.length; i++) {
            reminder = target - input[i];
            if (hashing.containsKey(reminder)) {
                return true;
            } else {
                hashing.put(input[i], i);
            }
        }
        return false;
    }

    //Optimal Approach ( TC=> O(N) + Nlog(N) & SC=> O(1) )
    private static boolean twoSumProblemWithOptimal(int[] input, int target) {
        Arrays.sort(input);
        int i = 0;
        int j = input.length - 1;
        while (i < j) {
            if (input[i] + input[j] == target) {
                return true;
            } else if (input[i] + input[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    //Brute Force Approach (Merge SORT TC=> (N*log(N) & SC=> O(N)))
    //Better Approach (TC= O(N)+O(N)=O(2N) & SC=O(1))
    private static int[] sortAnArrayOf0s1s2s(int[] input) {
        int zerosCount = 0;
        int onesCount = 0;
        int twosCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                zerosCount++;
            } else if (input[i] == 1) {
                onesCount++;
            } else {
                twosCount++;
            }
        }
        int i = 0;
        for (i = 0; i < zerosCount; i++) {
            input[i] = 0;
        }
        for (i = i; i < zerosCount + onesCount; i++) {
            input[i] = 1;
        }
        for (i = i; i < zerosCount + onesCount + twosCount; i++) {
            input[i] = 2;
        }
        return input;
    }

    //Optimal Approach (TC=> O(N) & SC=> O(1))
    // Using Dutch National Flag Algorithm
    private static int[] sortAnArrayOf0s1s2sWithOptimal(int[] input) {
        int mid = 0;
        int low = 0;
        int high = input.length - 1;
        while (mid <= high) {
            if (input[mid] == 0) {
                int temp = input[low];
                input[low] = input[mid];
                input[mid] = temp;
                mid++;
                low++;
            } else if (input[mid] == 1) {
                mid++;
            } else {
                input[mid] = input[high];
                input[high] = 2;
                high--;
            }
        }
        return input;
    }


    //Brute Force Approach(TC=> O(N) * O(N)= O(N^2) & SC=> O(1))
    static int majorityElementMoreThanNBy2Elements(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            count = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                }
            }
            if (count > (input.length) / 2) {
                return input[i];
            }
        }
        return 0;
    }

    //Better Approach (TC=> N*log N * O(N) & SC=> O(N))
    static int majorityElementMoreThanNBy2ElementsWithBetter(int[] input) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            hash.put(input[i], hash.containsKey(input[i]) ? hash.get(input[i]) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> e : hash.entrySet()) {
            if (e.getValue() > (input.length) / 2) {
                return e.getKey();
            }
        }
        return 0;
    }

    //Optimal Approach (TC=> O(N) & SC => O(1))
    // Using Moore's Algorithm
    static int majorityElementMoreThanNBy2ElementsWithOptimal(int[] input) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (count == 0) {
                element = input[i];
            }
            if (element == input[i]) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    //Brute Force Approach(TC=> O(N)*O(N)*O(N)=O(N^3) & SC=> O(1))
    static int maximumSubArraySum(int[] input) {
        int sum = 0;
        int finalSum = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += input[k];
                }
                if (finalSum < sum) {
                    finalSum = sum;
                }
            }
        }
        return finalSum;
    }

    //Better Approach(TC=> O(N)*O(N)=O(N^2) & SC=> O(1))
    static int maximumSubArraySumWithBetter(int[] input) {
        int sum = 0;
        int finalSum = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                sum += input[j];
                if (finalSum < sum) {
                    finalSum = sum;
                }
            }
            sum = 0;
        }
        return finalSum;
    }

    //Optimal Approach(TC=> O(N) & SC=> O(1))
    //Using Kadane's Algorithm
    static int maximumSubArraySumWithOptimal(int[] input) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < input.length; i++) {


            if (sum == 0) {
                start = i;
            }
            sum += input[i];
            if (sum < 0) {
                sum = 0;
            }
            if (maxSum < sum) {
                maxSum = sum;
                end = i;
            }
        }
        System.out.println(start + " " + end);
        return maxSum;
    }

    //Brute Force Approach(TC=> O(N)+O(N) = O(2N) & SC=> O(N))
    static int[] rearrangeArrayElementsBySign(int[] input) {
        int size = input.length / 2;
        int[] positive = new int[size];
        int[] negative = new int[size];
        int pCount = 0;
        int nCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                negative[pCount++] = input[i];
            } else {
                positive[nCount++] = input[i];
            }
        }
        pCount = 0;
        nCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                input[i] = positive[pCount++];
            } else {
                input[i] = negative[nCount++];
            }
        }
        return input;
    }

    //Optimal Approach(TC=> O(N) & SC=> O(N))
    static int[] rearrangeArrayElementsBySignWithOptimal(int[] input) {

        int[] finalOutput = new int[input.length];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                finalOutput[neg] = input[i];
                neg += 2;
            } else {
                finalOutput[pos] = input[i];
                pos += 2;
            }
        }
        return finalOutput;

    }


    // Brute Force Approach (TC=> O(N) + O(min(pos,neg)) + O(remaining) => O(2N) & SC=> O(N))
    static int[] secondVariantRearrangeArrayElementsBySign(int[] input) {

        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                negList.add(input[i]);
            } else {
                posList.add(input[i]);
            }
        }
        int i = 0;
        boolean isPosMax = false;
        if (posList.size() >= negList.size()) {
            isPosMax = true;
            for (i = 0; i < negList.size(); i++) {
                input[2 * i] = posList.get(i);
                input[2 * i + 1] = negList.get(i);
            }
        } else {
            for (i = 0; i < posList.size(); i++) {
                input[2 * i] = posList.get(i);
                input[2 * i + 1] = negList.get(i);
            }
        }

        if (isPosMax) {
            for (int j = i; j < posList.size(); j++) {
                input[j] = posList.get(j);
            }
        } else {
            for (int j = i; j < input.length; j++) {
                input[j] = negList.get(j);
            }
        }
        return input;
    }

    // (TC=>O(N) & SC=> O(1))
    /* On which day you buy and sell the stock but remember
     Buy Day is always lesser than Sell Day*/
    static int stocksBuysAndSell(int[] input) {
        int sell = input.length - 1;
        int buys = 0;
        int profit = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[buys] > input[i]) {
                buys = i;
            }
            int calculation = input[i] - input[buys];
            if (calculation > profit && i > buys) {
                sell = i;
                profit = calculation;
            }
        }
        System.out.println("Buy on " + buys + "th day And" + " Sell On " + sell + "th day");
        return profit;
    }

    //Brute Force Approach (TC=> O(N) * O(N) => O(N^2) & SC => O(N))
    // Everything is the right of an element is smaller
    static List<Integer> leadersInAnArray(int[] input) {
        List<Integer> leadersList = new ArrayList<>();
        boolean isLeader = true;
        for (int i = 0; i < input.length; i++) {
            isLeader = true;
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leadersList.add(input[i]);
            }
        }
        return leadersList;
    }


    //Optimal Approach (TC=> O(N) & SC => O(N))
    static List<Integer> leadersInAnArrayWithOptimal(int[] input) {
        List<Integer> leaderList = new ArrayList<>();
        int leader = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] > leader) {
                leaderList.add(input[i]);
                leader = input[i];
            }
        }
        return leaderList;
    }

     //Brute Force Approach(TC=> O(N) * O(N)=O(N^2) & SC => O(1))
    static int longestConsecutiveSequence(int[] input){
          int maxSequence=0;
        for (int i = 0; i < input.length; i++) {
             int x=input[i];
             int count=1;
            while (ls(input,(x+1))) {
                x+=1;
                count++;
            }
            if(maxSequence<count){
                maxSequence=count;
            }
        }
        return maxSequence;
    }
    private static boolean ls(int[] input, int i) {
        for (int j = 0; j < input.length; j++) {
            if (input[j]==i){
                return true;
            }
        }
        return false;
    }

    //Better Approach (TC=> O(N) + N log(N) & SC=>O(1) )
    static int longestConsecutiveSequenceWithBetter(int[] input){
       Arrays.sort(input);
         int count=1; int maxSequence=0;
        for (int i = 0; i < input.length-1; i++) {
            int nextElement=input[i]+1;
            if (input[i+1]==nextElement){
                count++;
            }else if(input[i]==input[i+1]){
                continue;
            }else {
                count=1;
            }
            if (maxSequence<count){
                  maxSequence=count;
            }
        }
       return maxSequence;
    }

    //Optimal Approach(TC=>O(N) & SC=>O(N))
    static int longestConsecutiveSequenceWithOptimal(int[] input){

        Set<Integer> uniqueList = new LinkedHashSet<>();
        for (int i = 0; i < input.length; i++) {
                uniqueList.add(input[i]);
        }

        int maxElement=0;int count=0;
        for (int i = 0; i < uniqueList.size(); i++) {
            if (!uniqueList.contains(input[i]-1)){
                int next = input[i];
                count=1;
                while (uniqueList.contains(next+1)){
                    next +=1;
                    count++;
                }
            }
            if (maxElement<count){
                maxElement=count;
            }
        }
        return maxElement;
    }

}

