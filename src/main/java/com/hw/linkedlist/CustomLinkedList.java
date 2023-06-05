package com.hw.linkedlist;


// <T> will represent whatever type is LinkedList
// new Node <T>();
// LinkedList should be used where modifications
// to collection are frequent like addition/deletion operations
// LinkedList is much faster as compare to ArrayList in such cases
// It allocates the memory dynamically
public class CustomLinkedList <T>{

        private ListNode head;
        private int size;

        public CustomLinkedList() {
                head = new ListNode(null);
                size = 0;
        }

        public void add(T data) {
                ListNode node = new ListNode(data);
                ListNode current = head;
                while (current.getNext() != null) {
                        current = current.getNext();
                }
                current.setNext(node);
                size++;
        }

        public int getSize() {
                return size;
        }

        public String toString() {
                ListNode current = head.getNext();
                String elements = "";
                while (current != null) {
                        elements += "[" + current.getData().toString() + "]";
                        current = current.getNext();
                }
                return elements;
        }
}






