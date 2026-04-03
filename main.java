
import java.util.*;
public class main{

    //tp print char according to input ,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    //a
    //ab
    //abc
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter nuber:");
    //     int n=sc.nextInt();

    //     for(int i=0; i<=n; i--){
    //         for(int j=0; j<i; j++){
    //             System.out.println((char)('A'+j));
    //         }
    //        }
            
            
    //         System.out.println();
    //     }
           
    // }
    



    ///to print mix of char and alphbat<<<<<<<<<<
  

//         for (int i = 1; i <= n; i++) {

//             if (i % 2 == 1) {  // numbers
//                 for (int j = 1; j <= (i + 1) / 2; j++) {
//                     System.out.print(j);
//                 }
//             } else {  // alphabets
//                 for (int j = 0; j < i / 2 + 1; j++) {
//                     System.out.print((char)('A' + j));
//                 }
//             }

//             System.out.println();
//         }
//     }
// }


//to print start in revrse way ****,,,,,,,,,,,,,,,,,,,,,,,,,,,,
//**
// */
// for(int i=n; i>=1; i--){
//     for(int j=1; j<=i ; j++){
//         System.out.print("*");
//     }

// System.out.println();
//     }
// }
// }


//to print the pattern in reverse order
//123
//12
//1




// for(int i=n; i>=1; i--){
//     for(int j=1; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//     }
// }


//how to flip triangle of Alphabat<<<<<<<<<<<<<<<<<<<<<<<<
//   public static void main(String[] args) {
       
  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);   // print in same line
            }
            System.out.println(); // move to next line
        }
    }
}