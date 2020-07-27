package edu.upb.ed.lists;

import java.util.Iterator;

public class List {

    public ListNode head;
    public ListNode tail;
    public int size;

    public List(){
        head = null;
        tail =null;
        size=0;

    }

    public List(Object object)
    {
        //add(object);
    }

    public void insert(int position,Object object){
        if (position >= 0 && position<=size){
            ListNode newNode = new ListNode();
            newNode.setObject(object);
            ListNode aux=head;
            for(int i=0;i<(position-1);i++)
            {
                aux=aux.getNext();
            }
            ListNode nNext=aux.getNext();
            aux.setNext(newNode);
            newNode.setNext(nNext);
            size++;
        }
    }

    public void removeTail(int position)
    {
        ListNode aux=head;
        for(int i=0;i<position-1;i++)
        {
            aux=aux.getNext();
        }
        ListNode nNext=aux.getNext();
        aux.setNext(nNext.getNext());
        size--;
    }

    public void add(int position){

    }

    /*
    public List(Object object){
        head= new ListNode(object);
        tail =head;
    }

     */
    public boolean isEmpty(){
        return head == null;
    }

    @Override
    public Iterator<ListNode> iterator()
    {
        //ni=head;
        Iterator <ListNode> i =new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public ListNode next() {
                return null;
            }
        }
    }
}
