package com.linkedListProblem;

import javax.swing.*;
import java.util.*;

public class LLHardProblem {
    public static void main(String[] args) {

         /*int[] array={1,2,3,4,5,6,7,8,9,10};
         Node head= convertEvenArrayToLL(array);
         display(head);
         head=reverseNodesInKGroupSizeOfLinkedList(head,3);
        display(head);*/

        /*int[] array={1,2,3,4,5};
        Node head= convertEvenArrayToLL(array);
        display(head);
        head=rotateALL(head,2);
        display(head);*/

       /* FlatteningNode head = new FlatteningNode(5);
        head.child = new FlatteningNode(14);

        head.next = new FlatteningNode(10);
        head.next.child = new FlatteningNode(4);

        head.next.next = new FlatteningNode(12);
        head.next.next.child = new FlatteningNode(20);
        head.next.next.child.child = new FlatteningNode(13);

        head.next.next.next = new FlatteningNode(7);
        head.next.next.next.child = new FlatteningNode(17);*/
       /*
        display(head);
       head =flatteningOfLL(head);
       display(head);*/

        /*FlatteningNode head = new FlatteningNode(4);
        head.child = new FlatteningNode(9);
        head.next = new FlatteningNode(4);
        head.next.child = new FlatteningNode(5);
        head.next.child.child = new FlatteningNode(6);
        head.next.child.child.child = new FlatteningNode(8);
        display(head);
        head=flatteningOfLLWithOptimalForOnlyTwoParent(head,head.next);
        display(head);*/

        /*FlatteningNode head = new FlatteningNode(5);
        head.child = new FlatteningNode(14);

        head.next = new FlatteningNode(10);
        head.next.child = new FlatteningNode(4);

        head.next.next = new FlatteningNode(12);
        head.next.next.child = new FlatteningNode(20);
        head.next.next.child.child = new FlatteningNode(13);

        head.next.next.next = new FlatteningNode(7);
        head.next.next.next.child = new FlatteningNode(17);
        display(head);
        head =flatteningOfLLWithOptimal(head);
        display(head);*/

        /*RandomNode head = new RandomNode(7);
        head.next = new RandomNode(14);
        head.next.next = new RandomNode(21);
        head.next.next.next = new RandomNode(28);

        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;
        display(head);
        head= cloneALinkedListWithRandomAndNextPointer(head);
        display(head);
        head= cloneALinkedListWithRandomAndNextPointerWithOptimalApproach(head);
        System.out.println();
        display(head);


        RandomNode head = new RandomNode(7);
        head.next = new RandomNode(13);
        head.next.next = new RandomNode(11);
        head.next.next.next = new RandomNode(10);
        head.next.next.next.next = new RandomNode(1);

        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;
        display(head);
        head= cloneALinkedListWithRandomAndNextPointer(head);
        display(head);*/


    }

    private static void display(FlatteningNode head) {
        FlatteningNode mover = head;
        while (mover != null) {
            System.out.print(mover.data + " -> ");
            FlatteningNode nextMover=mover.child;
            while (nextMover!=null){
                System.out.print(nextMover.data + " -> ");
                 nextMover=nextMover.child;
            }
            //System.out.println("CHILD END");
            mover = mover.next;

        }
        System.out.println("END");
    }

