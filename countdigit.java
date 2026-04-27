//count digit and sum of number this is basic case<<<<<<<<<<<<<<<<<<<<<<
// public class countdigit {
//     static int countDigits(int n){
//         int count=0;
//         while(n!=0){
//             n=n/10;
//             count++;
//         }
//         return count;
//     } static int sumDigits(int n) {
//         if (n == 0) return 0;
//         return (n % 10) + sumDigits(n / 10);
//     }
//     public static void main(String[] args) {
//       int n=12345;
//       System.out.println(countDigits(n));  
//       System.out.println(sumDigits(n));
//     }
// }



//method 2






// import java.util.*;
// public class sum{
//     static int ways(int n,int[] dp){
//         if(n==0){
//             return 0;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//     }
//     dp[n]=n%10+ways(n/10,dp);
//     return dp[n];
// }
//     public static void main(String[] args) {
//         int n=12345;
//         int[] dp=new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(ways(n,dp));
//     }
// }



//  print count of digit number <<<<<<<<<<<<<<<<<
// public class sum{
//     static int ways(int n,int[] dp){
//         if(n==0){
//             return 0;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//     }
//     dp[n]=1+ways(n/10,dp);
//     return dp[n];
// }
//     public static void main(String[] args) {
//         int n=12345;
//         int[] dp=new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(ways(n,dp));
//     }
// }