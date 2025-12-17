import java.util.ArrayList;

class StackNode<T> {
    T data;
    StackNode<T> next;

    StackNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList: " + list);
        StackNode<Integer> stack = null;
        for (Integer item : list) {
            StackNode<Integer> newNode = new StackNode<>(item);
            newNode.next = stack;
            stack = newNode;
        }
        

    }
    
}