package recursion;

public class Oddnumber {
    public static void odd(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 != 0) {
            System.out.print(start + " ");
        }
        odd(start + 1, end); 
    }

    public static void main(String[] args) {
        int start = 34; 
        int end = 78;   
        odd(start, end); 
    }
}
