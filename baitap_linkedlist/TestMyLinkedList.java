package baitap_linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("========== Testing =============");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
        System.out.println();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.remove(3);
        ll.printList();

    }
}
