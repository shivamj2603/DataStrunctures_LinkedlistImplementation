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
		list.add(thirdNode);
		list.add(secondNode);
		list.add(firstNode);
		list.printNodes();
	}
}
