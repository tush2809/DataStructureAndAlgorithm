package com.doubleLinkedProblem;

import com.takeUForward.DLLNode;
import com.takeUForward.Node;

import java.util.*;

public class DoubleLL {
    public static void main(String[] args) {

        /*int[] array={2,2,10,8,4,2,5,2};
        int[] array={9,1,3,4,5,1,8,4};
        int[] array={2,5,2,4,8,10,2,2};
         DLLNode head=convertArrayToDLL(array);
         display(head);
         head=deleteAllOccurrencesOfAKeyInDLL(head,2);
        display(head);
        head=deleteAllOccurrencesOfAKeyInDLL(head,9);
        display(head);*/

        /*int[] array={1,2,4,5,6,8,9};
        int[] array={1 ,4, 5, 6, 10, 11, 12, 13, 14, 15, 19, 20, 21, 22, 25, 26, 27, 31, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 47, 48, 49};
        int[] array={1,2,3,4};
        DLLNode head=convertArrayToDLL(array);
        display(head);
        System.out.println(findPairsWithGivenSumInDLLWithBetter(head,31));
        System.out.println(findPairsWithGivenSumInDLLWithBetter(head,7));
        System.out.println(findPairsWithGivenSumInDLLWithBetter(head,31));
        System.out.println(findPairsWithGivenSumInDLLWithBetter(head,5));

        System.out.println(findPairsWithGivenSumInDLLWithOptimal(head,31));
        System.out.println(findPairsWithGivenSumInDLLWithOptimal(head,7));
        System.out.println(findPairsWithGivenSumInDLLWithBetter(head,31));
        System.out.println(findPairsWithGivenSumInDLLWithBetter(head,5));*/


        //int[] array={1,1,1,2,3,4};
       // int[] array={1,2,3,3,4,4};
        int[] array={2,2,2,2,2,2};
        DLLNode head=convertArrayToDLL(array);
        display(head);
        head=removeDuplicatesFromSortedDLL(head);
        display(head);



    }

    private static DLLNode convertArrayToDLL(int[] array){
        DLLNode head =new DLLNode(array[0],null,null);
        DLLNode mover=head;
        for (int i = 1; i < array.length; i++) {
            DLLNode temp = new DLLNode(array[i]);
            temp.prev=mover;
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    private static void display(DLLNode head){
        DLLNode mover=head;
        while (mover!=null){
            System.out.print(mover.value + " -> ");
            mover=mover.next;
        }
        System.out.println("END");
    }


    private static DLLNode deleteAllOccurrencesOfAKeyInDLL(DLLNode head,int target) {
        if (head == null) return null;
        DLLNode mover =head;
        while (head != null && head.value == target) {
            head = head.next;
        }
        if (head != null) head.prev = null;
        mover = head;
        while (mover!=null){

            if (mover.value==target){
                DLLNode prevNode=mover.prev;
                DLLNode nextNode=mover.next;
                if (prevNode != null) prevNode.next = nextNode;
                if (nextNode != null) nextNode.prev = prevNode;
            }
            mover=mover.next;
        }
            return head;
    }


    //Brute Force Approach
    //  TC=> (O(N) & SC=> O(N))
    private static ArrayList<ArrayList<Integer>>  findPairsWithGivenSumInDLL(DLLNode head,int target){
        DLLNode mover=head;
        Map<Integer,Integer> map =new HashMap<>();
        ArrayList<ArrayList<Integer>> outputList=new ArrayList<ArrayList<Integer>>();
        while (mover!=null){
            int temp=target- mover.value;
           if (map.containsKey(temp) && map.get(temp)>0){
               ArrayList<Integer> list = new ArrayList<>();
               list.add(temp);
               list.add(mover.value);
               outputList.add(list);
               map.put(temp, map.get(temp)==0?1:map.get(temp)-1);
           }else {
               map.put(mover.value, map.getOrDefault(mover.value,0)+1);
           }
          mover=mover.next;
        }
        return outputList;
    }

    // Better Approach
    //  TC=> (O(N^2) & SC=> O(1))
    private static ArrayList<ArrayList<Integer>>  findPairsWithGivenSumInDLLWithBetter(DLLNode head,int target){

        DLLNode moverOne=head;
        DLLNode moverTwo=head.next;
        ArrayList<ArrayList<Integer>> outputList=new ArrayList<ArrayList<Integer>>();

        while (moverOne!=null && moverTwo!=null){
            int sum =moverOne.value+moverTwo.value;
            if (sum==target){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(moverOne.value);
                list.add(moverTwo.value);
                outputList.add(list);
            }
            if ((sum>target && moverTwo!=moverOne) || moverTwo.next==null){
                moverOne=moverOne.next;
                moverTwo=moverOne.next;
                continue;
            }
            moverTwo=moverTwo.next;
        }

        return outputList;

    }

    //Optimal Approach
    //
    private static ArrayList<ArrayList<Integer>>  findPairsWithGivenSumInDLLWithOptimal(DLLNode head,int target){
        DLLNode tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        DLLNode left=head;
        DLLNode right=tail;
        ArrayList<ArrayList<Integer>> outputList=new ArrayList<ArrayList<Integer>>();
        while (left.value<right.value){
            int sum= left.value+right.value;
                if (sum==target){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(left.value);
                    list.add(right.value);
                    outputList.add(list);
                    left=left.next;
                } else if (sum<target) {
                    left=left.next;
                }

            if (sum>=target){
                      right=right.prev;
                }
        }
        return outputList;
    }


    private static DLLNode removeDuplicatesFromSortedDLL(DLLNode head){
        DLLNode moverOne=head;
        DLLNode movertwo=head.next;
        while (movertwo!=null){
            if(moverOne.value!=movertwo.value){
                moverOne=moverOne.next;
                movertwo=movertwo.next;

            }else {
                DLLNode prevNode = movertwo.prev;
                DLLNode nextNode = movertwo.next;
                if (nextNode == null) {
                     prevNode.next=null;
                } else{
                    prevNode.next = nextNode;
                    nextNode.prev = prevNode;
                }
                movertwo=nextNode;

            }
        }
     return head;
    }



}
