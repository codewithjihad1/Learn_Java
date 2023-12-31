import java.util.ArrayList;
import java.util.List;

public class Exercise11 {

    /**
     * Print the spiral order matrix as output for a given matrix of numbers. 
     * Link: https://algodaily.com/challenges/traverse-a-matrix-in-spiral-order
     * @param matrix
     * @return
     */
    public static void spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // step 1
            for(int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }

            rowStart++;

            // step 2
            for(int row=rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }

            colEnd--;

            // step 3
            for(int col=colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }

            rowEnd--;

            // step 4
            for(int row=rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            
            colStart++;
        }
    }


    /**
     * For a given matrix of N x M, print its transpose.
     * @param matrix
     */
    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int col=0; col < m; col++) {
            for(int row=0; row < n; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        

    }


    public static void main(String[] args) {
        int a[][] = {   {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20} 
                    };

        transpose(a);
    }
}

