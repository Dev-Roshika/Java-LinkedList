class LinkedList{
	Node head ; //Head of the list
	
	//Node class
	static class Node{
		Node next;
		int data;

		Node(int data){//constructor to create nodes
			this.data = data;
			next = null;
		}
	}//End of Node class
	
	//insert at the front
	void insertAtFront(int value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	//insert after a given node
	void insertAfterAGivenNode(int value,int newNodeValue){
		Node newNode = new Node(newNodeValue);
		Node pointer = head;
		//pointer.data = 0;
		while(pointer.data!=value){
			pointer = pointer.next;
		}
		newNode.next = pointer.next;
		pointer.next = newNode;
	}

	//insert at the end
	void insertAtEnd(int value){
		Node newNode = new Node(value);
		if(head==null){
			head = newNode;
		}
		Node end=head;
		while(end.next!=null){
			end = end.next;
		}
		end.next = newNode;
	}

	void printList(String message){
		Node temp = head;
		System.out.print(message);
		while(temp!=null){
			System.out.print(temp.data+" | ");
			temp = temp.next;
		}System.out.println();
	}

	public static void main(String args[]){
		LinkedList A = new LinkedList(); //Empty Linked list

		//create nodes
		A.head = new Node(10);
		Node second_Node = new Node(20);
		Node third_Node = new Node(30);
		A.head.next = second_Node;
		second_Node.next = third_Node;
		A.printList("Initial linked list is : "); //print linked list items

		A.insertAtFront(40);
		A.printList("After the insert at the front : ");

		A.insertAfterAGivenNode(20,50);
		A.printList("Insert after the given node : ");

		A.insertAtEnd(60);
		A.printList("Insert at the end : ");
	}
}