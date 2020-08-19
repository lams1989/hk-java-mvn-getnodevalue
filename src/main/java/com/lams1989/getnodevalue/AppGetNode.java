package com.lams1989.getnodevalue;


public class AppGetNode {
	
	
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist1 = new SinglyLinkedList();
		int[] llistItem1 = { 141, 302, 164, 530, 474 };
		int pos = 2;

		for (int i = 0; i < llistItem1.length; i++) {
			SinglyLinkedListNode llist_head1 = insertNodeAtHead(llist1.head, llistItem1[i]);
			llist1.head = llist_head1;
		}
	
		System.out.println(getNode(llist1.head, pos));
	}

	static int getNode(SinglyLinkedListNode head, int positionFromTail) {
		SinglyLinkedListNode temp = head;
		for (int i = 0; head.next != null; i++) {
			head = head.next;
			
			if (i >= positionFromTail)
				temp = temp.next;
		}
		return temp.data;

	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		if (head == null) {
			return nodeInsert;
		}
		nodeInsert.next = head;
		return nodeInsert;
	}
	static void printLinkedList(SinglyLinkedListNode head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

}
