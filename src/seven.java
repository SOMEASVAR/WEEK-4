import java.util.*;
public class seven {
    public static void main(String[] args) {
        PriorityQueue<String> p = new PriorityQueue<String>();
        p.add("Red");
        p.add("Green");
        p.add("Black");
        p.add("White");
        System.out.println("Original Priority Queue: "+p);
        String str1;
        str1 = p.toString();
        System.out.println("String representation of the Priority Queue: "+str1);
    }
}
