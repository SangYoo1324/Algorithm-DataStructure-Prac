package CiscoCodingChallenge;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * matrix, represents the elements of the matrix of size N*M.
 */
public class Solution2
{
    public static void  funcMatrix(int[][] matrix)
    {
        int maxInRow = Integer.MIN_VALUE;
        int minInColumn = Integer.MAX_VALUE;
        int rowIndex = -1;
        int columnIndex = -1;

        // find the largest number in each row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxInRow) {
                    maxInRow = matrix[i][j];
                    rowIndex = i;
                }
            }

            // check if the largest number in this row is also the smallest in its column
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == rowIndex && matrix[i][j] < minInColumn) {
                    minInColumn = matrix[i][j];
                    columnIndex = j;
                }
            }

            // reset maxInRow for the next row
            maxInRow = Integer.MIN_VALUE;
        }

        if (columnIndex == -1) {
            System.out.println("-1");
        } else {
            System.out.println(rowIndex +"////////" +columnIndex);
            System.out.println("Largest in row: " + matrix[columnIndex][rowIndex]);
        }


    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // input for matrix
        int matrix_row = in.nextInt();
        int matrix_col = in.nextInt();
        int matrix[][] = new int[matrix_row][matrix_col];
        for(int idx = 0; idx < matrix_row; idx++)
        {
            for(int jdx = 0; jdx < matrix_col; jdx++)
            {
                matrix[idx][jdx] = in.nextInt();
            }
        }


        funcMatrix(matrix);
    }
}
