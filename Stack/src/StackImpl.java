class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if(top == 5) {
            System.out.println("Stack is full .....");
        }
        else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        int data = 0;
        if(isEmpty()) {
            System.out.println("Stack is empty, no item is present to remove");
        }
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public int peek() {
        int data;
        data = stack[top-1];
        return data;
    }

    public void show() {
        for(int item : stack) {
            System.out.print(item + " ");
        }
    }

    public boolean isEmpty() {
        if(top <= 0) return true;
        return false;
    }

    public int size() {
        int data = top;
        return data;
    }
}

public class StackImpl {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(5);
        s.push(9);
        s.push(10);
        s.push(11);
        s.push(18);
        System.out.println("Before pop.....");
        System.out.println("top : " + s.peek());
        s.show();
        System.out.println("size : " + s.size());
        s.pop();
        System.out.println();
        System.out.println("After Pop");
        System.out.println("top : " + s.peek());
        s.show();
        System.out.println("size : " + s.size());
        s.push(21);
        s.show();
        s.push(44);
        s.show();
    }
}
