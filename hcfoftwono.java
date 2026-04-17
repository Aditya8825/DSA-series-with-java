import java.util.*;

public class hcfoftwono {
    

    public static int gcf(int a, int b){
        int hcf=1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }}
            return hcf;

        }
//  
public static void main(String[] args) {
    //int a=12,b=16;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a:");
    int a=sc.nextInt();

    System.out.print("enter b:");
    int b=sc.nextInt();
System.out.println("hcf of two number:"+gcf(a, b));
}}