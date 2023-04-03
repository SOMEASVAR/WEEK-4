import java.util.*;
public class nine {
    public static void main(String args[]){
        HashMap<Integer,String> p= new HashMap<Integer,String>();
        p.put(1,"Red");
        p.put(2,"Green");
        p.put(3,"Black");
        p.put(4,"White");
        p.put(5,"Blue");
        Set keyset = p.keySet();
        System.out.println("Key set values are: " + keyset);
    }
}
