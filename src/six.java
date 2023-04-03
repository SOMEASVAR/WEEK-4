import java.util.TreeSet;
import java.util.Iterator;
public class six {
    public static void main(String[] args) {
        TreeSet <Integer> t = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
        t.add(10);
        t.add(22);
        t.add(36);
        t.add(25);
        t.add(16);
        t.add(70);
        t.add(82);
        t.add(89);
        t.add(14);
        System.out.println("Original tree set: "+t);
        System.out.println("Removes the last element: "+t.pollLast());
        System.out.println("Tree set after removing last element: "+t);
    }
}
