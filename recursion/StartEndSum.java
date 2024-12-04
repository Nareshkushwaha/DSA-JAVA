package recursion;


public class StartEndSum {
    static int sum(int start, int end) {
        if (start > end) {
            return 0;
        }
        return start + sum(start + 1, end);
    }

    public static void main(String[] args) {
        int n = 34;
        int end = 78;
        System.out.println(sum(n, end));
    }
}
