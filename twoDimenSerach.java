// public class Main {
//     public static boolean SeachInMatrix(int matrix[][], int key) {
//         int row = 0;
//         int col = matrix[0].length - 1;

//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 return true;
//             } else if (matrix[row][col] > key) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         int key = 17;

//         String result = SeachInMatrix(matrix, key) ? "Found" : "Not Found";
//         System.out.print(result);
//     }
// }
