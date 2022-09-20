//package CircularLinkedList;
public class CircularLinkedList  {
    Node head=null,tail = null ;
    
   //Node class
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    boolean isEmpty(){
        return head==null;
    }
    void addNode(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
        
    }
    void insertAtFront(int value){
        Node newNode = new Node(value);
        System.out.println("Trying to insert "+value+" at the front...");
        if(isEmpty()) {
            addNode(value);
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void insertAtParticularPos(int value,int pos){
        Node newNode = new Node(value);
        System.out.println("Trying to insert "+value+" at the position "+pos+"...");
        if(isEmpty()) {
            System.out.println("Insert "+value+" in the postion 1 ,beacause list is empty.");
            addNode(value);
        }else{
            if(pos==1) insertAtFront(value);
            else{
                Node curr=head;
                for(int i =1;i<=pos-2;i++){
                    curr = curr.next;
                }  
                
                newNode.next = curr.next;
                curr.next = newNode;
            }
        }
    }

    void insertAtEnd(int value){
        Node newNode = new Node(value);
        System.out.println("Trying to insert "+value+" at the end...");
        if(isEmpty()) addNode(value);
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void deleteAtFront(){
        System.out.println("Trying to delete "+tail.next.data+" ...");
        if(isEmpty()) {
            System.out.println("Cannot delete list is empty.");
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }
    
    void deleteAtParticularPos(int pos){
        System.out.println("Trying to delete value at the position "+pos+"...");
        if(isEmpty()) {
            System.out.println("Cannot delete list is empty.");
        }else{
            if(pos==1) deleteAtFront();
            else{
                Node curr=head;
                for(int i =1;i<=pos-2;i++){
                    curr = curr.next;
                }  
                curr.next = curr.next.next;
            }
        }
    }
    
    void deleteAtEnd(){
        System.out.println("Trying to delete "+tail.data+" at the end...");
        if(isEmpty()) {
            System.out.println("Cannot delete list is empty.");
        }
        else{
            Node curr=head;
            while(curr.next!=tail){
                curr=curr.next;
            }
            tail = curr;
            tail.next = head;
        }
    }  

    void search(int value){
        if(isEmpty()) {
            System.out.println("Cannot find value in this list, because list is empty.");
        }else{
            Node curr = head;
            Boolean re = false;
            System.out.print("Searching element "+value+" is : ");
            do{
                if(curr.data==value) {re = true; break;}
                curr = curr.next;
            }
            while(curr !=head);
            if(re) System.out.print("exist\n");
            else System.out.print("not exist\n");    
        }
       
    }

    void Display(){
        if(isEmpty()) System.out.println("List is underflow.");
        else{
            Node curr = head;
            System.out.print("Circular linkedlist is : ");
            do{
                System.out.print(curr.data+" | ");
                curr = curr.next;
                
            }
            while(curr !=head);
            System.out.println();
        }
    }
    public static void main(String args[])  {
        CircularLinkedList C = new  CircularLinkedList();
            C.insertAtFront(10);
            C.insertAtFront(20);
            C.Display();
            C.insertAtEnd(30);
            C.Display();
            C.search(200);
            C.insertAtParticularPos(40, 2);
            C.Display();
            C.deleteAtParticularPos(2);
            C.Display();
            C.Display();
            C.deleteAtFront();
            C.Display();
            C.deleteAtEnd();
            C.Display();
            
            
    }
}
