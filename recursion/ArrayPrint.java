package recursion;

public class ArrayPrint {
    public static void printn(int a[], int index) {
        if (index == a.length) {
            return;
        }
        System.out.print(a[index] + " ");
        printn(a, index + 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        printn(a, 0);
    }
}