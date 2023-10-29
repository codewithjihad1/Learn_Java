import java.util.ArrayList;
import java.util.List;

public class Exercise11 {

    /**
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
    }


    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };

        spiralOrder(a);
    }
}

