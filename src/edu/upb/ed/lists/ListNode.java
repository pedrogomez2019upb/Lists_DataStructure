package edu.upb.ed.lists;

public class ListNode {
    private Object object;
    public ListNode next;

    public ListNode(Object object, ListNode next) {
        this.object = object;
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}
