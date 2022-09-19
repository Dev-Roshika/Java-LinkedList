//package QueueAsLinkedList;
import java.util.Scanner;

public class QueueAsLinkedList {
  class QueueNode{
    int data;
    QueueNode next;
        QueueNode(int data){
            this.data = data;
            next = null;
        }
  }
  
  QueueNode front=null,rear=null;

  boolean isEmpty(){
    return rear == null;
  }
  void enQueue(int value){
    QueueNode newQ = new QueueNode(value);
    if(isEmpty()) front = rear = newQ;
    else{
        rear.next = newQ;
        rear = newQ;
    }System.out.println(value+" is enqueue to the Queue.");
  }

  void deQueue(){
    if(isEmpty()){
        System.out.println("Queue is underflow.");
    } else{
        System.out.println("Dequeue element is : "+front.data);
        front = front.next;
        if(front == null) rear = null;
    }  
}
    void Display(){
        if(isEmpty()){
            System.out.println("Queue is underflow.");
        } else{
            QueueNode curr = front;
            System.out.print("Queue is : ");
            while(curr!=null){
                System.out.print(curr.data+" | ");
                curr = curr.next;
            }System.out.println();
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Queue is underflow.");
        } else{
            System.out.println("Front element is: "+front.data);
        }
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    QueueAsLinkedList Q = new QueueAsLinkedList();

    Q.deQueue();
    System.out.println("Input value : ");
    int s = sc.nextInt();
    Q.enQueue(s);
    Q.peek();
    Q.Display();
    Q.deQueue();
    Q.Display();
    
    for(int i=0;i<5;i++){
        Q.deQueue();
    }

    Q.enQueue(34);
    Q.enQueue(52);
    Q.Display();
  }
}
