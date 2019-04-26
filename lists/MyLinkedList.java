public class MyLinkedList {

    Node head; // head of list

    /*
     * Linked list Node. This inner class is made static so that main() can access
     * it
     */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}

/*
    int nodeCount = 0;

    // Inner node class. Making it public for now so main() can access it.
    public static class Node {
        Object data;
        Node next;

        // Constructor
        Node(Object d) {
            data = d;
            next = null;
        }
    }

    // Constructor
    public MyLinkedList (Object d) {
        Node node = new Node(d);
        nodeCount = 1;
    }
*/
}