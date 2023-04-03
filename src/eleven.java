import java.util.*;
import java.util.Map.Entry;
public class eleven {
    public static void main(String args[]) {
        TreeMap < Integer, String > e = new TreeMap < Integer, String > ();
        e.put(10, "Red");
        e.put(20, "Green");
        e.put(40, "Black");
        e.put(50, "White");
        e.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + e);
        System.out.println("Keys greater than or equal to 20: " + e.ceilingKey(20));
        System.out.println("Keys greater than or equal to 30: " + e.ceilingKey(30));
        System.out.println("Keys greater than or equal to 50: " + e.ceilingKey(70));
    }
}
