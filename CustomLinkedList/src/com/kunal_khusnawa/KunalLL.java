package com.kunal_khusnawa;

public class KunalLL {

    private Node head;
    private Node tail;
    private int size;

    public KunalLL() {
       this.size=0;
    }
    private  class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node= new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int value) {
        Node node = new Node(value);

        /*if (tail==null){
            insertFirst(value);
            return;
        }*/
              /* ==OR== */
        if (tail == null) {
            tail = node;
            head=node;
        } else {
            tail.next = node;
            tail = node;
        }


        size+=1;
    }

  public void insertAtPosition(int value, int index){

          if (index==0){
              insertFirst(value);
              return;
          }
          if (index==size){
              insertLast(value);
              return;
          }
          Node temp=head;
      for (int i = 1; i < index; i++) {
          temp=temp.next;
      }
      Node node=new Node(value,temp.next);
      temp.next=node;

         /* ==OR== */
      /*
      Node nodeTemp = null;
      nodeTemp=temp.next;
      temp.next=node;
      node.next=nodeTemp;
      */
      size+=1;
  }

  public int deleteFirst(){
         int value = head.value;
         head=head.next;
         if (head==null){
             tail=null;
         }
         size-=1;
         return value;
  }

  public Node get(int index){
        Node temp=head;
      for (int i = 0; i <index; i++) {
          temp=temp.next;
      }
      return temp;
  }

  public int deleteAtPosition(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        return value;
  }

  public int find(int value){
        Node temp = head;
        int index=0;
        while (temp!=null){
            index++;
            if (temp.value==value){
                return index-1;
            }
            temp=temp.next;
        }
        return -1;
  }

  public int deleteLast(){

        if (size<=1){
            return deleteFirst();
        }
        Node temp=head;
      for (int i = 0; i < size-2; i++) {
          temp=temp.next;
      }
      int value= tail.value;
      tail=temp;
      tail.next=null;
      size-=1;
      return value;
  }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }



   /* public void headDisplay(){
        while (head!=null){
            System.out.print(head.value + " -> ");
            head=head.next;
        }
        System.out.print("END");
    }*/





}