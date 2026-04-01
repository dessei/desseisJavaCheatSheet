package collections;

import java.util.HashMap;

class hashmaps{
    public static void main(String[] args) {
        HashMap<String, Integer> myHashmap = new HashMap<>();
        //Julian und seine Ratings von verschiedenen Sachen
        myHashmap.put("normale Kartoffel", 1);
        myHashmap.put("pommes", 2);
        myHashmap.put("Undav", 8479345);

        System.out.println(myHashmap);

        for(String thing : myHashmap.keySet()) {
            System.out.println(thing + ": " + myHashmap.get(thing));
        }

        //map.containskey(key) returns bool depending if key exists in map
    }
}