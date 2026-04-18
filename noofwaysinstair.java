import java.util.*;

public class noofwaysinstair{
    public static int countways(int n){
        if (n<=1) return 1;
        return countways(n-1)+countways(n-2);

    }
    public static void main(String[] args) {
        //  Scanner sc= new Scanner(System.in);
        int n=15;
        System.out.println(countways(n));    
    }
}
