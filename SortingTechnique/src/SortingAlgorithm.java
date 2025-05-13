import java.util.Arrays;
import java.util.List;

public class SortingAlgorithm {
    public static void main(String[] args) {

        /*int[] input ={13,46,24,52,20,9};
        int[]  input ={9, 13, 20, 24, 46, 52};
        System.out.println(Arrays.toString(bubbleSort(input)));
        System.out.println(Arrays.toString(selectionSort(input)));
        System.out.println(Arrays.toString(insertionSort(input)));*/

        /*int[] cyclicSortInput ={3,5,2,1,4};
        System.out.println(Arrays.toString(cyclicSort(cyclicSortInput)));*/

        //int[] input={23,29,15,19,31,7,9,5,2};
        int[] input={8,10,76,65,946,93837,785983,36578,3285,332};

        System.out.println(Arrays.toString(shellSort(input)));



        /*List<Integer> addElement= new ArrayList<>();
        addElement.add(39);
        addElement.add(70);
        addElement.add(10);
        addElement.add(9);
        addElement.add(50);
        addElement.add(45);
        addElement.add(16);
        addElement.add(40);
        addElement.add(35);
        addElement.add(60);
        addElement.add(5);
        addElement.add(80);
        List<Integer> maxHeap = insertionInHeapSort(new ArrayList<>(),addElement);
        System.out.println(deletionInHeapSort(maxHeap));
        System.out.println(heapSort(new ArrayList<>(),addElement));*/



    }

    private static void swap(List<Integer> input,int x, int y){
        int temp=input.get(x);
        input.set(x,input.get(y));
        input.set(y,temp);
    }

    private static void swap(int[] input,int x, int y){
        int temp=input[x];
        input[x]=input[y];
        input[y]=temp;
    }


    //Push the max to the last by adjacent swaps
    //Worst Complexity (TC=> O(N^2) & SC=> O(1))
    //& Best Complexity=(TC=> O(N) & SC=> O(1))
     static int[] bubbleSort(int[] input){
        boolean isSwap=false;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length-1-i; j++) {
                if (input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                    isSwap=true;
                }
            }
            if (!isSwap){
                break;
            }
        }
        return input;
    }

    //Select Minimum and swap
   // Worst & Best Complexity (TC=> O(N^2) & SC=> O(1))
    static int[] selectionSort(int[] input){

        for (int i = 0; i < input.length; i++) {
            int min=i;
            for (int j = i; j < input.length; j++) {
                if (input[min]>input[j]){
                   min=j;
                }
            }
            int temp=input[i];
            input[i]=input[min];
            input[min]=temp;
        }
        return input;
    }

    //Take an element & place at it correct place
    //Worst & Best Complexity (TC=> O(N^2) & SC=> O(1))
    static int[] insertionSort(int[] input){
        for (int i = 1; i < input.length; i++) {
             int j=i;
             while (j>0){
                  if (input[j]<input[j-1]){
                       int temp = input[j-1];
                       input[j-1]=input[j];
                       input[j]=temp;
                  }
                  j--;
             }
        }
        return input;
    }

     // Worst Case (TC => O(N) + O(N-1)=> O(2N-1) => O(N) & SC=> O(1))
     // Best Case (TC=> O(N-1) =>  O(N) & SC=> O(1))

     // 0 1 2 3 4
     //  3,5,2,1,4   2!=3
     //  2,5,3,1,4   5!=2
     //  5,2,3,1,4   4!=5
     //  4,2,3,1,5   4!=1
     //  1,2,3,4,5   1!=1
     // i++    i=1   2!=2
     // i++    i=2   3!=3
     //i++     i=3   4!=4
     //i++     i=4   5!=5
     //i++     i=5
    static int[] cyclicSort(int[] input){
         int i=0;
        while (i<input.length){
             int index = input[i]-1;
            if (index!=i){
                int temp=input[index];
                input[index]=input[i];
                input[i]=temp;
            }else {
                i++;
            }
        }
        return input;
    }

    // Worst Case (TC => O(N^2) & SC => O(1))
    // Best Case (TC => O(NlogN) & SC => O(1))
    static int[] shellSort(int[] input){
        int gap=(input.length)/2;
         while (gap>0){
             int i=0;
             int j=gap;
             while (j<input.length){
                 if (input[i]>input[j]){
                     swap(input,i,j);
                     int backIndex=i-gap;
                     int k=i;
                     while (backIndex>=0){
                             if (input[backIndex]>input[k]){
                                 swap(input,backIndex,k);
                                 k--;
                                 backIndex--;
                             }else {
                                 break;
                             }
                         }
                     }
                 i++;
                 j++;
             }
             gap=gap/2;
         }
         return input;
    }




}