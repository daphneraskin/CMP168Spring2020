package com.mycompany.list;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		
		myList.append(8);
		myList.append(6);
		myList.append(4);
		myList.append(2);
		
		myList.show();
		//myList.insertionSort();
		//myList.show();
		myList.mergeSort();
		myList.show();
	}
}
