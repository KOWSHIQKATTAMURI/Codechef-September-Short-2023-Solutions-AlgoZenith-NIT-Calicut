import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t--) {
            int turns = 0;
            int x, h;
            x = scanner.nextInt();
            h = scanner.nextInt();
            while (h > 0) {
                if (turns <= 4) {
                    h -= x / 2;
                    turns++;
                } else {
                    h -= x;
                    turns++;
                }
            }
            System.out.println(turns);
        }
    }
}
