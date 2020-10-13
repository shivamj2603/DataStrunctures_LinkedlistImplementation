package com.java.datastructures;

public class LinkedList<E> {
	public INode<E> head;
	public INode<E> tail;
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	/**Usecase 2
	 * Function adds elements to the linked list(head changes)
	 * @param node
	 */
	public void add(INode<E> node) {
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			INode<E> tempNode = head;
			tempNode = head;
			head = node;
			head.setNext(tempNode);	
		}
	}
	/**
	 * Usecase 3
	 * Function appends elements to the head(tail changes)
	 * @param node
	 */
	public void append(INode<E> node) {
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			INode<E> tempNode = tail;
			tempNode.setNext(node);
			tail = node;
		}
	}
	/**
	 * Usecase 4
	 * Function inserts at a specified position in list
	 * @param position
	 * @param node
	 */
	public void insert(int position, INode<E> node) {
		int count = 0;
		INode<E> previousNode = null;
		INode<E> currentNode = head;
		while(count != position) {
			count++;
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(node);
		node.setNext(currentNode);
	}
	/**Usecase 5
	 * Function returns the first element in the list
	 * @return
	 */
	public E pop() {
		INode<E> tempNode = head.getNext();
		E key = head.getKey();
		head = tempNode;
		return key;
	}
	/**
	 * Usecase 6
	 * Function pops the last element in the list
	 * @return
	 */
	public E popLast() {
		INode<E> currentNode = head;
		INode<E> previousNode = null;
		while(currentNode.getNext() != null) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();	
		}
		E key = currentNode.getKey();
		currentNode = null;
		previousNode.setNext(null);
		tail = previousNode;
		return key;	
	}
	/**
	 * Usecase 7
	 * Function searches for an item in list
	 * @param item
	 * @return
	 */
	public boolean search(E item) {
		boolean isPresent = false;
		INode<E> tempNode = head;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey().equals(item)) {
				isPresent = true;
			}
			else {
				tempNode = tempNode.getNext();
			}	
		}
		if(tail.getKey().equals(item)) {
			isPresent = true;
		}
		return isPresent;	
	}
	public int index(E item) {
		int index = 0;
		int count = 0;
		INode<E> tempNode = head;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey().equals(item)) {
				index = count;
				break;
			}
			else {
				tempNode = tempNode.getNext();
			}
			count++;
		}
		if(tail.getKey().equals(item)) {
			count++;
			index = count;
		}
		return index;
	}
	public void printNodes() {
		INode<E> tempNode = head;
		while(tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}	
		System.out.print(tempNode.getKey());
	}
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		list.append(firstNode);
		list.append(thirdNode);
		list.insert(1, secondNode);
		list.insert(list.index(secondNode.getKey())+1, fourthNode);
		list.printNodes();
	}
}
