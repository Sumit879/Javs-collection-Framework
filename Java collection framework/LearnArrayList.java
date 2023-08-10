import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
// import javax.swing.text.html.HTMLDocument.Iterator;

public class LearnArrayList {
    public static void main(String[] args){
    //   String[] studentName = new String[30];
    //   studentName[0] = "Rakesh";
    //   studentName[29] = "harish";
    //   studentName[10] = "Raman";

    // ArrayList<String> student = new ArrayList<>();
    // student.add("rakesh1");
    // student.add("rakesh2");
    // student.add("rakesh3");
     
    // System.out.println(student);

    List<Integer> list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1,50);
    System.out.println(list);
    List<Integer> newlist = new ArrayList();
    newlist.add(150);
    newlist.add(160);
    list.addAll(newlist);
    // System.out.println(list);
    // System.out.println(list.get(1));
    // list.remove(1);
    // list.remove(Integer.valueOf(3));
    // list.set(2,1000);
    // System.out.println(list.contains(50));
    // System.out.println(list);
    // for(int i = 0 ; i<list.size();i++){
    //     System.out.println(list.get(i));
    // }
    // for(Integer element : list){
    //     System.out.println(element);
    // }
    Iterator<Integer>it = list.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }
}
