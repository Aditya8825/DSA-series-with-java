import java.util.*;
// public class susbstring {
//     static int ways(String str,int i,int[]dp){
//         if(i==str.length()) return 1;
//         if(dp[i]!=-1) return dp[i];
//         int x=ways(str, i+1, dp);
//         int y=ways(str, i+1, dp);
//         return dp[i];
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         int []dp=new int[str.length()+1];
//         Arrays.fill(dp,-1);
//         int i=0;
//         System.out.println(ways(str, i, dp));
//     }}


import java.util.*;
public class subslength{
    static int ways(String str, int i,int[] dp){
        if(i==str.length())
            return 1;
        if(dp[i]!=-1)
            return dp[i];
   int x=ways(str,i+1,dp);
   int y=ways(str,i+1,dp);
   dp[i]=x+y;
    return dp[i];
}
    public static void main(String[] args) {
        String str="abc";
        int[] dp=new int[str.length()+1];
        Arrays.fill(dp,-1);
        int i=0;
        System.out.println(ways(str,i,dp));
    }
}