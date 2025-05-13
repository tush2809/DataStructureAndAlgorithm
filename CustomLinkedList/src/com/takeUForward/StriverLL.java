package com.takeUForward;

public class StriverLL {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6};

        Node head=convertArrayToLinkedList(input);
        //System.out.println(head.value);
        display(head);
        System.out.println(lengthOfLL(head));
        System.out.println(checkIfPresent(head,8));
        head=deleteFirst(head);
        display(head);
        head=deleteLast(head);
        display(head);
        head=deleteKthPosition(head,2);
        display(head);
        head=deleteValueNode(head,4);
        display(head);
        head=insertFirst(head,1);
        display(head);
        head=insertLast(head,6);
        display(head);
        head=insertAtKthPosition(head,3,3);
        display(head);
        head=insertAtBeforeValue(head,5,4);
        display(head);


    }



    private static Node convertArrayToLinkedList(int[] input){
         Node head=new Node(input[0]);
         Node mover=head;
        for (int i = 1; i < input.length; i++) {
             Node temp=new Node(input[i]);
             mover.next=temp;
             mover=temp;
        }
        return head;
    }

    private static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }


    private static int lengthOfLL(Node head) {
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    private static boolean checkIfPresent(Node head,int value){
         Node temp=head;
         while (temp!=null){
             if (temp.value==value){
                 return true;
             }
             temp=temp.next;
         }
         return false;
    }

    private static Node deleteFirst(Node head){
        if (head==null){
            return head;
        }
        Node temp=head;
        head=temp.next;
        return head;
    }

    private static Node deleteLast(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node temp = head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static Node deleteKthPosition(Node head,int k){
        Node temp=head;
        if (head==null){
            return head;
        }
        if (k==1 && head.next!=null){
            head=temp.next;
            return head;
        }
        int count=1;
        Node prev=null;
        while (temp!=null){
            if (k==count){
                prev.next=temp.next;
                return head;
            }
            count++;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    private static Node deleteValueNode(Node head, int value){
        if (head==null){
            return head;
        }
        if (head.value==value){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while (temp!=null){
            if (temp.value==value){
                prev.next=temp.next;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    private static Node insertFirst(Node head,int value){
        Node node=new Node(value);
        if (head==null){
            head=node;
            return head;
        }
        node.next=head;
        head=node;
        return head;
    }

    private static Node insertLast(Node head,int value){
        if (head==null){
            return new Node(value);
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node node =new Node(value);
        temp.next=node;
        return head;
    }

    private static Node insertAtKthPosition(Node head,int k,int value){
        if (head==null){
            if (k==1){
                return new Node(value);
            }else {
                return null;
            }
        }
        if (k==1){
            return new Node(value,head);
        }
        Node temp=head;
        int count=1;
        while (temp!=null){
            if (count==k-1){
                Node node = new Node(value,temp.next);
                temp.next=node;
                return head;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }

    private static Node insertAtBeforeValue(Node head,int before,int value){
        Node temp=head;
        if (head==null){
            return new Node(value);
        }
        if (temp.value==before){
            return new Node(value,head);
        }
        while (temp.next.value!=before){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        return head;
    }
}
