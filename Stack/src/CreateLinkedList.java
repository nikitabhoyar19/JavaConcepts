public class CreateLinkedList {

    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addData(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            // newNode.next = head; (use this line to create circular linked list)
        }
        else {
            tail.next = newNode;
            tail = newNode;
            // tail.next = head; (use this line to create circular linked list)
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty .....");
        }
        else {
            System.out.println("Node of circular linked list: ");

            do {
                System.out.print(" " + current.data);
                current = current.next;
            }while(current != head);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        cl.addData(1);
        cl.addData(2);
        cl.addData(3);
        cl.addData(4);
        cl.display();
    }
}
