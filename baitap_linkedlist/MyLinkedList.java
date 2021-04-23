package baitap_linkedlist;
import java.util.LinkedList;
public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    public class Node {
        private Node next;
        private Object data;
        public Object getData() {
            return this.data;
        }

        public Node(Object data) {
            this.data = data;
        }
    }
    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public void add (int index, E element) {
        Node current = head;
        for (int i = 0; i < index -1 && current.next != null; i++) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = new Node(element);
        current.next.next = temp;
        numNodes++;
    }

    public void addFirst (E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e){
        Node newNode = new Node(e);
        if (head == null) {
            head =newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            numNodes++;
        }
    }
    public E remove(int index) {
        Node current = head;
        for (int i = 0 ; i < index - 1; i++){
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        numNodes--;
        return (E) temp.data;
    }
    public boolean remove (Object e) {
        return true;
    }
    public int size() {
        int size =0;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            size++;
        }
        return  size;
    }
    public boolean contains(E e) {
        Node current = head;
        while (current.next != null) {
            if (current.data.equals(e)){
                return true;
            }
            current = current.next;
        }
        return  false;
    }

    public int indexOf(E e) {
        Node current = head;
        for (int i = 0; current.next != null ; i++){
            if (current.data.equals(e)) return i;
            current = current.next;
        }
        return -1;
    }

    //Anh xem giúp em phương thức này với ạ
    public void ensureCapacity(int minCapacity) {

    }

    public Node get(int index) {
        Node current = head;
        for (int i = 0; i <index -1 ; i++){
            current = current.next;
        }
        return current;
    }
    public E getFirst() {
        return (E) head.data;
    }
    public E getLast() {
        Node current = head;
        while (current.next != null) {
            current =current.next;
        }
        return (E) current.data;
    }
    public void clear() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
            current = null;
        }
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
