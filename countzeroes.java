// import java.util.*;
// public class countzeroes {
//    static int ways(int n,int[] dp){
//     if(n==0) return 0;
//     if(dp[n]!=-1) return dp[n];
//     if(n%10 ==0){
//         dp[n]=1+ways(n/10, dp);
//     }else{
//         dp[n]=ways(n/10,dp);
//     }
//     return dp[n];
//    }
//     public static void main(String[] args) {
// int n=1020203000;
//      int[] dp=new int[n+1];
//      Arrays.fill(dp,-1);
//      System.out.println(ways(n,dp));
//     }
// }




// public class CountZeroes {
//     static int isZero(char ch) {
//         if (ch == '0') return 1;
//         return 0;
//     }

//     static int ways(String str, int i, int[] dp) {
//         if (i == str.length()) return 0;

//         if (dp[i] != -1) return dp[i];

//         return dp[i] = isZero(str.charAt(i)) + ways(str, i + 1, dp);
//     }

//     public static void main(String[] args) {
//         String str = "1020300";

//         int[] dp = new int[str.length()];
//         Arrays.fill(dp, -1);

//         System.out.println(ways(str, 0, dp));
//     }
// }