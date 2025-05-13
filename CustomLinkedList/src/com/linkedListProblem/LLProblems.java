package com.linkedListProblem;

import java.time.temporal.Temporal;
import java.util.*;

public class LLProblems {
    public static void main(String[] args) {

        int[] oddArray = {1, 2, 3, 4, 5};
        int[] evenArray = {1, 2, 3, 4, 5, 6};

        /*
        Node head=convertOddArrayToLL(oddArray);
        display(head);
        System.out.println("Odd Array Middle Element " + findMiddleElement(head).value);
        System.out.println("Odd Array Middle Element " +
                  findMiddleElementWithOptimalApproach(head).value);
        head=convertEvenArrayToLL(evenArray);
        display(head);
        System.out.println("Even Array Middle Element " + findMiddleElement(head).value);
        System.out.println("Even Array Middle Element " +
                findMiddleElementWithOptimalApproach(head).value);
          */

        /*
        Node head=convertOddArrayToLL(oddArray);
        display(head);
        head=reverseLinkedList(head);
        display(head);
        head=reverseLinkedListWithOptimal(head);
        display(head);*/

        /*
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(6);
        Node sixth = new Node(7);
        Node seventh = new Node(8);
        Node eight = new Node(9);
        Node nine = new Node(10);
        head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next=seventh;
        seventh.next=eight;
        eight.next=nine;
        nine.next=third;
        nine.next=null;

        Node head=new Node(1);
        Node second=new Node(2);
        head.next=second;
        second.next=head;

        Node head=new Node(1);
        head.next=head;

        System.out.println(detectALoopInLL(head));
        System.out.println(detectALoopInLLWithOptimal(head));
        */

        /*Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(15);
        Node fifth = new Node(4);
        Node sixth = new Node(13);
        Node seventh = new Node(6);
        Node eight = new Node(7);
        Node nine = new Node(8);
        Node tenth = new Node(9);
        head.next=second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next=seventh;
        seventh.next=eight;
        eight.next=nine;
        nine.next=tenth;
        tenth.next=fourth;
        //tenth.next=null;
        //System.out.println(findTheStartingPointInLL(head).value);
        System.out.println(findTheStartingPointInLLWithOptimal(head).value);*/

       /*
       int[] evenArrayForPal={1,2,3,3,2,1};
        int[] oddArrayForPal={1,2,3,2,1};
        Node head=convertOddArrayToLL(oddArrayForPal);
        System.out.println(checkIfALinkedListIsPalindromeOrNotWithBrute(head));
        System.out.println(checkIfALinkedListIsPalindromeOrNot(head));
        */

        /*
        int[] array={1,3,4,2,5,6,7};
        Node head=convertOddArrayToLL(array);
        head=segrregateOddAndEvenNodesInLL(head);
        display(head);
        head=segrregateOddAndEvenNodesInLLWithOptimal(head);
        display(head);
        */


       /* int[] array={1,2,3,4,5};
        Node head=convertOddArrayToLL(array);
        display(head);
        head=removeNthNodeFromTheBackOfTheLL(head,5);
        display(head);
        head=removeNthNodeFromTheBackOfTheLLWithOptimal(head,5);
        display(head);*/

       /* int[] array={1,3,4,7,1,2,6};
        int[] array={1,2,3,4};
        int[] array={2,1};
        int[] array={1};
        Node head=convertOddArrayToLL(array);
        head=deleteTheMiddleNodeOfLL(head);
        display(head);*/

       /* int[] array={3,4,2,1,5};
        Node head=convertOddArrayToLL(array);
        head=sortLL(head);
        display(head);*/

       /* int[] array={1,0,1,2,0,2,1};
        int[] array={0,0,0,0};
        int[] array={0,1,0,1,0,1};
        int[] array={0,2,0,2,2,2};
        Node head=convertOddArrayToLL(array);
        head=sortALLOf0s1sAnd2sByChangingLinks(head);
        display(head);
        head=sortALLOf0s1sAnd2sByChangingLinksWithOptimal(head);
        display(head);*/


        /*
        Node firstHead = new Node(3);
        Node second = new Node(1);
        Node common = new Node(4);
        Node fourth = new Node(6);
        Node fifth = new Node(2);
        Node secondHead = new Node(1);
        Node one = new Node(2);
        Node two = new Node(4);
        Node three = new Node(5);
        Node five = new Node(6);
        Node six = new Node(2);
        firstHead.next = second;
        second.next = common;
        common.next = fourth;
        fourth.next = fifth;
        secondHead.next = one;
        one.next = two;
        two.next = three;
        three.next = common;
        common.next = five;
        five.next = six;

        *//*Node firstHead = new Node(3);
        Node second = new Node(1);
        firstHead.next=second;
        second.next=null;
        Node secondHead = new Node(1);
        Node one = new Node(2);
        Node two = new Node(4);
        Node three = new Node(5);
        secondHead.next=one;
        one.next=two;
        two.next=three;
        three.next=null;*//*

        display(firstHead);
        display(secondHead);

        System.out.println(findTheIntersectionPointOfYLL(firstHead,secondHead));
        System.out.println(findTheIntersectionPointOfYLLWithBetter(firstHead,secondHead));
        System.out.println(findTheIntersectionPointOfYLLWithOptimal(firstHead, secondHead));
        */


        /*int[] array={1,5,9};
        int[] array={9,9,9,9};
        Node head=convertOddArrayToLL(array);
        head=add1ToANumberRepresentedByLL(head);
        head=add1ToANumberRepresentedByLLWithBetter(head);
        display(head);*/

       /* int[] array1={3,8,7};
        int[] array2={5,2,4};
        int[] array1={9,9,9,9,9,9,9};
        int[] array2={9,9,9,9};
        int[] array1={0};
        int[] array2={0};
        Node firstHead=convertOddArrayToLL(array1);
        Node secondHead=convertOddArrayToLL(array2);
        Node head=addTwoNumbersInLL(firstHead,secondHead);
        display(head);*/
    }

