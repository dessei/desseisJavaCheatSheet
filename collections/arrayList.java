package collections;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //can store standard integers with autoboxxing

        list.add(3);
        list.add(4);
        list.add(2992);
    
        //feature of all COllections
        Collections.sort(list);

    }
}
