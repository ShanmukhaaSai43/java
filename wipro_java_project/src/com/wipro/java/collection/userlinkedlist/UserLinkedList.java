package com.wipro.java.collection.userlinkedlist;

import java.util.Scanner;

public class UserLinkedList {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter numbers to add to the linked list (type -1 to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;
            list.insert(num);
        }
        scanner.close();

        System.out.println("Linked List:");
        list.display();
    }
}
