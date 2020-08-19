package com.lams1989.getnodevalue;

import com.lams1989.getnodevalue.AppGetNode.SinglyLinkedList;
import com.lams1989.getnodevalue.AppGetNode.SinglyLinkedListNode;

import junit.framework.TestCase;

public class GetNodeValueTest extends TestCase {

	public void test1() {
		SinglyLinkedList llist1 = new SinglyLinkedList();
		int[] llistItem1 = { 141, 302, 164, 530, 474 };
		int pos = 2;

		for (int i = 0; i < llistItem1.length; i++) {
			SinglyLinkedListNode llist_head1 = AppGetNode.insertNodeAtHead(llist1.head, llistItem1[i]);
			llist1.head = llist_head1;
		}
		int actual = AppGetNode.getNode(llist1.head, pos);
		assertEquals(164, actual);
	}

	public void test2() {
		SinglyLinkedList llist1 = new SinglyLinkedList();
		int[] llistItem1 = { 1 };
		int pos = 0;

		for (int i = 0; i < llistItem1.length; i++) {
			SinglyLinkedListNode llist_head1 = AppGetNode.insertNodeAtHead(llist1.head, llistItem1[i]);
			llist1.head = llist_head1;
		}
		int actual = AppGetNode.getNode(llist1.head, pos);
		assertEquals(1, actual);
	}

	public void test3() {
		SinglyLinkedList llist1 = new SinglyLinkedList();
		int[] llistItem1 = { 1, 2, 3 };
		int pos = 2;

		for (int i = 0; i < llistItem1.length; i++) {
			SinglyLinkedListNode llist_head1 = AppGetNode.insertNodeAtHead(llist1.head, llistItem1[i]);
			llist1.head = llist_head1;
		}
		int actual = AppGetNode.getNode(llist1.head, pos);
		assertEquals(3, actual);
	}
}
