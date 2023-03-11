import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SLL<Integer> Slist = new SLL<Integer>();
        Slist.insertFirst(7);
        Slist.insertLast(8);
        Slist.insertLast(13);
        Slist.insertLast(4);
        Slist.insertLast(11);
        Slist.insertLast(1);
        Slist.insertLast(7);
        Slist.insertLast(4);
        Slist.insertLast(15);
        System.out.println("The list is "+Slist);
        Slist.mirror();
        Slist.print();
        System.out.println(+Slist.length());
    }
}