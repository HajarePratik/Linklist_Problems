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

	// this method for adding a node for UC1 & UC2
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
	
	// this method for append a node for UC3
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
	
	// this method for adding a element within particular node UC4
	public void insertmiddleNode(INode myNode,INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    
    }
	
	// this method for remove a element within node UC5
	public void pop() {
        this.head = this.head.getNext();
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
