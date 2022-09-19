public class StackAsLinkedList {
    static stackNode top = null;
    static class stackNode{
        stackNode next;
        String data;
        stackNode(String data){
            this.data = data;
            next = null;
        }
    }
    boolean isEmpty(){
        if(top==null) return true;
        else return false;
    }
    void push(String value){
        stackNode newNode = new stackNode(value);
        if(isEmpty()){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }System.out.println("Element "+value+" successfully entered.");
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow.");
        }else{
            System.out.println("Element "+top.data+" successfully poped.");
            top = top.next;
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Stack is underflow.");
        }else{
            System.out.println("Front element is : "+top.data);
        }
    }
    void Display(){
        if(isEmpty()){
            System.out.println("Stack is underflow.");
        }else{
            stackNode temp = top;
            System.out.print("Stack is : ");
            while(temp!=null){
                System.out.print(temp.data+" | ");
                temp = temp.next;
            }System.out.println();
        }
    }
    public static void main(String args[]){
        StackAsLinkedList s = new StackAsLinkedList();
            s.push("D1");
            s.push("D2");
            s.peek();
            s.push("D3");
            s.push("D4");
            s.push("D5");
            s.push("D6");
            s.Display();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();

    }
}
