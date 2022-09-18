import javax.swing.text.Position;

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
	
	//INSERT------------------------
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

	//DELETE------------------------
	//delete at the front
	void deleteFromFront(){
		if(head==null){
			System.out.println("Cannot be delete a node - because list is Empty!!!");
		}
		head = head.next;
	}

	//delete particular node
	void deleteParticularNode(int value){
		Node temp = head;
		if(head==null){
			System.out.println("Cannot be delete a node - because list is Empty!!!");
		}
		while(temp.next.data != value){
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	//delete from the end
	void deleteFromEnd(){
		if(head==null){
			System.out.println("Cannot be delete a node - because list is Empty!!!");
		}
		Node temp = head;
		while(temp.next.next!=null){
			temp = temp.next;
		}
		temp.next = null;
	}

	//delete node by given position
	void deleteNodeByGivenPosition(int pos){
		Node temp = head;
		if(head==null){
			System.out.println("Cannot be delete a node - because list is Empty!!!");
		}
		if(pos == 0){
			head = head.next;
			return;
		}
		for(int i=0;i<pos-1;i++){
			temp = temp.next;
		}
		//if given postion doesn't exist in the list
		if(temp==null || temp.next==null){
			System.out.println("Given position doesn't exist...");
		}
		temp.next = temp.next.next;
	}

	//SEARCH------------------------
	//
	boolean searchNodeIteratively(int value){
		Node temp = head;
		while(temp!=null){
			if(temp.data==value){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	void searchNodeRecursively(int value){
		Node temp = head;
		boolean re = searchNodeRecursivelyMain(temp,value);
		System.out.println(value+" exist in the list : "+re);
	}

	boolean searchNodeRecursivelyMain(Node temp,int value){
		if(temp == null){
			return false;
		}
		if(temp.data == value){
			return true;
		}
		return searchNodeRecursivelyMain(temp.next,value);
	}

	void printList(String message){
		Node temp = head;
		System.out.print(message);
		if(head==null){
			System.out.println("List is Empty!!!");
		}
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

		A.deleteFromFront();
		A.printList("After the delete node from the front : ");

		A.deleteParticularNode(20);
		A.printList("After the delete the particular node : ");
		
		A.deleteFromEnd();
		A.printList("After the delete node from the end : ");

		A.deleteNodeByGivenPosition(1);
		A.printList("After the delete node from the given postion : ");
		
		boolean re = A.searchNodeIteratively(30);
		System.out.println("20 is exist : "+re);		

		A.searchNodeRecursively(30);
	}
}