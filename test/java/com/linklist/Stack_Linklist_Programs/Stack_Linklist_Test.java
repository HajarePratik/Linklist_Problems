package com.linklist.Stack_Linklist_Programs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Stack_Linklist_Test {

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
	
	

}
