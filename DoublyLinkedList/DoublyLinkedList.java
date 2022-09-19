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
            newNode.next = null;
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

    //insert at the particular position
    void insertAtParticularPos(int value,int pos){
        if(isEmpty()){
            addNode(value);
        } else{
            Node newNode = new Node(value);
            Node curr = head;
            for(int i=0;i<pos-2;i++){
                curr = curr.next;
            }
            newNode.next=curr.next;
            curr.next = newNode;
            newNode.prev = curr;
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

    //DELETE
    //delete at the front
    void deleteFromFront(){
		if(isEmpty()){
			System.out.println("Cannot be delete a node - because list is Empty!!!");
		} else{
            head = head.next;
            head.prev = null;
        }
	}

    //delete at the particular position
    void deleteFromParticularPos(int pos){
		try{
            if(isEmpty()){
                System.out.println("Cannot be delete a node - because list is Empty!!!");
            } else{
                Node curr = head;
                if(pos==1 ){
                    deleteFromFront();
                }
                else if(pos>=2){
                    for(int i=0;i<pos-2;i++){
                        curr = curr.next;
                    }
                    curr.next = curr.next.next;
                }else if(pos<=0){
                    System.out.println("***\npos is invalid. Position must be greater than 0.\n***"); 
                }
            }
        }catch(Exception e){
            System.out.println(e+" : Because pos is invalid. pos must be less than or equal 3");
        }
	}

    //SEARCH
    //search element
    void search(int value){
        System.out.println("Searching...........");
        Node curr=head;
        boolean found = false;
        while(curr.next!=null){
            if(curr.data==value) {found = true;break;}
            curr=curr.next;
        }
        if(found) System.out.println(value+" is exist in the list.");
        else System.out.println(value+" is not exist in the list.");
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
        
        D.deleteFromFront();
        D.printList("Delete from the front : ");

        D.insertAtFront(10);
        D.printList("After insert elements at the front : ");

        D.insertAtFront(20);
        D.printList("After insert elements at the front : ");
        
        D.deleteFromFront();
        D.printList("Delete from the front : ");

        D.insertAtEnd(40);
        D.printList("After add elements in the end : ");

        D.insertAtFront(30);
        D.printList("After insert elements at the front : ");

        D.insertAtParticularPos(60,3);
        D.printList("After insert elements at the postion 3 : ");

        D.search(100);

        D.deleteFromFront();
        D.printList("Delete from the front : ");

        D.deleteFromParticularPos(5);
        D.printList("Delete from the position 1 : ");
    }
}
