
import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter elements of 3x3 matrix:");

        // Input matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        //int secondarySum = 0;

        // Calculate diagonal sums
        for (int i = 0; i < 3; i++) {
            primarySum += matrix[i][i];           // main diagonal
            //secondarySum += matrix[i][2 - i];     // secondary diagonal
        }

        System.out.println("Primary diagonal sum: " + primarySum);
        //System.out.println("Secondary diagonal sum: " + secondarySum);

        
    }
}