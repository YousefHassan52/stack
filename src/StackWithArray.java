public class StackWithArray {
    int maxSize;
    int top;
    int arr[];

    public StackWithArray(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.arr =new int[maxSize];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public void push(int data) {
        if(this.isFull())
        {
            System.out.println("Stack is full");
            return;
        }
        //top++
        arr[++top]=data;
        System.out.println("Pushed "+arr[top]+" to stack");

    }
    public int pop() {
        if(this.isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
//        int poppedItem=arr[top--];
        // top--
        return arr[top--];

    }
    public void display(){
        if(this.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }        for(int i=top;i>=0;i--)

        {
            System.out.println(" | "+arr[i]+" | ");
        }
        System.out.println("ـــــ ");
    }
    public int getTop(){
        return arr[top];
    }
}
