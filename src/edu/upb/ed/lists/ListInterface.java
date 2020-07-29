package edu.upb.ed.lists;

import java.util.Iterator;

public interface ListInterface
{

    /*
    essential operations
    */
    public boolean isEmpty(); //OK

    public int getSize(); //Ok

    public void clear(); //Pendiente

    public Object getHead();//SOSO

    public Object getTail();//SOSO

    public Object get(ListNode node);

    public Object search(Object object);

    public boolean add(Object object);

    public boolean insert(ListNode node, Object object);

    public boolean insert(Object ob, Object object);

    public boolean insertHead(Object object);

    public boolean insertTail(Object object);

    public boolean set(ListNode node, Object object);

    public boolean remove(ListNode node);//Ok

    /*
    expansion operations
     */
    public boolean contains(Object object);

    public boolean isEquals(Object object);

    public Iterator<ListNode> iterator();

    public Object[] toArray();

    public Object[] toArray(Object[] object);

    public Object getBeforeTo();

    public Object getBeforeTo(ListNode node);

    public Object getNextTo();

    public Object getNextTo(ListNode node);

    public List subList(ListNode from, ListNode to);

    public List sortList();
}
