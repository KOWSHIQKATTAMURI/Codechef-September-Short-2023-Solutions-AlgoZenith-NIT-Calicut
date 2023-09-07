import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t--) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Set<Long> s = new TreeSet<>();
            SortedMultiset<Long> ms = new SortedMultiset<>();
            ms.add(m - 0);
            s.add(0L);
            s.add((long) m);
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                s.add((long) a);
                Long it = s.ceiling(a);
                Long it2 = it, it3 = it;
                it2--;
                it3++;
                ms.remove(ms.find(it3 - it2));
                ms.add(a - it2);
                ms.add(it3 - a);
                System.out.print(ms.last() + " ");
            }
            System.out.println();
        }
    }
}

class SortedMultiset<E> extends TreeSet<E> {
    public E find(E element) {
        E floor = floor(element);
        E ceiling = ceiling(element);
        if (floor == null) {
            return ceiling;
        } else if (ceiling == null) {
            return floor;
        } else {
            return (element - floor < ceiling - element) ? floor : ceiling;
        }
    }
}
