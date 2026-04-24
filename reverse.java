// public class reverse{
//     static String ways(String str,String[] dp){
//       if(str.length()==0) return "";
//       int len=str.length();
//       if(dp[len]!=null)  return dp[len];
//       dp[len]= ways(str.substring(1), dp) + str.charAt(0);
//       return dp[len];

// }
//     public static void main(String[] args) {
//       String str="hello";
//       String[] dp=new String[str.length()+1];
//       System.out.println(ways(str,dp));

//     }
// }