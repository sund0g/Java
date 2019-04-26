class testMyLinkedList {

    /* method to create a simple linked list with 3 nodes */
    public static void main(String[] args) {
        /* Start with the empty list. */
        MyLinkedList llist = new MyLinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node

        llist.printList();
    }

/*
    public static void main (String [] args) {

        MyLinkedList ll = new MyLinkedList(2);

       System.out.println(ll.nodeCount);
       System.out.println(ll.Node.data);
    }
*/
}