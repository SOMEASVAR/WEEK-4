import java.util.*;
public class two
{
    public static void main(String[] args)
    {
        LinkedList <String> b = new LinkedList <String> ();
        b.add("Java");
        b.add("C");
        b.add("Cpp");
        b.add("Python");
        b.add("Php");
        System.out.println("Given linked list: " + b);
        String c = b.peekFirst();
        System.out.println("First Element in the linked list : " + c);
        System.out.println("New linked list: " + b);
    }
}