import java.util.HashSet;
import java.util.Set;

public class Errorpronetest {

    public static void main(String[] args) {
        System.out.println("Testing error prone..");
        Set<Short> s = new HashSet<Short>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - 1);
        }
        System.out.println(s.size());
    }
}
