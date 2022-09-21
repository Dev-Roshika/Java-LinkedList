//package String Queue using doubly linked list;
//enQueue(), deQueue(), peek(), isEmpty(), display()
public class stringQueueUsingDoublyLinkedList {
  Node head;
    class Node{
      String data;
        Node next,prev;
        Node(String data){
          this.data = data;
          next = null;
          prev = null;
        }
    }
    Node front=null,rear=null;

    boolean isEmpty(){
      return rear==null;
    }
    void enQueue(String value){
      Node newNode = new Node(value);
      System.out.println("Enqueue element : "+value);
      if(isEmpty()){
        front = rear = newNode;
        rear.next=null;rear.prev = null;
      } else {
        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
      }
    }
    void deQueue(){
      if(isEmpty()){
        System.out.println("Cannot dequeue because list is empty.");
      } else{
        front = front.next;
        front.prev = null;
        if(front==null) rear=null;
      }
    }
    void peek(){
      if(isEmpty()){
        System.out.println("List is empty!!!");
      } else{
        System.out.println("Front element is "+front.data);
      }
    }
    void Display(){
      if(isEmpty()){
        System.out.println("List is empty!!!");
      } else{
        Node curr = rear;
        System.out.print("Queue is : ");
        while(curr!=null){
          System.out.print(curr.data+" | ");
          curr = curr.prev;
        }System.out.println();
      }
    }
    public static void main(String args[]) {
      stringQueueUsingDoublyLinkedList s = new stringQueueUsingDoublyLinkedList();
      s.enQueue("e1");
      s.enQueue("e2");
      s.enQueue("e3");
      s.enQueue("e4");
      s.Display();
      s.deQueue();
      s.deQueue();
      s.Display();
  }  
}
