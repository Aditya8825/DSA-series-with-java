public class abc {
    static void totalsum(String str, int n){
    if(n==0){
        System.out.println(str);
        return;
    }
    totalsum(str + "A" ,n-1);
    totalsum(str + "B", n-1);
}
public static void main(String[] args) {
    int n=2;
    totalsum("", n);
    // System.out.println(totalsum(null, n););
}}

