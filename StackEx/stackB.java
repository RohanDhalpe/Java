// import java.util.ArrayList;

// public class Main {
//         public static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();

//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         public static void push(int data) {
//             list.add(data);
//         }

//         public static int pop() {
//             if (isEmpty()) {
//                 System.out.println("Stack is empty");
//                 return -1; // Return a sentinel value to indicate an empty stack
//             }
//             int element = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return element;
//         }

//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Stack is empty");
//                 return -1; // Return a sentinel value to indicate an empty stack
//             }
//             return list.get(list.size() - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//          s.push(45);
//         s.push(46);
       

//         System.out.println("Popped: " + s.pop()); // Popped: 4
//         System.out.println("Peeked: " + s.peek()); // Peeked: 3
        
//          while(!s.isEmpty()){
//           System.out.print(s.peek()+" ");
//           s.pop();
//         }
//     }
// }
