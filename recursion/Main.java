 package recursion;
public class Main {
    
    public static int facto(int n) {
        if (n == 0) {
            return 1;
        }
        
        int ans=facto(n-1);
        int f=ans*n;
        return f;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(facto(n));
    }
}
