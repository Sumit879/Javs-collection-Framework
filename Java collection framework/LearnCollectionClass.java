import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
 
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        // System.out.println("min element " + Collections.min(list));
        // System.out.println("min element " + Collections.max(list));
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}
