//package StackAsArray;
class Stack{
    int top;
	static int  size;
	int[] SArray;
    
    Stack(int size){
        top = -1;
		this.size = size;
		SArray = new int[size];
    }
    boolean isEmpty(){
        return (top<0);
    }
    boolean isFull(){
        return (top ==size-1);
    }
    void push(int ele){
        System.out.print("Trying to push element "+ele+" : status -> ");
        boolean re = false;
        if(isFull()) System.out.println("Stack is overflow.");
        else {
            re = true;
			SArray[++top] = ele;
            System.out.println(re);
        }
    }
    void pop(){
        if(isEmpty()) System.out.println("Stack is underflow.");
        else{
            System.out.println("Pop element : "+SArray[top--]);
        }
    }
    void peek(){
        if(isEmpty()) System.out.println("Stack is underflow.");
        else{
            System.out.println("top element is : "+SArray[top]);
        }
    }
    void print(){
        int i=top;
        System.out.print("Stack is : ");
        if(isEmpty()) System.out.println("Stack is underflow.");
        else{ 
            while(i!=-1){
                System.out.print(SArray[i]+" | ");
                i--;
            }System.out.println();
        }
    }
}
public class StackAsArray {
    public static void main(String args[])
    {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        s.push(40);
        s.push(50);
        s.print();
        s.push(60);
        s.pop();
        s.pop();
        s.peek();
        s.pop();
        s.print();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.peek();
        s.print();
    }
}
