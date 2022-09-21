import org.w3c.dom.Node;

//package String Stack using doublyLinkedList;
//String stack using doubly linked list
public class stackUsingDoublyLinkedList {
    int size = 0;
    class Node{
        String data;
        Node next,prev;
        Node(String data){
            this.data = data;
            next=null;
            prev=null;
        }
    }
    Node head;
    Node top = null;

    boolean isEmpty(){
        return head==null;
    }
    void push(String ele){
        Node newNode = new Node(ele);
        if(isEmpty()){
            head = newNode;
            top = newNode;
            head.prev = null;
            top = head;
            top.next = null;
        } else{
            top.next = newNode;
            newNode.prev = top;//?
            top = newNode;
        }
        size++;
    }
     
    void pop(){
        if(isEmpty()){
            System.out.print("Stack is empty. So cannot pop");
        } else{
            //System.out.print(top.data);
            top = top.prev;
            top.next = null;
            size--;
        }
    }
    void Display(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        } else{
            Node temp = head;
            System.out.print("Stack is : ");
            for(int i=0;i<size;i++){
                System.out.print(temp.data+" | ");
                temp = temp.next;
            }
            System.out.println();

        }
    }
    public static void main(String args[]) {
        stringQueueUsingDoublyLinkedList S = new stringQueueUsingDoublyLinkedList();
            S.push("e1");
            S.push("e2");
            S.push("e3");
            S.push("e4");
            S.push("e5");
            S.push("e6");
            S.Display();
            S.pop();S.Display();
            S.pop();S.Display();
            S.pop();S.Display();
            S.pop();S.Display();
            S.pop();S.Display();
  }
}
