// https://chatgpt.com/c/6773a352-c4a0-8013-8f8d-c55995077839

// Problem Statement –

// Write the code to traverse a matrix in a spiral format.

 

// Sample Input 

// Input 

// 5   4

// 1   2   3   4

// 5   6   7   8

// 9   10 11 12

// 13 14 15 16

// 17 18 19 20

// Output 

// 1  2  3  4  8  12  16  20  19  18  17  13  9  5  6  7  11  15  12  14 10  
package Capgemini;

import java.util.Scanner;

public class Q3 {

    public static void spiralmatrix(int matrix[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;

        while (StartRow <= EndRow && StartCol <= EndCol) { // For Odd/Even matrix
            // Top
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }

            // Right
            for (int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }

            // Bottom
            for (int j = EndCol - 1; j >= StartCol; j--) {
                System.out.print(matrix[EndRow][j] + " ");
                if (StartRow == EndRow) {
                    break;
                }
            }

            // Left
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                System.out.print(matrix[i][StartCol] + " ");
                if (StartCol == EndCol) {
                    break;
                }
            }
            StartRow++;
            EndCol--;
            StartCol++;
            EndRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int matrix[][] = new int[rows][cols];

        // Take user input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Spiral Order of the Matrix:");
        spiralmatrix(matrix);

        scanner.close();
    }
}
