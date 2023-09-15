public class Stack {
    int size;
    int top;
    int[] array;
    Stack(int capacity){
        size = capacity;
        top = -1;
        array = new int[size];
    }
    boolean isFull(){
        return (top == size -1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            array[top+1] = element;
            top++;
            System.out.println(top + " === " + element);
        }
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            int previousTop = top;
            System.out.println("Top ===" + top);
            top--;
            System.out.println("Top ===" + top);
            System.out.println(array[previousTop]);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(3);
        myStack.push(21);
        myStack.push(14);
        myStack.push(12);
        myStack.pop();
    }
}
