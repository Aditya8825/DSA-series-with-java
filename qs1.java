import java.util.*;
//to check find factorial of nummber<<<<<<<<<<<<<<<<<<<<<<<<<<
public class qs1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num:");
        int n=sc.nextInt();
    // //    // int n=5, 
    //    int fact=1;
    //    for(int i=1; i<=n; i++){
    //     fact*=i;
    //    }
    //    System.out.println("factorial ="+fact);
    //     }

    // }




    //to check wheter it is prime number ir not<<<<<<<<<<<,\
    // int n=29;
//     boolean isprime=true;
  
//     for(int i=2; i<n/2; i++){
//         if(n%i ==0){
//             isprime=false;
//             break;
//         }
//     }
// System.out.println(isprime?"prime":"not prime");
//     }}



//sum of digit<<<<<<<<<<<,,
// int n=123;
int sum =0;

while(n!=0){
    sum+=n %10;
    n /=10;
}
System.out.println("sum:"+sum);
    }}
