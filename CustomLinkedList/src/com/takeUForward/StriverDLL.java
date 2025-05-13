package com.takeUForward;

public class StriverDLL {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        DLLNode head=convertArrayToDLL(array);
        display(head);
        head=deleteFirst(head);
        display(head);
        head=deleteLast(head);
        display(head);
        head=deleteAtKthPosition(head,4);
        display(head);
        head=insertFirst(head,1);
        display(head);
        head=insertLast(head,6);
        display(head);
        head=insertAtKthPosition(head,5,5);
        display(head);
        /*head=deleteAtKthPosition(head,3);
        display(head);*/
       DLLNode node=insertBeforeGivenValue(head,3,2);
       display(node);
    }

    private static DLLNode convertArrayToDLL(int[] array){
        DLLNode head= new DLLNode(array[0]);
        DLLNode mover=head;
        DLLNode prev=null;
        for (int i = 1; i < array.length; i++) {
            DLLNode node = new DLLNode(array[i]);
            mover.next=node;
            node.prev=mover;
            mover=node;
        }
        return head;
    }

    private static void display(DLLNode head){
        DLLNode temp=head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }


    private static DLLNode deleteFirst(DLLNode head){
       if (head==null || head.next==null){
           return null;
       }
       DLLNode temp=head;
       temp=temp.next;
       head=temp;
       return head;
    }

    private static DLLNode deleteLast(DLLNode head){
        if (head==null || head.next==null){
            return null;
        }
        DLLNode temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static DLLNode deleteAtKthPosition(DLLNode head,int k){
        DLLNode temp=head;
        if(head==null){
            return null;
        }

         if (k==1){
             head=temp.next;
             return head;
         }

         int count=1;
         while (temp!=null){
             if (count==k){
                 DLLNode node=temp.prev;
                 temp.prev=temp.next;
                 node.next=temp.next;
                 return head;
             }
             count++;
             temp=temp.next;
         }
        return head;
    }

    private static DLLNode deleteNode(DLLNode head){
        DLLNode prev=head.prev;
        DLLNode front=head.next;

        if (front==null){

            
        }
        return null;
    }


    private static DLLNode insertFirst(DLLNode head,int value){
        if (head==null){
            return new DLLNode(value);
        }
        DLLNode node=new DLLNode(value,head,null);
        head.prev=node;
        return node;
    }

     private static DLLNode insertLast(DLLNode head,int value){
          DLLNode temp=head;
          if (head==null){
              return new DLLNode(value);
          }
          while (temp.next!=null){
              temp=temp.next;
          }
          DLLNode node = new DLLNode(value,null,temp);
          temp.next=node;
          return head;
     }

    private static DLLNode insertAtKthPosition(DLLNode head,int k,int value){
        if (head==null){
            return new DLLNode(value);
        }
        if (k==1){
            return new DLLNode(value,head,null);
        }
        DLLNode temp=head;
        int count=1;
        while (temp!=null){
           if (count==k){
               DLLNode prev=temp.prev;
               DLLNode node = new DLLNode(value,temp,prev);
               prev.next=node;
               temp.prev=node;
               return head;
           }
            count++;
            temp=temp.next;
        }
        return head;
    }


    private static DLLNode insertBeforeGivenValue(DLLNode head,int insertValue,int beforeValue){
        DLLNode temp=head;
        while (temp!=null){
             if (temp.value==beforeValue){
                 DLLNode prev=temp.prev;
                 DLLNode node=new DLLNode(insertValue,temp,temp.prev);
                 if (prev!=null){
                     prev.next=node;
                 }
                 temp.prev=node;
                 return head;
             }
             temp=temp.next;
        }
        return head;
    }
}
