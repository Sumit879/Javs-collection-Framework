import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
            // Set<Integer> set = new TreeSet<>();
            // Set<Integer> set = new HashSet<>();
            Set<Integer> set = new LinkedHashSet<>();
            set.add(32);
            set.add(31);
            set.add(31);
            set.add(33);
            System.out.println(set);
    }
}
