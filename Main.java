// public class countofeven{
// static int totalSum(int[] arr,int i, int sum){
//     if(i==arr.length){
//         System.out.println(sum);
//         return sum;
//     }
//     int x=totalSum(arr, i+1, sum+arr[i]);
//     int y=totalSum(arr, i+1, sum);
//     return x+y;
// }
// public static void main(String[] args) {
//     int[] arr={1,2,3};
//     int i=0;
//     int sum=0;
//     System.out.println(totalSum(arr, i, sum));
// }}




//count of even and odd number
// public class CountEvenOdd {

//     static int[] solve(int[] arr, int i, int evenC, int oddC, int evenS, int oddS) {

//         if (i == arr.length) {
//             return new int[]{evenC, oddC, evenS, oddS};
//         }

//         if (arr[i] % 2 == 0) {
//             evenC++;
//             evenS += arr[i];
//         } else {
//             oddC++;
//             oddS += arr[i];
//         }

//         return solve(arr, i + 1, evenC, oddC, evenS, oddS);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};

//         int[] res = solve(arr, 0, 0, 0, 0, 0);

//         System.out.println("Even Count: " + res[0]);
//         System.out.println("Odd Count: " + res[1]);
//         System.out.println("Even Sum: " + res[2]);
//         System.out.println("Odd Sum: " + res[3]);
//     }
// }


// public class countofeven{
//     static void totalSum(int[]arr, int i,int sum,String curr){
//         if(i==arr.length){
//             System.out.println(curr);
//         }
//         return;
//     }
//     totalsum(arr,i+1,sum+arr[i],current[i]);
//     totalSum(arr, i+1, sum, curr);
// }
// public static void main(String[] args) {
//     int []arr={1,2,3};
//     totalSum(arr, 0, 0, null);
// }\



// public class countofeven {

//     static void totalSum(int[] arr, int i, int sum, String curr) {

//         if (i == arr.length) {
//             System.out.println(curr + " | Sum = " + sum);
//             return;
//         }

//         // pick element
//         totalSum(arr, i + 1, sum + arr[i], curr + arr[i] + " ");

//         // not pick element
//         totalSum(arr, i + 1, sum, curr);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         totalSum(arr, 0, 0, "");
//     }
// }





// only print A in the entire string
// public class Main {

//     static int  totalSum(String str, int i,boolean b) {
//         if (i == str.length()) {
//             return 1;
//         }
//         int x=totalSum(str, i+1, b || str.charAt(i) =='a');
//        int y=totalSum(str, i+1, b);
//        return x+y;
//     }
//     public static void main(String[] args) {
//         String str = "abcd";
//         System.out.println(totalSum(str, 0, false));
//     }
// }

//recurse relation 

 public class Main {

    static int  totalSum(String str, int i,boolean b) {
        if (i == str.length()) {
            return 1;
        }
        int x=totalSum(str, i+1, b || str.charAt(i) =='a');
       int y=totalSum(str, i+1, b);
       return x+y;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(totalSum(str, 0, false));
    }
}
