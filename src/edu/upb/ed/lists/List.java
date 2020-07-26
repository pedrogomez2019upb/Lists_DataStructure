package edu.upb.ed.lists;

public class List {

    public ListNode head;
    public ListNode tail;

    public List(){
        head = null;
        tail =null;

    }
    public List(Object object){
        add(object);
    }
    public List(Object object){
        head= new ListNode(object);
        tail =head;
    }
    public boolean isEmpty(){
        return head == null;
    }
}
