package com.linklist.Stack_Linklist_Programs;

public class MyNode<K> {

	// defining variable
	private K key;
	private MyNode next;

	// constuctor of MyNode Class
	public MyNode(K key)
	{
		this.key = key;
		this.next = null;
	}
	
	// getter & Setter method
	public K getKey() {
		return key;
	}
	public MyNode getNext() {
		return next;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setNext(MyNode next) {
		this.next = next;
	}
	
	
	
}
