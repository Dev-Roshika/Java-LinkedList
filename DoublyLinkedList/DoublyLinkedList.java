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

    void printList(String message){
        Node temp = head;
        System.out.println(message);
        if(head==null){
			System.out.println("List is Empty!!!");
		}
        while(temp!=null){
            System.out.print(temp.data+" | ");
            temp = temp.next;
        }System.out.println();
    }

    public static void main(String args[]){
        DoublyLinkedList D = new DoublyLinkedList();
        
    }
}
