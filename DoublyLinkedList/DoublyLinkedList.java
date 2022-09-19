public class DoublyLinkedList {
    Node head,tail;
    static class Node{
        Node next,prev;
        int data;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    boolean isEmpty(){
        return head == null;
    }
    void addNode(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }

    }
    //INSERT
    //insert at the front
    void insertAtFront(int value){
        if(isEmpty()){
            addNode(value);
        } else{
            Node newNode = new Node(value);
            newNode.next = head;
            head.prev = newNode;
            newNode.prev=null;
            head = newNode;
        }
    }

    //insert at the end
    void insertAtEnd(int value){
        if(isEmpty()){
            addNode(value);
        } else{
            Node newNode = new Node(value);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            newNode.next = null;
        }
    }

    void printList(String message){
        Node temp = head;
        System.out.println(message);
        if(isEmpty()){
			System.out.println("List is Empty!!!");
		}
        while(temp!=null){
            System.out.print(temp.data+" | ");
            temp = temp.next;
        }System.out.println();
    }

    public static void main(String args[]){
        DoublyLinkedList D = new DoublyLinkedList();
        D.printList("Elements in the list : ");
        D.insertAtFront(10);
        D.printList("After insert elements at the front : ");

        D.insertAtFront(20);
        D.printList("After insert elements at the front : ");

        D.insertAtEnd(40);
        D.printList("After add elements in the end : ");

        D.insertAtFront(30);
        D.printList("After insert elements at the front : ");
    }
}
