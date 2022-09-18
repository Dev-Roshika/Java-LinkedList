class LinkedList{
	Node head = null; //Head of the list
	
	//Node class
	static class Node{
		Node head,next;
		int data;
		Node(){
			next=head = null;
		}
		Node(int data){//constructor to create nodes
			this.data = data;
			head = next = null;
		}
	}//End of Node class
		
	void printList(){
		Node temp = head;
		System.out.print("LinkedList is : ");
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
		A.printList(); //print linked list items
	}
}