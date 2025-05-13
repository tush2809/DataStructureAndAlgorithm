import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class BinarySearchOnAnswersProblems {

    public static void main(String[] args) {
        //System.out.println(findingSquareRootOfANumber(200));
        //System.out.println(findTheNthRootOfAnInteger(3,27));

       /* int[] piles={3,6,7,11};
        System.out.println(kokoEatingBananas(piles,8));
        int[] piles={30,11,23,4,20};
        System.out.println(kokoEatingBananas(piles,6));
        int[] piles={805306368,805306368,805306368};
        System.out.println(kokoEatingBananas(piles,1000000000));*/

        /*int[] bloomDay={7,7,7,7,13,11,12,7};
        System.out.println(minimumNumberOfDaysToMakeMBouquets(bloomDay,2,3));
        int[] bloomDay={1,10,3,10,2};
        System.out.println(minimumNumberOfDaysToMakeMBouquets(bloomDay,3,1));
        int[] bloomDay={1,10,3,10,2};
        System.out.println(minimumNumberOfDaysToMakeMBouquets(bloomDay,3,2));*/

        /*int[] nums={1,2,5,9};
        System.out.println(findTheSmallestDivisorGiveThreshold(nums,6));
        int[] nums={44,22,33,11,11};
        System.out.println(findTheSmallestDivisorGiveThreshold(nums,5));
        int[] nums={21212,10101,12121};
        System.out.println(findTheSmallestDivisorGiveThreshold(nums,1000000));*/

       /*
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        System.out.println(capacityToShipPackagesWithinDDaysWith(weights,5));
        int[] weights={3,2,2,4,1,4};
        System.out.println(capacityToShipPackagesWithinDDaysWith(weights,3));
        int[] weights={1,2,3,1,1};
        System.out.println(capacityToShipPackagesWithinDDaysWith(weights,4));
        int[] weights={3,3,3,3,3,3};
        System.out.println(capacityToShipPackagesWithinDDaysWith(weights,2));
        */



       /* int[] input= {2,3,4,7,11};
        System.out.println(kthMissingPositiveNumber(input,5));
        int[] input= {1,2,3,4};
        System.out.println(kthMissingPositiveNumberWithLinearSearch(input,2));
        int[] input= {5,7,10,12};
        System.out.println(kthMissingPositiveNumberWithLinearSearch(input,4));
        int[] input= {5,7,10,12};
        System.out.println(kthMissingPositiveNumberWithLinearSearch(input,6));*/

         /*int[] stalls = {0,3,4,7,10,9};
        System.out.println(aggressiveCowsWithLinearSearch(stalls,4));
        int[] stalls={1, 2, 4, 8, 9};
        System.out.println(aggressiveCows(stalls,3));
        int[] stalls={1, 2, 3, 4, 5, 6};
        System.out.println(aggressiveCows(stalls,2));
        int[] stalls={1, 3, 5, 7, 9};
        System.out.println(aggressiveCows(stalls,3));*/



        /*int[] pages={25,46,28,49,24};
        System.out.println(bookAllocation(pages,4));
        int[] pages={ 12, 34, 67, 90};
        System.out.println(bookAllocation(pages,2));*/

        /*int[] boards={2, 1, 5, 6, 2, 3};
        System.out.println(paintersPartition(boards,2));
        int[] boards={10,20,30,40};
        System.out.println(paintersPartition(boards,2));*/

        /*int[] nums={7,2,5,10,8};
        System.out.println(splitArrayLargestSum(nums,2));
        int[] nums={1,2,3,4,5};
        System.out.println(splitArrayLargestSum(nums,2));*/

       /* int[] gasStation={1,2,3,4,5};
        System.out.println(minimizeMaxDistanceToGasStationWithBruteForceApproach(gasStation,4));
        int[] gasStations={1,13,17,23};
        System.out.println(Pair.minimizeMaxDistanceToGasStationWithBetterApproach(gasStations,5));
        int[] gasStation={1,13,17,23};
        System.out.println(minimizeMaxDistanceToGasStationWithOptimalApproach(gasStation,5));*/

        /*int[] input1={1,3,4,7,10,12};
        int[] input2={2,3,6,15};
        int[] input1={1,2,3,4,9,15};
        int[] input2={7,12,14,15};
        System.out.println(medianOfTwoSortedArraysOfDifferentSizesWithOptimalApproach(input1,input2));
        int[] input1={2,3,4};
        int[] input2={1,3};
        System.out.println(medianOfTwoSortedArraysOfDifferentSizesWithOptimalApproach(input1,input2));*/


        /*int[] input1={2,3,6,7,9};
        int[] input2={1,4,8,10};
        int[] input1={2,4,5};
        int[] input2={1,3};
        System.out.println(kthElementOfTwoSortedArrays(input1,input2,3));*/
    }

    static int findingSquareRootOfANumber(int input){
         int low=1;
         int high=input;
         int ans=1;
         while (low<=high){
             int mid=low+((high-low)/2);
             int temp=mid*mid;
             if (temp<=input){
                 ans=mid;
                 low=mid+1;
             }else {
                 high=mid-1;
             }
         }
        return ans;
    }

   //With Linear Search
    static int findTheNthRootOfAnIntegerWithLinearSearch(int n,int input){
        for (int i = 1; i <=input ; i++) {
            int temp=helperFunction(i,n);
            if (temp==input){
                return i;
            }else if (temp>input){
                break;
            }
        }
        return -1;
    }

    private static int helperFunction(int i, int n) {
        int ans=1;
        int count=0;
        while (count<n){
            ans*=i;
            count++;
        }
        return ans;
    }

    private static int helperFunction(int i, int n,int input) {
        int ans=1;
        for (int j = 1; j <=n ; j++) {
            ans=ans*i;
            if (ans>input){
                return 2;
            }
        }
        if (ans==input) {
           return 1;
        }
        return 0;
    }

    static int findTheNthRootOfAnInteger(int n,int input){
            int low=1;
            int high=input;
            while (low<=high){
                int mid=low+((high-low)/2);
                int temp=helperFunction(mid,n,input);
                if (temp==1){
                    return mid;
                } else if (temp==0){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
         return -1;
        }

        //TC=>(O(N * log2(max))
        //SC=O(1)
        static int kokoEatingBananas(int[] piles, int hour){
            int low=1;
            int high=Integer.MIN_VALUE;
            for (int i = 0; i <piles.length ; i++) {
                 if (high<piles[i]){
                      high=piles[i];
                 }
            }
            while (low<=high){
                 int mid=low +((high-low)/2);
                 int temp = calculateTotalHours(piles,mid);
                 if (temp<=hour){
                      high=mid-1;
                 }else if (temp>hour){
                     low=mid+1;
                 }
            }
            return low;
        }

    private static int calculateTotalHours(int[] piles, int mid) {
        int sum=0;
        for (int i = 0; i < piles.length; i++) {
               sum+= (int) Math.ceil((double) piles[i] /mid);
        }
        return sum;
    }


      static int minimumNumberOfDaysToMakeMBouquetsWithLinearSearch(int[] bloomDay,int noOfBuke,int adjacentOfFlower){
        int ans=Integer.MAX_VALUE;
          for (int i = 0; i < bloomDay.length; i++) {
              int minDays=calculationOfMinDays(bloomDay,bloomDay[i],noOfBuke,adjacentOfFlower);
              if (minDays>-1 && ans>minDays){
                   ans=minDays;
              }
          }
          return ans==Integer.MAX_VALUE?-1:ans;
      }

    private static int calculationOfMinDays(int[] bloomDay, int i, int noOfBuke, int adjacentOfFlower) {
        int count=0;  int adjacentCount=0;
        for (int j = 0; j < bloomDay.length; j++) {
            if (bloomDay[j]<=i){
                count++;
                if (adjacentOfFlower==count){
                    adjacentCount++;
                    count=0;
                }
            }else {
                count=0;
            }
        }
        if (adjacentCount>=noOfBuke){
            return i;
        }
        return -1;
    }

    // TC=>(O(N * log2(max-min)+1))
    //SC=O(1)
    static int minimumNumberOfDaysToMakeMBouquets(int[] bloomDay, int noOfBuke, int adjacentOfFlower){
        if (bloomDay.length < (noOfBuke*adjacentOfFlower)){
            return -1;
        }
      int low=Integer.MAX_VALUE;  int high=Integer.MIN_VALUE;
        for (int j = 0; j < bloomDay.length; j++) {
             if (high<bloomDay[j]){
                  high=bloomDay[j];
             }
             if (low>bloomDay[j]){
                 low=bloomDay[j];
             }

        }
        boolean isPossible;
        while (low<=high){
             int mid = low+((high-low)/2);
             isPossible=calculationOfMinDay(bloomDay,mid,noOfBuke,adjacentOfFlower);
             if (isPossible){
                 high=mid-1;
             }else {
                 low=mid+1;
             }
        }

        return low;
    }

    private static boolean calculationOfMinDay(int[] bloomDay, int i, int noOfBuke, int adjacentOfFlower) {
        int count=0;  int adjacentCount=0;
        for (int j = 0; j < bloomDay.length; j++) {
            if (bloomDay[j]<=i){
                count++;
                if (adjacentOfFlower==count){
                    adjacentCount++;
                    count=0;
                }
            }else {
                count=0;
            }
        }
        return adjacentCount>=noOfBuke;
    }

          //TC=>(O(N * log2(max))
          //SC=O(1)
        static int findTheSmallestDivisorGiveThreshold(int[] nums,int thershold){
            int low=1;  int high=Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (high<nums[j]){
                    high=nums[j];
                }
                if (low>nums[j]){
                    low=nums[j];
                }
            }
            while (low<=high){
                int mid = low+((high-low)/2);
                int sum=calculateTotalSumOfNums(nums,mid);
                if (sum<=thershold){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
        return low;
        }

    private static int calculateTotalSumOfNums(int[] piles, int mid) {
        int sum=0;
        for (int i = 0; i < piles.length; i++) {
            sum+= (int) Math.ceil((double) piles[i] /mid);
        }
        return sum;
    }


    static int capacityToShipPackagesWithinDDaysWithLinearSearch(int[] weights, int days){
        int maxCapacity=0; int maxElement=Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
             maxCapacity+=weights[i];
             if (maxElement<weights[i]) {
                 maxElement = weights[i];
             }
        }
          for (int i = maxElement;i<=maxCapacity; i++) {
                int daysCount=calculateCapacity(weights,i);
                if (daysCount<=days){
                    return i;
                }
          }
          return -1;
    }


    private static int calculateCapacity(int[] weights, int maxCapacity) {
        int daysCount=0;  int sum=0;
        for (int i = 0; i < weights.length; i++) {
            sum+=weights[i];
            if (sum>maxCapacity){
                 daysCount++;
                 sum=weights[i];
            }
        }
        if (sum==maxCapacity)
            daysCount+=1;

        if (sum<maxCapacity)
            daysCount+=1;

        return daysCount;
    }
    //TC=> O(N) * log2(high-low+1) high=sum & low=Max Element In An Array
    static int capacityToShipPackagesWithinDDaysWith(int[] weights, int days){
        int high=0; int low=Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            high+=weights[i];
            if (low<weights[i]) {
                low = weights[i];
            }
        }
           while (low<=high){
               int mid = low+((high-low)/2);
               int daysCount=calculateCapacity(weights,mid);
               if (daysCount<=days){
                   high=mid-1;
               }else {
                   low=mid+1;
               }
           }
           return low;
      }

      //TC=>O(N)
      static int kthMissingPositiveNumberWithLinearSearch(int[] input,int k){
          for (int i = 0; i < input.length; i++) {
               if (input[i]<=k){
                    k++;
               }else {
                   break;
               }
          }
           return k;
      }

      //find two nearby Index
      //find the nos
      static int kthMissingPositiveNumber(int[] input,int k){
          int low=0;
           int high=input.length-1;
           int missingNumber = 0;
           while (low<=high){
               int mid = low + ((high-low)/2);
               missingNumber=input[mid]-mid+1;
               if (missingNumber<=k){
                   low=mid+1;
               }else {
                   high=mid-1;
               }
           }
           //MissingNumber=> (input[high]+high+1)
           // or return => low+k
           return input[high]+(k-(input[high]+high+1));
      }


      //TC=> Nlog(N)+ O(N) * O(max-min)
      //SC=> O(1)
      static int aggressiveCowsWithLinearSearch(int[] stalls, int cows){
           int maxDistance=0;
          Arrays.sort(stalls);
          int maxPossibleDist=stalls[stalls.length - 1] - stalls[0];
          for (int i = 1; i <=maxPossibleDist; i++) {
               if(findMinDistance(stalls,cows,i)){
                       maxDistance=i;
               }else {
                   break;
               }
          }
          return maxDistance;
      }

    private static boolean findMinDistance(int[] stalls,int cows,int min) {
        int cowsCount=1;
        int previousCow=0;
        for (int i = 1; i <stalls.length; i++) {
            if ((stalls[i]-stalls[previousCow])>=min){
                previousCow = i;
                cowsCount++;
                if (cowsCount==cows){
                    return true;
                }
            }
        }
        return false;
    }

    //TC=> Nlog(N) + [O(N)*log2(max)]
    //SC=> O(1)
    static int aggressiveCows(int[] stalls, int cows){
        int low=1;
        int ans=0;
        Arrays.sort(stalls);
        int high=stalls[stalls.length - 1]-stalls[0];
        while (low<=high){
            int mid=low+((high-low)/2);
            if (findMinDistance(stalls,cows,mid)){
                ans=mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }

    //TC => O(sum-max+1) * O(N)
    //SC=> O(1)
    static int bookAllocationWithLinearSearch(int[] pages, int students){
        if (pages.length<students){
            return -1;
        }
        int maxPages=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < pages.length; i++) {
              sum+=pages[i];
              if (maxPages<pages[i]){
                  maxPages=pages[i];
              }
        }
        for (int i = maxPages; i <=sum; i++) {
             if (canPageHoldByStudents(pages,students,i)){
                  return i;
             }
        }
        return -1;
    }

    private static boolean canPageHoldByStudents(int[] pages, int students, int page) {
        int sum=0; int studentsCount=1;
        for (int j = 0; j < pages.length; j++) {
            if (sum + pages[j] <= page){
                 sum+=pages[j];
            }else {
                studentsCount++;
                sum=pages[j];

            }
        }
        return students==studentsCount;
    }

    private static int canPageHoldByStudentsForBinarySearch(int[] pages, int students, int page) {
        int sum=0; int studentsCount=1;
        for (int j = 0; j < pages.length; j++) {
            sum+=pages[j];
            if (sum>page){
                studentsCount++;
                sum=pages[j];
            }
        }
        return studentsCount;
    }

    //TC => O(log2(high-low+1) * O(N))
    //SC => O(1)
    static int bookAllocation(int[] pages, int students){
        if (pages.length<students){
            return -1;
        }
        int low=Integer.MIN_VALUE;
        int high=0;
        for (int i = 0; i < pages.length; i++) {
            high+=pages[i];
            if (low<pages[i]){
                low=pages[i];
            }
        }
        while (low<=high){
            int mid = low+((high-low)/2);
             int count=canPageHoldByStudentsForBinarySearch(pages,students,mid);
            if (count<=students){
                  high=mid-1;
            }else {
                low=mid+1;
            }
        }
       return low;
    }


    static int paintersPartition(int[] boards,int painters){
        if (boards.length<painters){
            return -1;
        }
        int low=Integer.MIN_VALUE; int high=0;
        for (int i = 0; i < boards.length; i++) {
            high+=boards[i];
            if (low<boards[i]){
                low=boards[i];
            }
        }
        while (low<=high){
            int mid=low+((high-low)/2);
            int count=calculatePaintersCount(boards,painters,mid);
            if (count<=painters){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    private static int calculatePaintersCount(int[] boards, int painters, int mid) {
        int sum=0;
        int paintersCount=1;
        for (int i = 0; i < boards.length; i++) {
            sum+=boards[i];
            if (sum>mid){
                paintersCount++;
                sum=boards[i];
            }
        }
        return paintersCount;
    }


    static int splitArrayLargestSum(int[] nums,int k){

        if (nums.length<k){
            return -1;
        }
      int low=Integer.MIN_VALUE; int high=0;
        for (int i = 0; i < nums.length; i++) {
            high+=nums[i];
            if (low<nums[i]){
                low=nums[i];
            }
        }
        while (low<=high){
            int mid=low+((high-low)/2);
            int count=calculateMaxSum(nums,k,mid);
            if (count<=k){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    private static int calculateMaxSum(int[] nums, int subArrayCount, int mid) {
        int count=1; int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (sum>mid){
                count++;
                sum=nums[i];
            }
        }
        return count;
    }


    //TC=>((K*input.length) + input.length)
    //SC=>
    static double minimizeMaxDistanceToGasStationWithBruteForceApproach(int[] input,int k){

        int[] howMany=new int[input.length-1];
        for (int gasStation = 1; gasStation<=k ; gasStation++) {
            int maximumValue=-1; int maxIndex=-1;
            for (int j = 0; j <input.length-1; j++) {
                int diff= input[j+1]-input[j];
                int sectionLength=diff/(howMany[j]+1);
                if (maximumValue<sectionLength){
                     maximumValue=sectionLength;
                     maxIndex=j;
                }
            }
            howMany[maxIndex]++;
        }

        int maxAns=-1;
        for (int i = 0; i < input.length-1; i++) {
              int diff=input[i+1]-input[i];
              int sectionLength=diff/(howMany[i]+1);
              if (maxAns<sectionLength){
                  maxAns=sectionLength;
              }
        }
        return maxAns;
    }


    public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }

        //TC=> NlogN + K log N
        //SC=> 0(input.length-1)
        static double minimizeMaxDistanceToGasStationWithBetterApproach(int[] input, int k) {

            int[] howMany = new int[input.length - 1];

            PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));

            for (int i = 0; i < input.length - 1; i++) {
                priorityQueue.add(new Pair((double) input[i + 1] - input[i], i));
            }

            for (int i = 1; i <=k; i++) {
                Pair tp = priorityQueue.poll();
                int index = tp.second;
                howMany[index]++;
                double initialDiff = (input[index + 1] - input[index]);
                double finalDiff=initialDiff/ (double) (howMany[index] + 1);
                priorityQueue.add(new Pair(finalDiff, index));
            }
            assert priorityQueue.peek() != null;
            return priorityQueue.peek().first;
        }
    }

    static double minimizeMaxDistanceToGasStationWithOptimalApproach(int[] input, int k) {
        double low=0; double high=Integer.MIN_VALUE;
        for (int i = 1; i < input.length; i++) {
            if (high<(input[i]-input[i-1])){
                high=(input[i]-input[i-1]);
            }
        }
        while (high-low>1e-6){
            double mid=((low+high)/2.0);
            int count = calculateNoOfGAsStationBetweenThem(input,mid);
            if (count>k){
                low=mid;
            }else {
                high=mid;
            }
        }
        return high;
    }

    private static int calculateNoOfGAsStationBetweenThem(int[] input, double distance) {
        int count=0;
        for (int i = 1; i < input.length; i++) {
            int numberOnBetween = (int) ((input[i] - input[i - 1]) / distance);
            if ((input[i] - input[i - 1]) % distance == 0) {
                System.out.println((input[i] - input[i - 1]) % distance);
                numberOnBetween--;
            }
            count += numberOnBetween;
        }
        return count;
    }

    //TC=> O(N)
    //SC=> O(N)
    static  double medianOfTwoSortedArraysOfDifferentSizesBruteForceApproach(int[] inputOne,int[] inputTwo){
        int size=(inputOne.length)+(inputTwo.length);
        int[] output = new int[size];
        int i=0;
        int j=0;
        for (int count= 0; count <=size; count++) {
            if (i<inputOne.length && j<inputTwo.length && inputOne[i]<inputTwo[j]){
                output[count]=inputOne[i];
                i++;
            } else if (i<inputOne.length && j<inputTwo.length && inputOne[i]>=inputTwo[j]) {
                output[count]=inputTwo[j];
                j++;
            } else if (i<inputOne.length) {
                output[count]=inputOne[i];
                i++;
            }else if (j<inputTwo.length){
                output[count]=inputTwo[j];
                j++;
            }
        }
        if (output.length%2==1){
             return  output[(int) ((double) output.length/2.0)];
        }
         return ((double) (output[output.length /2]) + (double) (output[(output.length /2)-1]))/2.0;
    }

    //TC=> O(N)
    //SC=> O(1)
    static  double medianOfTwoSortedArraysOfDifferentSizesWithBetterApproach(int[] a,int[] b){
        int totalElement=a.length+b.length;
        int indexTwo=totalElement/2;
        int indexOne=indexTwo-1;
        int count=0;
        int indexOneElement=-1;
        int indexTwoElement=-1;
        int i=0;
        int j=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                 if (count==indexOne){
                      indexOneElement=a[i];
                 }
                 if (count==indexTwo){
                     indexTwoElement=a[i];
                 }
                 count++;
                 i++;
            } else {
                if (count==indexOne){
                    indexOneElement=b[j];
                }
                if (count==indexTwo){
                    indexTwoElement=b[j];
                }
                count++;
                j++;
            }
        }

        while (i<a.length){
            if (count==indexOne){
                indexOneElement=a[i];
            }
            if (count==indexTwo){
                indexTwoElement=a[i];
            }
            count++;
            i++;
        }

        while (j<b.length){
            if (count==indexOne){
                indexOneElement=b[j];
            }
            if (count==indexTwo){
                indexTwoElement=b[j];
            }
            count++;
            j++;
        }
        if (totalElement%2==1){
             return indexTwoElement;
        }
        return (double) (indexOneElement + indexTwoElement) /2;
    }

    //TC=>(O(Min(logA,logB)))
    //SC=>O(1)
    static double medianOfTwoSortedArraysOfDifferentSizesWithOptimalApproach(int[] a,int[] b){
        int n=a.length+b.length;
       int n1=a.length;
       int n2=b.length;
        if (n1>n2){
            return medianOfTwoSortedArraysOfDifferentSizesWithOptimalApproach(b,a);
        }
        int low=0;
        int high=a.length-1;
        int left=(n1+n2+1)/2;
        while (low<=high){

            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE; int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE; int r2=Integer.MAX_VALUE;

            if (mid1<n1) r1=a[mid1];
            if (mid2<n2) r2=b[mid2];
            if (mid1-1>=0) l1=a[mid1-1];
            if (mid2-1>=0) l2=b[mid2-1];

            if (l1<=r2 && l2<=r1){
                if (n%2==1) return Math.max(l1,l2);
                return ((double) (Math.max(l1,l2) + Math.min(r1,r2))/2.0);
            } else if (l1>r2) {
                high=mid1-1;
            }else {
                low=mid1+1;
            }
        }
        return 0.0;
    }


    static double kthElementOfTwoSortedArrays(int[] a,int[] b ,int k){

        int low=0;
        int n1=a.length;
        int n2=b.length;
        if (n1>n2){
            return kthElementOfTwoSortedArrays(b,a,k);
        }
        int high=n1;
        while (low<=high){
            int mid1 = (high+low)/2;
            int mid2=k-mid1;
            int l1=Integer.MIN_VALUE; int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE; int r2=Integer.MAX_VALUE;
            if (mid1<n1)r1=a[mid1];
            if (mid2<n2)r2=b[mid2];
            if (mid1-1>=0)l1=a[mid1-1];
            if (mid2-1>=0)l2=b[mid2-1];

            if (l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            } else if (l1>r2) {
                high=mid1+1;
            }else {
                low=mid1+1;
            }
        }
           return 0.0;
    }

}
