//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//StackWithArray stackWithArray =new StackWithArray(5);
//stackWithArray.push(1);
//stackWithArray.push(2);
//stackWithArray.push(3);
//stackWithArray.push(4);
//
//stackWithArray.display();
//int popped= stackWithArray.pop();
//    System.out.println("popped: "+popped);
//    stackWithArray.display();
//    int top = stackWithArray.getTop();
//    System.out.println("top: "+top);
//    stackWithArray.pop();
//    stackWithArray.pop();
//    stackWithArray.pop();
//    stackWithArray.pop();
//    stackWithArray.display();
//    stackWithArray.push(1);
//    stackWithArray.push(2);
//    stackWithArray.push(3);
//    stackWithArray.push(4);
//    stackWithArray.push(5);
//    stackWithArray.push(6);
//    stackWithArray.display();
//


    StackWithLS stack=new StackWithLS();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    stack.display();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.display();
    System.out.println(stack.getTop());
}
