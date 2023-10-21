// import java.util.ArrayList;

// public class Main {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class Stack {
//         public Node head = null;

//         public boolean isEmpty() {
//             return head == null;
//         }

//         public void push(int data) {
//             Node new_node = new Node(data);
//             new_node.next = head;
//             head = new_node;
//         }

//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         s.push(50);

//         System.out.println("Peeked: " + s.peek()); // Peeked: 50
//         System.out.println("Popped: " + s.pop());   // Popped: 50

      
//         while (!s.isEmpty()) {
//             int popped = s.pop();
//             System.out.print(popped + " ");
            
//         }

//         // Now you have the popped elements in the "poppedElements" ArrayList
//     }
// }
