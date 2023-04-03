import java.util.*;
import java.util.Map.Entry;
public class ten {
    public static void main(String args[]) {
        TreeMap < Integer, String > t = new TreeMap < Integer, String > ();
        t.put(10, "Red");
        t.put(20, "Green");
        t.put(30, "Black");
        t.put(40, "White");
        t.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + t);
        System.out.println("Keys greater than or equal to 20: " + t.ceilingEntry(20));
        System.out.println("Keys greater than or equal to 40: " + t.ceilingEntry(40));
        System.out.println("Keys greater than or equal to 50: " + t.ceilingEntry(50));
    }
}
