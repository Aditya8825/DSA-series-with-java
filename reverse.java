import java.util.*;

// public class reverse {
    
//     static int reverse(int n, int rev){
//         if(n==0){
//             return rev;
//         }
//        rev = rev*10 + n%10;
//        return reverse(n/10,rev);
//     }
//    public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.print("enter number:");
//     int n=sc.nextInt();
//     // int n=sc,nextInt();
//     int reversenumber=reverse(n, rev);
//     System.out.println("the reverse of the num"+ reversenumber);

    // for(int i=0; i<=n; i++){
    //     System.out.println(i);
         
    //     int rev= 
    //     for(int j=0; j<=n; j++){

        
public class reverse {
    
    static int reverse(int n, int rev){
        if(n==0){
            return rev;
        }
       rev = rev*10 + n%10;
       return reverse(n/10,rev);
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter number:");
    int n=sc.nextInt();
    // int n=sc,nextInt();
    int reversenumber=reverse(n, 0);
    System.out.println("the reverse of the num:- "+ reversenumber);
   }
}