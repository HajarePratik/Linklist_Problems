package com.linklist.Stack_Linklist_Programs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Linklist_Test {

	
	// UC1 test case to create simple linked list
	@Test
	public void givenNumbertoWhen_LinkedListShouldPassedLinklist()
	{
		MyNode<Integer> myfirstNode = new MyNode<>(56);				// Passing value to the Linklist one after one 
		MyNode<Integer> mysecondNode = new MyNode<>(30);  
		MyNode<Integer> mythirdNode = new MyNode<>(70); 
		
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		boolean result = myfirstNode.getNext().equals(mysecondNode) && mysecondNode.getNext().equals(mythirdNode);
		Assert.assertTrue(result);
		
		System.out.println(result); 	//Output of result is True
	}
	
	// UC2 test case to add value in linked list
	@Test
	public void given3elementsWhenLinkedShouldBeAddedToTop() 
	{
		MyNode<Integer> myfirstNode = new MyNode<>(70);
		MyNode<Integer> mysecondNode = new MyNode<>(30);
		MyNode<Integer> mythirdNode = new MyNode<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.add(myfirstNode);		// Adding a Node to LinkedList
		linkedList.add(mysecondNode);
		linkedList.add(mythirdNode);
		linkedList.printMyNodes();			// Printing a Node Output 56->30->70
		boolean result = linkedList.head.equals(mythirdNode) && linkedList.head.getNext().equals(mysecondNode)
						&& linkedList.tail.equals(myfirstNode);
		Assert.assertTrue(result);
	}
	
	// UC3 test case to append node in linked list
	@Test
	public void given3elements_WhenLinkedShouldBeAddedAtEnd()
	{
		MyNode<Integer> firstNode = new MyNode<>(56); 	
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.append(firstNode);		// Append a Value Node to LinkedList
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printMyNodes();
		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
					&& linkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}
	
	// UC4 test case to add value to between the node in linked list
	@Test
    public void given3elements_WhenInsertedBetweenLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(10);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList myLinkList = new LinkedList();
        myLinkList.add(myFirstNode);
        myLinkList.append(myThirdNode);
        myLinkList.insertmiddleNode(myFirstNode,mySecondNode);		// Inserting a Value to the Existing Node
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

	// UC5 test case to remove first value in node of linked list
	  @Test
	    public void given3elements_WhenDeletedFirstNodeLinkedList() {
	        MyNode<Integer> myFirstNode = new MyNode<>(16);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        LinkedList myLinkList = new LinkedList();
	        myLinkList.add(myFirstNode);
	        myLinkList.append(mySecondNode);
	        myLinkList.append(myThirdNode);
	        myLinkList.printMyNodes();
	        myLinkList.pop();
	        myLinkList.printMyNodes();
	        boolean result = myLinkList.head.equals(mySecondNode) &&
	                myLinkList.tail.equals(myThirdNode);
	        Assert.assertTrue(result);
	    }
	
	// UC6 test case to remove last value in node of linked list
	  @Test
	   public void given3elements_WhenDeletedLastNodePrintLinkedList() {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        LinkedList myLinkList = new LinkedList();
	        myLinkList.add(myFirstNode);
	        myLinkList.append(mySecondNode);
	        myLinkList.append(myThirdNode);
	        myLinkList.printMyNodes();
	        myLinkList.popLast();
	        myLinkList.printMyNodes();
	        boolean result = myLinkList.head.equals(myFirstNode) &&
	                myLinkList.tail.equals(mySecondNode);
	        Assert.assertTrue(result);
	}
	  
	// UC7 test case to search value in node of linked list
	  @Test
	    public void given3NumberWhenSearchNodePrintLinkedList() {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        MyNode<Integer> found = new MyNode<>(0);
	        LinkedList myLinkList = new LinkedList();
	        myLinkList.add(myFirstNode);
	        myLinkList.append(mySecondNode);
	        myLinkList.append(myThirdNode);
	        myLinkList.printMyNodes();
	        boolean result = myLinkList.search(mySecondNode);
	        Assert.assertTrue(result);
	    } 

}
