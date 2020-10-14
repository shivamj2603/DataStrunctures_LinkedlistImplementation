package com.java.datastructures;

public interface INode<E extends Comparable<E>>{
	E getKey();
	void setKey(E key);
	INode<E> getNext();
	void setNext(INode<E> next);
}
