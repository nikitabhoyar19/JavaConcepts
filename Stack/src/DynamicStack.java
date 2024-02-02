import java.util.*;

class DStack {

    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data) {
        if(size() == capacity) {
            expand();
        }
            stack[top] = data;
            top++;
    }

    private void expand() {
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
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
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length = size();
        if(length<=(capacity/2)/2) capacity = capacity/2;
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }

    public int peek() {
        int data;
        data = stack[top-1];
        return data;
    }

    public void show() {
        System.out.println();
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

public class DynamicStack {
    public static void main(String[] args) {
        DStack ss = new DStack();

        ss.push(5);
        ss.push(9);
        ss.push(10);
        ss.push(11);
        ss.push(121);
        ss.push(18);
        ss.show();
       ss.pop();
       ss.show();
       ss.push(21);
       ss.show();
        ss.push(94);
        ss.push(22);
        ss.push(23);
        ss.push(23);
        ss.push(23);
        ss.push(23);
        ss.push(23);
        ss.push(23);
        ss.push(25);
        ss.push(24);
        ss.show();
        ss.pop();
        ss.show();
        ss.pop();
        ss.show();
        ss.pop();
        ss.show();
        ss.pop();
        ss.show();
        ss.pop();
        ss.pop();
        ss.pop();
        ss.show();

    }
}
