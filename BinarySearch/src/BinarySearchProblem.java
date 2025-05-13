import java.rmi.dgc.VMID;
import java.security.KeyPair;
import java.util.Arrays;

public class BinarySearchProblem {
    public static void main(String[] args) {

        /*int[] input={3,5,8,15,19,19,19};
        System.out.println(lowerBound(input,8));*/

        /*int[] input={2,3,6,7,8,8,11,11,11,12};
        System.out.println(upperBound(input,0));*/

       /* int[] input={1,2,4,7};
        System.out.println(elementInsertAtCorrectPosition(input,8));*/

        /*int[] input={10,20,30,40,50};
        int[] input={3, 4, 4, 7, 8, 10};
        System.out.println(Arrays.toString(floorAndCeilNumber(input, 2)));*/

        /*int[] input={2,4,6,8,8,8,11,13};
        int[] findOutNumberOfOccurrence={1,1,1,2,2,3,3,3,3};
        System.out.println(Arrays.toString(firstAndLastOccurrencesInArray(input,8)));
        System.out.println(Arrays.toString(firstAndLastOccurrencesInArray(findOutNumberOfOccurrence,1)));*/

        /*int[] input = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(searchElementInRotatedSortedArrayForUniqueElements(input, 1));*/

        /*int[] input={3,1,2,3,3,3,3};
        System.out.println(searchElementInRotatedSortedArrayForDuplicateElements(input,2));*/

        /*int[] input={7,8,0,1,2,3,4,5,6};
        int[] input={30, 40, 50, 10, 20};
        int[] input= {2, 1};
        int[] input={1, 2, 3, 4, 5};
        int[] input={7, 8, 9, 1, 2, 3, 4, 5, 6};
        int[] input={3};
        int[] input= {2, 2, 2, 2};
        System.out.println(minimumInRotatedSortedArrayUniqueElements(input));*/

        /*
           int[] input={4,5,6,7,0,1,2};
           int[] input={7,8,0,1,2,3,4,5,6};
           int[] input={1, 2, 3, 4, 5};
           int[] input={3};
           System.out.println(findOutHowManyTimesArrayHasBeenRotated(input));
       */


         /*int[] input={1,1,2,2,3,3,4,4,5,6,6};
         int[] input={1,1,2,3,3,4,4,5,5,6,6};
         int[] input={2, 3, 3, 4, 4, 5, 5};
         int[] input= {1, 1, 2, 2, 3, 3, 7};
        int[] input={1};
        System.out.println(singleElementInSortedArray(input));*/

        /*
        int[] input={1,2,3,4,5,6,7,8,5,1};
        int[] input={1,10,13,7,6,5,4,2,1,0};
        int[] input={1,2,1,3,5,6,7};
        int[] input={1,2,3,4,5};
        int[] input={5,4,3,2,1};
        int[] input={1};
        System.out.println(findPeakElement(input));
        */

    }

