package com.kunal_khusnawa;

public class Main {
    public static void main(String[] args) {

        KunalLL ll=new KunalLL();
       /*
        ll.insertFirst(9);
        ll.insertFirst(8);
        ll.insertFirst(7);
        ll.insertFirst(6);
        ll.insertFirst(5);
       */
        ll.insertLast(10);
        ll.insertLast(11);
        ll.insertLast(13);
        ll.insertLast(14);
        ll.insertLast(15);
        ll.insertAtPosition(12,2);
        ll.display();
        System.out.println("Deleted Item From Our Linked List Is :=> " + ll.deleteFirst());
        ll.display();
        System.out.println("Deleted Item From Our Linked List Is :=> " + ll.deleteLast());
        ll.display();
        System.out.println(ll.deleteAtPosition(2));
        ll.display();
        System.out.println(ll.find(12));





    }
}