    private static void display(Node head) {
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.value + " -> ");
            mover = mover.next;
        }
        System.out.println("END");
    }

    private static void display(RandomNode head) {
        RandomNode mover = head;
        while (mover != null) {
            System.out.print(mover.data + " -> ");
            mover = mover.next;
        }
        System.out.println("END");
    }

    public static Node convertEvenArrayToLL(int[] evenArray) {
        Node head = new Node(evenArray[0]);
        Node mover = head;
        for (int i = 1; i < evenArray.length; i++) {
            Node node = new Node(evenArray[i]);
            mover.next = node;
            mover = node;
        }
        return head;
    }

    //Optimal Approach
    // TC=> (O(N) + O(N) => O(2N)) & SC=> O(1))
    private static Node reverseNodesInKGroupSizeOfLinkedList(Node head,int k){
        Node mover=head;
        Node temp;   Node prePrev=null;
        Node prev=null;
        boolean isContinue=true;  int count=k;
        Node checker;
        while (mover!=null){
            checker=mover;
             while (count!=0) {
                 if (checker == null) {
                     isContinue = false;
                     break;
                 }
                 checker = checker.next;
                 count--;
             }
            if (!isContinue) {
                break;
            }
                     count=k;
                    Node start = mover;
                     while (count!=0){
                         temp=mover.next;
                         mover.next=prev;
                         prev=mover;
                         mover=temp;
                         count--;
                     }

                 if (prePrev!=null){
                     prePrev.next=prev;
                 }else {
                     head=prev;
                 }
                 start.next=mover;
                 count=k;
                 prePrev=start;
                 prev=null;
                 isContinue=true;

        }
        return head;
    }


    private static Node rotateALL(Node head,int k){
        if (k==0 || head==null)
            return head;

        int count=1;
        Node mover=head;
        while (mover.next!=null){
            count++;
            mover=mover.next;
        }

        if (k%count==0)
              return head;
         mover.next=head;
        for (int i = 0; i < count-k; i++) {
              mover=mover.next;
        }
        head=mover.next;
        mover.next=null;
        return head;
    }

     // Brute Force Approach
     // TC=> (O(N*M) +O(N*M) + O(x(logx)) => (O(2(N*M) + O(x(logx)))) & SC=> O(N*M))
     private static FlatteningNode flatteningOfLL(FlatteningNode head){

        FlatteningNode mover=head;
        List<Integer> nodeList=new ArrayList<>();

        while (mover!=null){
              nodeList.add(mover.data);
             FlatteningNode childMover=mover.child;
            while (childMover!=null){
                 nodeList.add(childMover.data);
                 childMover=childMover.child;
            }
            mover=mover.next;
        }
        Collections.sort(nodeList);
        head=new FlatteningNode(nodeList.get(0));
        mover=head;
        for (int i = 1; i < nodeList.size(); i++) {
            FlatteningNode temp=new FlatteningNode(nodeList.get(i));
            mover.next=temp;
            mover=temp;
        }
        return head;
    }



    private static FlatteningNode flatteningOfLLWithOptimalForOnlyTwoParent(FlatteningNode t1,FlatteningNode  t2){
        FlatteningNode dummyNode=new FlatteningNode(-1);
        FlatteningNode mover=dummyNode;
        FlatteningNode temp;
        while (t1!=null && t2!=null){
              if (t1.data> t2.data){
                 // temp=new FlatteningNode(t2.data);
                  // mover.child=temp;
                  mover.child=t2;
                  t2=t2.child;
              }else {
                 // temp=new FlatteningNode(t1.data);
                  //mover.child=temp;
                  mover.child=t1;
                  t1=t1.child;
              }
              mover.next=null;
              mover=mover.child;
        }
        if (t1 != null){
            mover.child=t1;
        } else {
            mover.child=t2;
        }
        return dummyNode.child;
    }

     private static FlatteningNode flatteningOfLLWithOptimal(FlatteningNode head){
        if (head==null || head.next==null){
            return head;
        }
       FlatteningNode mergeHead=flatteningOfLLWithOptimal(head.next);
        return flatteningOfLLWithOptimalForOnlyTwoParent(head,mergeHead);

    }

    // Brute Force Approach
    // TC=> (O(N) +O(N) => O(2N) ) & SC=> O(N) + O(N)=> Copy Of Node (265 line))
    private static RandomNode cloneALinkedListWithRandomAndNextPointer(RandomNode head){
        RandomNode mover=head;
        Map<RandomNode,RandomNode> map=new HashMap<>();
        while (mover!=null){
            RandomNode newNode=new RandomNode(mover.data);
            map.put(mover,newNode);
            mover=mover.next;
        }
        mover=head;
        while (mover!=null){
            RandomNode copyNode=map.get(mover);
            copyNode.next=map.get(mover.next);
            copyNode.random=map.get(mover.random);
            mover=mover.next;
        }
        return map.get(head);
    }


    // Optimal Approach
    // TC=> (O(N) +O(N) +O(N) => O(3N) ) & SC=> O(N) => Use for return not considering)
    private static RandomNode cloneALinkedListWithRandomAndNextPointerWithOptimalApproach(RandomNode head){

        if (head==null)
            return null;

        RandomNode mover=head;
        RandomNode dummyNode=new RandomNode(-1);
        RandomNode res=dummyNode;

        // Step 1: Create copy nodes and insert them in between the original nodes
        while (mover!=null){
            RandomNode newNode=new RandomNode(mover.data);
            RandomNode temp=mover.next;
            mover.next=newNode;
            newNode.next=temp;
            mover=mover.next.next;
        }

        // Step 2: Assign correct random pointers
        mover=head;
        while (mover!=null){
            mover.next.random=mover.random;
            mover=mover.next.next;
        }

        mover=head;

        // Step 3: Separate the original list from the cloned list
        while (mover!=null){
         res.next=mover.next;
         res=res.next;
         mover.next=res.next;
         mover=mover.next;
        }
        return dummyNode.next;
    }





    
}
