import java.util.Scanner;

public class count0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = sc.nextInt();

        int count = 0;

       
        if (n == 0) {
            count = 1;
        } else {
            n = Math.abs(n); 

            while (n > 0) {
                if (n % 10 == 0) {
                    count++;
                }
                n = n / 10;
            }
        }

        System.out.println("The number of zeros: " + count);
    }
}