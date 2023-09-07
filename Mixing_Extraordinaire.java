import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Vector<Integer> arr = new Vector<>(n);
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            long total = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    total += (long) (arr.get(i) * arr.get(j));
                }
            }
            System.out.println(total);
        }
    }
}
