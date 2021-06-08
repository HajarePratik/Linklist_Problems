package com.linklist.Stack_Linklist_Programs;

public class LinkedList {
	
	// creating a head,tail for insertion way
	public INode head;
	public INode tail;

	public LinkedList() 
	{
		this.head = null;
		this.tail = null;		// constuctor of head,tail
	}

	public void add(INode newNode) 	// Method to add Value to LinkedList
	{
		if (this.tail == null) 
		{
			this.tail = newNode;
		}
		if (this.head == null) 
		{
			this.head = newNode;
		} 
		else 
		{
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	
	public void append(INode newNode)	// Method to append Value to LinkedList
	{
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else 
		{
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
		
	public void printMyNodes()			// Method to Print Value to LinkedList
	{
		StringBuffer myNodes = new StringBuffer("My Nodes :" );
		INode tempNode = head;
		while(tempNode.getNext() != null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
