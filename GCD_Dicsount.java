import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t--) {
            int n = scanner.nextInt();
            Vector<Integer> arr = new Vector<>(n);
            Vector<Integer> brr = new Vector<>(n);
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            for (int i = 0; i < n; i++) {
                brr.add(scanner.nextInt());
            }
            Vector<Integer> prefix = new Vector<>(n);
            Vector<Integer> suffix = new Vector<>(n);
            prefix.set(0, arr.get(0));
            suffix.set(n - 1, arr.get(n - 1));
            for (int i = 1; i < n; i++) {
                prefix.set(i, gcd(prefix.get(i - 1), arr.get(i)));
            }
            for (int i = n - 2; i >= 0; i--) {
                suffix.set(i, gcd(suffix.get(i + 1), arr.get(i)));
            }
            int mx = prefix.get(n - 1);
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    int temp = gcd(suffix.get(i + 1), brr.get(i));
                    mx = Math.max(mx, temp);
                } else if (i == n - 1) {
                    int temp = gcd(prefix.get(i - 1), brr.get(i));
                    mx = Math.max(mx, temp);
                } else {
                    int left = gcd(prefix.get(i - 1), suffix.get(i + 1));
                    int right = gcd(left, brr.get(i));
                    mx = Math.max(mx, right);
                }
            }
            System.out.println(mx);
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
