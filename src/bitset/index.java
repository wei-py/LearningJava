package bitset;
import java.util.*;

public class index {
    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException {
        Vector c1 = new Vector();
        c1.add(1);
        c1.add(1);
        c1.add(1);
//        Collection a = new Collection();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i =2; i < 5; i++) {
            a.add(i);
        }
        c1.addAll(3, a);
        System.out.println(c1.elementAt(c1.size() - 1));
    }
}


