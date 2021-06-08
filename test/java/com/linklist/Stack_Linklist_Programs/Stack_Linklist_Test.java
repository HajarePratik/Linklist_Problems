package com.linklist.Stack_Linklist_Programs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Stack_Linklist_Test {

	
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
	

}
