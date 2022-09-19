//package QueueAsArray;

public class QueueAsArray {
    String QArray[] = new String[5];
    int size = QArray.length-1;
    
    int front = 0;
    int rear = -1;

    public boolean isEmpty(){	
		return (rear==-1);
	}
	
	public boolean isFull(){
		return (rear==size);
	}
    void deQueue(){
        if(isEmpty()) System.out.println("Stack Underflow");
        else{
            //1st method - Move front
            System.out.println("Dequeue element: "+QArray[front]);
            QArray[front] = "";
            front++;
            if(front>rear){//After delete all the element in the queue, we can use same queue again
                front = 0;
                rear = -1;
            }

            //2nd method - Move rear
            /*System.out.println("Dequeue element: "+QArray[front]);
			for (int i=0; i<rear; i++){
				QArray[i] = QArray[i+1];
			}
			QArray[rear--] = "";
            */
        }
    }

    void enQueue(String value){
        if(isFull()) System.out.println("Stack Overflow");
        else{
            QArray[++rear] = value;
        }
    }

    void peek(){
        if(isEmpty()) System.out.println("Stack Underflow");
        else{
            System.out.println("Front element is : "+QArray[front]);
        } 
    }
    void display(){
        if(isEmpty()) System.out.println("Stack Underflow");
        else{
            System.out.print("Queue is : ");
            for(int i=rear;i>=front;i--){
                System.out.print(QArray[i]+" | ");
            }System.out.println();
        }
    }
  public static void main(String args[]) {
    QueueAsArray Q = new QueueAsArray();
    Q.enQueue("e1");
    Q.enQueue("e2");
    Q.enQueue("e3");
    Q.display();
    Q.enQueue("e4");
    Q.enQueue("e5");
    Q.enQueue("e6");
    Q.display();
    Q.deQueue();
    Q.deQueue();
    Q.deQueue();
    Q.deQueue();
    Q.display();
    Q.deQueue();
    Q.deQueue();
  }  
}