    //smallest element is an array greater or equal to target.
    // input[index]>=target
    static int lowerBound(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        int ans = input.length;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (input[mid] < target) {
                low = mid + 1;
            } else if (input[mid] >= target) {
                high = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }

    //input[index]>target
    static int upperBound(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        int ans = input.length;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (input[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int elementInsertAtCorrectPosition(int[] input, int insertElement) {
        int low = 0;
        int high = input.length - 1;
        int elementCorrectPosition = input.length;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (input[mid] >= insertElement) {
                high = mid - 1;
                elementCorrectPosition = mid;
            } else if (input[mid] < insertElement) {
                low = mid + 1;
            }
        }
        return elementCorrectPosition;
    }

    //floorNumber=>  the largest element in the array <= X
    //Ceiling Number=> the smallest element in the array >= X.
    static int[] floorAndCeilNumber(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        int floor = -1;
        int ceil = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (input[mid] == target) {
                floor = mid;
                ceil = mid;
            }
            if (input[mid] > target) {
                high = mid - 1;
                ceil = mid;
            } else if (input[mid] < target) {
                low = mid + 1;
                floor = mid;
            }
        }
        return new int[]{
                floor == -1 ? -1 : input[floor],
                ceil == -1 ? -1 : input[ceil]
        };
    }

    //Number Of Occurrence
    static int[] firstAndLastOccurrencesInArray(int[] input, int target) {

        int first = lowerBoundOfAnElement(input, target);
        int last = upperBoundOfAnElement(input, target);

        return new int[]{first, last};
    }

    private static int lowerBoundOfAnElement(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (input[mid] >= target) {
                high = mid - 1;
                ans = mid;
            } else if (input[mid] < target) {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int upperBoundOfAnElement(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (input[mid] > target) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans - 1;
    }

    // Identify Which Part Is Sorted
    // If left part is sorted then check target element is exist or not. => low  mid  high => [low<=target<=mid] => high=mid-1;
    // If right part is sorted then check target element is exist or not. => low  mid  high => [mid<=target<=high] => low=mid+1;
    private static int searchElementInRotatedSortedArrayForUniqueElements(int[] input, int target) {

        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (input[mid] == target) {
                return mid;
            }
            //Left Part Sorted
            if (input[low] <= input[mid]) {
                if (input[low] <= target && target <= input[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                // Right Part Sorted
            } else {
                if (input[mid] <= target && target <= input[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int searchElementInRotatedSortedArrayForDuplicateElements(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (input[low] == input[mid] && input[mid] == input[high] && input[mid] != target) {
                low = low + 1;
                high = high - 1;
                continue;
            } else {
                if (input[mid] == target) {
                    return mid;
                }
            }

            if (input[low] <= input[mid]) {
                if (input[low] <= target && target <= input[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (input[mid] <= target && target <= input[high]) {
                    low = mid - 1;
                } else {
                    high = mid - 1;
                }
            }


        }
        return -1;
    }

    // Here,If array is rotated,  In left side low is minimum & right hand side mid is minimum
    static int minimumInRotatedSortedArrayUniqueElements(int[] input) {
        int low = 0;
        int high = input.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (input[low]==input[high]){
                if (ans > input[low]) {
                    ans = input[low];
                }
                break;
            }

            if (input[low] <= input[mid]) {
                if (ans > input[low]) {
                    ans = input[low];
                }
                low = mid + 1;
            } else {
                if (ans > input[mid]) {
                    ans = input[mid];
                }
                high = mid - 1;
            }
        }
        return ans;
    }

    static int  findOutHowManyTimesArrayHasBeenRotated(int[] input){
        int low=0;
        int high=input.length-1;
        int ans=Integer.MAX_VALUE;
       int index=-1;
        while (low<=high){
            int mid= low+((high-low)/2);
            if (input[low]==input[high]){
                if (ans > input[low]) {
                    index =low;
                }
                break;
            }
            if (input[low]<=input[mid]){
                 if (ans>input[low]){
                     index=low;
                      ans=input[low];
                 }
                low=mid+1;
            }else {
                if (ans>input[high]){
                    index=mid;
                    ans=input[mid];
                }
                high=mid-1;
            }
        }
        return index;
    }

    //[even,odd] => element present in left side.
    // [odd, even] => element present in right side.
    // how to recognize one element in which side.
    //If [mid-1] is even then element is surely present in right side otherwise left side
    static int singleElementInSortedArray(int[] input){
        int low=0;
        int high=input.length-1;
        if (input[low]==input[high]){
            return input[low];
        }
        if (input[0] != input[1]){
            return input[0];
        }
        if (input[input.length-1] != input[input.length-2]){
            return input[input.length-1];
        }

        low=1;
        high=input.length-2;

        while (low<=high){
            int mid= low+ ((high-low)/2);

            if (input[mid]!=input[mid-1] && input[mid]!=input[mid+1]){
                return input[mid];
            }

            if (input[mid]==input[mid-1]){
                if ((mid-1)%2==0){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }else {
                if (mid%2==0){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }


    // Peak Element => [mid-1]<[mid]>[mid+1]
    // How we can recognize peak element is which side ?
    // If [mid-1]<[mid] => right side otherwise left side.
    static int  findPeakElement(int[] input){

         int low=0;
         int high=input.length-1;

         if (input[low]==input[high])
             return input[low];

         while (low<=high){
             int mid=low+ ((high-low)/2);
             if (mid==0 && input[mid+1]<input[mid]){
                 return input[mid];
             }
             if (mid==input.length-1 && input[mid-1]<input[mid]){
                 return input[mid];
             }
             if (input[mid-1]<input[mid] && input[mid]>input[mid+1]){
                  return input[mid];
             }
             if (input[mid-1]<input[mid]){
                  low=mid+1;
             }else {
                 high=mid-1;
             }
         }
        return -1;
    }




}
