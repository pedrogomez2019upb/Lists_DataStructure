package edu.upb.ed.lists;

public class Main {

    public static void main(String[] args) {

	List list1=new List();
	for(int i=0;i<10;i++){
	    list1.add(i);
    }

	for(ListNode node=list1.head;node !=null;node=node.next)
    {
        System.out.println(node.toString());
    }

        for(int i=10;i<20;i++){
            list1.addTail(i);
        }
        for(ListNode node=list1.head;node !=null;node=node.next)
        {
            System.out.println(node.toString());
        }
    }
}
