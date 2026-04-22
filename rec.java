

// public class rec {

//     static int sum(int[] arr, int i, int s) {
//         if (i == arr.length) {
//             System.out.println(s);
//             return s;
//         }

//         return sum(arr, i + 1, s + arr[i]) +
//                sum(arr, i + 1, s);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int result = sum(arr, 0, 0);
//         System.out.println("total:"+result);
//     }
// }





//  public class rec {

// static int totalsum(int[] arr, int i, int sum) {
//         if (i == arr.length) {
//             System.out.println(sum);
//             return sum;
//         }

      
//         int x=totalsum(arr,i+1,sum+arr[i]);
//         int y=totalsum(arr, i+1,sum);
//         return x+y;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int i=0;
//         int sum=0;
       
//         System.out.println(totalsum(arr,i,sum));
//     }
// }





// static void totalsum(String str, int n){
//     if(n==0){
//         System.out.println(str);
//         return;
//     }
//     totalsum(str + "0" ,n-1);
//     totalsum(str + "1", n-1);
// }
// public static void main(String[] args) {
//     int n=2;
//     totalsum("", n);
//     // System.out.println(totalsum(null, n););
// }}