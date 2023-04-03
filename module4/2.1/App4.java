import java.util.EmptyStackException;
import java.util.Scanner;

public class App4 {
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public static class MyStack<T> {
        private Node<T> top;
        private int size;

        public void push(T value) {
            Node<T> newNode = new Node<>(value);
            newNode.next = top;
            top = newNode;
            size++;
        }

        public T pop() {
            if (top == null) {
                throw new EmptyStackException();
            }
            T value = top.value;
            top = top.next;
            size--;
            return value;
        }

        public T peek() {
            if (top == null) {
                throw new EmptyStackException();
            }
            return top.value;
        }

        public int size() {
            return size;
        }

        public void clear() {
            top = null;
            size = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();
        String command = "";
        while (!command.equals("exit")) {
            command = scanner.next();
            switch (command) {
                case "push":
                    int n = scanner.nextInt();
                    stack.push(n);
                    System.out.println("ok");
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "back":
                    System.out.println(stack.peek());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "clear":
                    stack.clear();
                    System.out.println("ok");
                    break;
                case "exit":
                    System.out.println("bye");
                    break;
            }
        }
        scanner.close();
    }
}
