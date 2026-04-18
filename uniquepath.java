public class uniquepath {
    public static int uniquepath(int m, int n){
        if(m==1  || n==1) return 1;
        return uniquepath(m-1, n) + uniquepath(m, n-1);

    }
    public static void main(String[] args) {
        int m=2;
        int n=2;
        System.out.println(uniquepath(m,n));
    }
    
}