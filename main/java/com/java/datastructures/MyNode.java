package com.java.datastructures;

public class MyNode<E> implements INode<E> {
	public E key ;
	public MyNode<E> next;
	public MyNode(E key) {
		this.key = key;
		this.next = null;
	}
	public E getKey() {
		return key;
	}
	public void setKey(E key) {
		this.key = key;
	}
	public INode<E> getNext() {
		return next;
	}
	public void setNext(INode<E> next) {
		this.next = (MyNode<E>) next;
	}
}
