package Searches;

import java.util.*;
public class HashTables {
    public static void main(String[] args) {
        //great for large data sets but not large

        Hashtable<String, String> table = new Hashtable<>(10, 0.5f);
        table.put("100","spongebob");
        table.put("123", "patrick");
        table.put("321", "gary");
        table.put("555", "squidward");

        for(String key : table.keySet()){
            System.out.println(key.hashCode() % 10 +"\t" + key + "\t" + table.get(key));
        }

    }
}
