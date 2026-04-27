// import java.util.*;

// public class uniquepath {
//     static int uniquepaths(int m, int n){
//         //base case out of frid 
//         if(m<=0 || n<=0){
//             return 0;
//         }
//         // base case  strt cell
//         if(m==1 && n==1){
//             return 1;
//         }
//         // move up +move left
//         int up=uniquepaths(m-1, n);
//         int left=uniquepaths(m, n-1);
//         return up+left;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter m:");
//         int m=sc.nextInt();

//         System.out.println("enter n:");
//         int n=sc.nextInt();

//         System.out.println("unique path:"+uniquepaths(m,n));
//     }
// }
