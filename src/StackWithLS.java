public class StackWithLS {
    Node head;

    public StackWithLS() {
        head=null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void push(int item) {
        if(this.isEmpty()){
            head=new Node(item);
            return;
        }
        Node n=new Node(item);
        n.next=head;
        head=n;

    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int popped=head.item;
        head=head.next;
        return popped;
    }
    public int getTop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.item;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.item);
            System.out.println("|");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
