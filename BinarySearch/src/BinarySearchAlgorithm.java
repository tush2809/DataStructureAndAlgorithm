public class BinarySearchAlgorithm {
    public static void main(String[] args) {

        int[] input = {3,4,6,7,9,12,16,17};
        System.out.println( binarySearch(input,12));

    }

    static int binarySearch(int[] input,int target){
         int low=0;
         int high=input.length-1;
         while (low<=high){
              int mid = low + (high - low)/2;
              if (input[mid]<target){
                   low=mid+1;
              } else if (input[mid]>target) {
                  high=mid-1;
              }else {
                  return mid;
              }
         }
        return -1;
    }
}