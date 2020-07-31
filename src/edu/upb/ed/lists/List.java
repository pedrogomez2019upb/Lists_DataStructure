package edu.upb.ed.lists;

import java.util.Iterator;

public class List implements ListInterface{

    public ListNode head;
    public ListNode tail;
    public int size;

    public List() {
        head = null;
        tail = null;
        size = 0;

    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object getHead() {
        return null;
    }

    @Override
    public Object getTail() {
        return null;
    }

    @Override
    public Object get(ListNode node) {
        return null;
    }

    @Override
    public Object search(Object object) {
        return null;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        return false;
    }

    @Override
    public boolean set(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean remove(int position) {
        ListNode aux = head;
        for (int i = 0; i < position - 1; i++)
        {
            aux = aux.getNext();
        }
        ListNode nNext = aux.getNext();
        aux.setNext(nNext.getNext());
        size--;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public boolean isEquals(Object object) {
        return false;
    }

    @Override
    public Iterator<ListNode> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
    }

    @Override
    public Object getBeforeTo() {
        return null;
    }

    @Override
    public Object getBeforeTo(ListNode node) {
        return null;
    }

    @Override
    public Object getNextTo() {
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        return null;
    }

    @Override
    public List sortList() {
        return null;
    }
}


