// public class ReverseString 
//{
//     public static String reverseUsingCharArray(String str){
//         char[] charArray = str.toCharArray();
//         int start = 0;
//         int end = str.length() - 1;

//         while (start < end) {
//             char temp = charArray[start];
//             charArray[start] = charArray[end];
//             charArray[end] = temp;
//             start++;
//             end--;
//         }
//       return new String(charArray);
//     }

//     public static void main(String[] args) {
//         String original = "Hello, World!";
//         String reversed = reverseUsingCharArray(original);
//         System.out.println("Original: " + original);
//         System.out.println("Reversed: " + reversed);
//     }
// }
