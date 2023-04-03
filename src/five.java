import java.util.*;
public class five {
    public static void main(String[] argv)
    {
        HashSet<String> a = new HashSet<String>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("E");
        System.out.println("First HashSet: " + a);
        HashSet<String> r= new HashSet<String>();
        r.add("A");
        r.add("B");
        r.add("C");
        r.add("D");
        r.add("E");
        System.out.println("Second HashSet: " + r);

        boolean value = a.equals(r);

        System.out.println("Are both set equal: " + value);
    }
}