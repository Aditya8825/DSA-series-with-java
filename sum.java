import java.util.*;
public class sum{
    public static void main(String[] args) {
     int [][]arr= {{1,2,3,4,},{6,5,5,3},{9,8,7,6}};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}