import java.io.*;
import java.util.HashSet;

public class four{
    public static void main(String args[])
    {
        HashSet<String> s = new HashSet<String>();
        s.add("Java");
        s.add("is");
        s.add("some");
        s.add("what");
        s.add("easy");
        System.out.println("HashSet: " + s);
        s.clear();
        System.out.println("The final set: " + s);
    }
}