    private static void display(Node head) {
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.value + " -> ");
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

    private static Node convertOddArrayToLL(int[] oddArray) {
        Node head = new Node(oddArray[0]);
        Node mover = head;
        for (int i = 1; i < oddArray.length; i++) {
            Node node = new Node(oddArray[i]);
            mover.next = node;
            mover = node;
        }
        return head;
    }

    //Brute Force Approach
    //TC=> (O(N+N/2) & SC=> O(1))
    private static Node findMiddleElement(Node head) {
        Node mover = head;
        if (head == null || head.next == null) {
            return head;
        }
        int count = 1;
        while (mover.next != null) {
            count++;
            mover = mover.next;
        }
        int mid = ((count / 2) + 1);
        count = 1;
        mover = head;
        while (mover != null) {
            if (count == mid) {
                return mover;
            }
            count++;
            mover = mover.next;
        }
        return head;
    }

    // OptimalApproach
    // TC=> (O(N/2) & SC=> O(1))
    private static Node findMiddleElementWithOptimalApproach(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    //Brute Force Approach
    //TC=> ((O(N+N)=>2N) & SC=> O(N))
    private static Node reverseLinkedList(Node head) {
        Node mover = head;
        Stack<Integer> stack = new Stack<>();
        while (mover != null) {
            stack.push(mover.value);
            mover = mover.next;
        }
        Node newHead = new Node(stack.pop());
        Node temp = newHead;
        while (!stack.isEmpty()) {
            temp.next = new Node(stack.pop());
            temp = temp.next;
        }
        return newHead;
    }

    //Optimal Approach
    //TC=> (O(N) & SC=> O(1))
    private static Node reverseLinkedListWithOptimal(Node head) {
        Node prev = null;
        Node front = null;
        Node temp = head;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = prev;
        return head;
    }

    //Brute Force Approach
    //TC=> (O(N) & SC=> O(N))
    private static boolean detectALoopInLL(Node head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if (map.containsKey(temp.value)) {
                return true;
            }
            map.put(temp.value, 1);
            temp = temp.next;
        }
        return false;
    }

