package gradles;

public class App {
    public void InsertAtBeginning(ChristLinkedList list, int data) {
        ChrisNode newNode = new ChrisNode(data);
        newNode.next = list.head;
        list.head = newNode;
    }
    public void displayList(ChristLinkedList list) {
        ChrisNode current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void insertatend(ChristLinkedList list, int data) {
        ChrisNode newNode = new ChrisNode(data);
        if (list.head == null) {
            list.head = newNode;
            return;
        }
        ChrisNode current = list.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public boolean search(ChristLinkedList list, int key) {
        ChrisNode current = list.head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void deleteNode(ChristLinkedList list, int key) {
        ChrisNode current = list.head, previous = null;
        if (current != null && current.data == key) {
            list.head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        previous.next = current.next;
    }
    public static void main(String[] args) {
        App app = new App();
        ChristLinkedList list = new ChristLinkedList();
        
        app.InsertAtBeginning(list, 10);
        app.InsertAtBeginning(list, 20);
        app.InsertAtBeginning(list, 30);
        
        System.out.println("Linked List after inserting at the beginning:");
        app.displayList(list);
        
        app.insertatend(list, 40);
        System.out.println("Linked List after inserting at the end:");
        app.displayList(list);
        
        int searchKey = 20;
        System.out.println("Searching for " + searchKey + ": " + app.search(list, searchKey));
        
        int deleteKey = 10;
        app.deleteNode(list, deleteKey);
        System.out.println("Linked List after deleting " + deleteKey + ":");
        app.displayList(list);
    }
}
