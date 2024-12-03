package recursion;

public class EvenSum {
    public static int sum(int start, int end) {
        if (start > end) {
            return 0;
        }
        if (start % 2 == 0) {
            return sum(start + 1, end) + start;    
        }
        return sum(start + 1, end);
    }
    
    public static void main(String args[]) {
        int start = 1;
        int end = 5;
        int result = sum(start, end);
        System.out.println("Sum of even numbers between " + start + " and " + end + " is: " + result);
    }
}