    //Optimal Force Approach
    //TC=> (O(N) & SC=> O(1))
    private static boolean detectALoopInLLWithOptimal(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //Brute Force Approach
    //TC=> (O(N) & SC=> O(N))
    private static Node findTheStartingPointInLL(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();
        Node mover = head;
        while (mover != null) {
            if (map.containsKey(mover)) {
                return mover;
            }
            map.put(mover, 1);
            mover = mover.next;
        }
        return null;
    }


    /*Better Approach => first detect The Cycle and then slow pointing to
    head and fast is place where we find the detect looping and then both move simultaneously step 1.*/
    //TC=> (O(N) & SC=> O(1))
    private static Node findTheStartingPointInLLWithOptimal(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }


    // Brute Force Approach
    // TC=> (O(N) & SC=> O(N))
    private static int findTheLengthOfTheLoopInLinkedList(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();
        Node mover = head;
        int count = 0;
        while (mover != null) {
            if (map.containsKey(mover)) {
                int val = map.get(mover);
                return count - val;
            }
            map.put(mover, count++);
            mover = mover.next;
        }
        return 0;
    }

    //Optimal Approach
    //TC=> (O(N) & SC=> O(1))
    private static int findTheLengthOfTheLoopInLinkedListWithOptimal(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countLoopLength(slow, fast);
            }
        }
        return 0;
    }

    private static int countLoopLength(Node slow, Node fast) {
        int count = 1;
        fast = fast.next;
        while (slow != fast) {
            fast = fast.next;
            count++;
        }
        return count;
    }


    // Brute Force Approach
    // TC=> (O(2N) & SC=> O(N))
    static boolean checkIfALinkedListIsPalindromeOrNotWithBrute(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node mover = head;
        while (mover != null) {
            stack.push(mover.value);
            mover = mover.next;
        }
        mover = head;
        while (mover != null) {
            if (mover.value != stack.pop()) {
                return false;
            }
            mover = mover.next;
        }
        return true;
    }


    //Optimal Approach
    // TC=> (O(N/2) + O(N/2) + O(N/2) + O(N/2) =>  O(2N) & SC=> O(1))
    static boolean checkIfALinkedListIsPalindromeOrNot(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseLL(slow.next);
        Node first = head;
        Node second = newHead;
        while (first != null && second != null) {
            if (first.value != second.value) {
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
    }

    private static Node reverseLL(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Brute Force Approach
    // TC=> (O(2N) & SC=> O(N))
    private static Node segrregateOddAndEvenNodesInLL(Node head) {
        List<Integer> temp = new ArrayList<>();
        Node odd = head;
        Node even = head.next;
        while (odd != null && odd.next != null) {
            temp.add(odd.value);
            odd = odd.next.next;
        }
        if (odd != null) {
            temp.add(odd.value);
        }

        while (even != null && even.next != null) {
            temp.add(even.value);
            even = even.next.next;
        }
        if (even != null) {
            temp.add(even.value);
        }
        return convertToLL(temp);
    }

    private static Node convertToLL(List<Integer> list) {
        Node head = new Node(list.get(0));
        Node mover = head;
        for (int i = 1; i < list.size(); i++) {
            Node temp = new Node(list.get(i));
            mover.next = temp;
            mover = temp;
        }
        return head;
    }


    // Optimal Approach
    // TC=> (O(N) & SC=> O(1))
    private static Node segrregateOddAndEvenNodesInLLWithOptimal(Node head) {
        Node odd = head;
        Node evenHead = head.next;
        Node even = head.next;
        while (even != null && even.next != null) {

            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }


    // Brute Force Approach
    // TC=> ( O(length of LL) + O(length Of LL - n) = O(2 * length Of LL)  && SC=> O(1))
    private static Node removeNthNodeFromTheBackOfTheLL(Node head, int n) {
        Node mover = head;
        int count = 0;
        while (mover != null) {
            count++;
            mover = mover.next;
        }
        if (count == n) {
            return head.next;
        }
        int result = count - n;
        mover = head;
        while (mover != null) {
            if (result == 1) {
                break;
            }
            result--;
            mover = mover.next;
        }
        mover.next = mover.next.next;
        return head;
    }


    // Optimal Approach
    // TC=> (O(N) & SC=> O(1))
    private static Node removeNthNodeFromTheBackOfTheLLWithOptimal(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    // Optimal Approach
    // TC=> (O(N/2) & SC=> O(1))
    private static Node deleteTheMiddleNodeOfLL(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        fast = fast.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    // Brute Force Approach
    // TC=> (O(N) + NlogN + O(N)  && SC=> O(N))
    private static Node sortLL(Node head) {
        Node mover = head;
        List<Integer> list = new ArrayList<>();
        while (mover != null) {
            list.add(mover.value);
            mover = mover.next;
        }
        Collections.sort(list);
        Node newHead = new Node(list.getFirst());
        mover = newHead;
        for (int i = 1; i < list.size(); i++) {
            Node temp = new Node(list.get(i));
            mover.next = temp;
            mover = temp;
        }
        return newHead;

    }

    // Optimal Approach => Using Merge Sort OR Quick Sort but here preferred Merge Sort
    // TC=> (O(N/2) & SC=> O(1))
    private static Node sortLLWithOptimalApproach(Node head) {
        return head;
    }


    // Brute Force Approach
    // TC=> (O(2N) & SC=> O(1))
    private static Node sortALLOf0s1sAnd2sByChangingLinks(Node head) {

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        Node mover = head;

        while (mover != null) {
            if (mover.value == 0) {
                countZero++;
            } else if (mover.value == 1) {
                countOne++;
            } else {
                countTwo++;
            }
            mover = mover.next;
        }

        int totalCount = countZero + countOne + countTwo;
        mover = head;
        while (totalCount != 0) {
            if (countZero != 0) {
                mover.value = 0;
                countZero--;
            } else if (countOne != 0) {
                mover.value = 1;
                countOne--;
            } else {
                mover.value = 2;
                countTwo--;
            }
            mover = mover.next;
            totalCount--;
        }
        return head;
    }

    //Optimal Approach
    // TC=> (O(2N) & SC=> O(1))
    private static Node sortALLOf0s1sAnd2sByChangingLinksWithOptimal(Node head) {

        Node zeroHead = new Node(-1);
        Node zeroMover = zeroHead;

        Node oneHead = new Node(-1);
        Node oneMover = oneHead;

        Node twoHead = new Node(-1);
        Node twoMover = twoHead;
        Node mover = head;
        while (mover != null) {
            if (mover.value == 0) {
                zeroMover.next = mover;
                zeroMover = mover;
            } else if (mover.value == 1) {
                oneMover.next = mover;
                oneMover = mover;
            } else {
                twoMover.next = mover;
                twoMover = mover;
            }
            mover = mover.next;
        }

        zeroMover.next = oneHead.next != null ? oneHead.next : twoHead.next;
        oneMover.next = twoHead.next != null ? twoHead.next : null;
        twoMover.next = null;
        return zeroHead.next;
    }


    // Brute Force Approach
    // TC=> (O(length of First Linked List) + O(length of second Linked List) & SC=> O(N))
    private static Node findTheIntersectionPointOfYLL(Node firstHead, Node secondHead) {
        Node moverOne = firstHead;
        Node moverTwo = secondHead;
        Map<Node, Integer> map = new HashMap<>();
        while (moverOne != null) {
            map.put(moverOne, 1);
            moverOne = moverOne.next;
        }

        while (moverTwo != null) {
            if (!map.containsKey(moverTwo)) {
                map.put(moverTwo, 1);
            } else {
                return moverTwo;
            }
            moverTwo = moverTwo.next;
        }
        return null;
    }


    // Better Approach
    // TC=> (O(N1) + O(N2) + O(N2-N1) + O(N1)=> O(N1 +2N2)) & SC=> O(1  ))
    private static Node findTheIntersectionPointOfYLLWithBetter(Node firstHead, Node secondHead) {
        Node moverOne = firstHead;
        Node moverTwo = secondHead;
        int countOne = 0;
        int countTwo = 0;

        while (moverOne != null) {
            countOne++;
            moverOne = moverOne.next;
        }

        while (moverTwo != null) {
            countTwo++;
            moverTwo = moverTwo.next;
        }

        int result = 0;

        if (countOne < countTwo) {
            result = countTwo - countOne;
            moverTwo = secondHead;
            moverOne = firstHead;
            while (result != 0) {
                result--;
                moverTwo = moverTwo.next;
            }
        } else {
            result = countOne - countTwo;
            moverOne = firstHead;
            moverTwo = secondHead;
            while (result != 0) {
                result--;
                moverOne = moverOne.next;
            }
        }

        while (moverOne != null && moverTwo != null) {
            if (moverOne == moverTwo) {
                return moverOne;
            }
            moverOne = moverOne.next;
            moverTwo = moverTwo.next;
        }
        return null;
    }



    // Optimal Approach
    // TC=> (O(N1) + O(N2)) & SC=> O(1))
    private static Node findTheIntersectionPointOfYLLWithOptimal(Node firstHead, Node secondHead) {
         if (firstHead==null || secondHead==null){
             return null;
         }
        Node temp1 = firstHead;
        Node temp2 = secondHead;
        while (temp1!=temp2) {
            if (temp1== null)
                temp1 = secondHead;
            if (temp2 == null)
                temp2 = firstHead;
            if (temp1 == temp2)
                return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    //Brute Force Approach
    private static Node add1ToANumberRepresentedByLL(Node head){
        if (head==null){
            return null;
        }
        StringBuilder temp= new StringBuilder();
        Node mover=head;
        while (mover!=null){
            temp.append(mover.value);
            mover=mover.next;
        }
        int value= Integer.parseInt(temp.toString()) + 1;
        head = convertToLinkedList(value);
        return reverseLL(head);
    }

    private static Node convertToLinkedList(int value) {
        int digit=value%10;
        value=value/10;
        Node head=new Node(digit);
        Node mover=head;
        while (value!=0){
             digit=value%10;
            value=value/10;
            Node temp=new Node(digit);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }


    //Better Approach
    //  TC=> (O(N) + O(N) + O(N) = O(3N)) & SC=> O(1))
    private static Node add1ToANumberRepresentedByLLWithBetter(Node head){
        head=reverseLinkedList(head);
        int carry=1;
        Node mover=head;
        while (mover!=null){
            int value=mover.value+carry;
            if (value==10){
                carry=1;
                mover.value=0;
            }else {
                carry=0;
                mover.value=value;
            }
            mover=mover.next;
        }
        head=reverseLinkedList(head);
        if (carry==1) {
            Node temp = new Node(1);
            temp.next=head;
            head=temp;
            return head;
        }
        return head;
    }

    // Optimal Approach => Recurssion Backtrekking
    //
    private static Node add1ToANumberRepresentedByLLWithOptimal(Node head){
        return head;
    }


    private static Node addTwoNumbersInLL(Node firstHead, Node secondHead){
        Node temp1=firstHead;
        Node temp2=secondHead;
        int carry=0;  int digit=0;
        Node dummy=new Node(-1);
        Node mover=dummy;
        int value=0;
        while (temp1!=null && temp2!=null){
            value= temp1.value+ temp2.value+carry;
            if (value>=10){
                  digit=value%10;
                  carry=value/10;
                mover.next=new Node(digit);;
                mover=mover.next;
            }else {
                carry=0;
                mover.next=new Node(value);
                mover=mover.next;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        while (temp1!=null){
            value= temp1.value+carry;
            if (value>=10){
                digit=value%10;
                carry=value/10;
                mover.next=new Node(digit);
                mover=mover.next;
            }else {
                carry=0;
                mover.next=new Node(value);
                mover=mover.next;
            }
            temp1=temp1.next;
        }

        while (temp2!=null){
            value= temp2.value+carry;
            if (value>=10){
                digit=value%10;
                carry=value/10;
                mover.next=new Node(digit);
                mover=mover.next;
            }else {
                carry=0;
                mover.next=new Node(value);
                mover=mover.next;
            }
            temp2=temp2.next;
        }

        if (carry==1){
            mover.next=new Node(carry);
             mover=mover.next;
            return dummy.next;
        }

        return dummy.next;
    }


}
