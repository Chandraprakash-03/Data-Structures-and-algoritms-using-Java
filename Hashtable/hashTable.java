package Hashtable;

import java.util.Hashtable;

public class hashTable {

    public static void main(String[] args) {

        Hashtable<String, String> table = new Hashtable<>();

        table.put("100", "String1");
        table.put("123", "String2");
        table.put("555", "String3");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + " " + key + " " + table.get(key));
        }

    }
}