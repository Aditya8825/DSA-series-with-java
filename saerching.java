import java.util.Scanner;
public class saerching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];  // fixed size matrix (2x2)

        System.out.println("Enter 4 elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                if (a[i][j] == x)
                    System.out.println("Found at (" + i + "," + j + ")");

        sc.close();
    }
}