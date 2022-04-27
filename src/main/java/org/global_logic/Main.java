package org.global_logic;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String inputData= args[0];
        Map<Character, Integer> dictionary = new HashMap<>();
        for(char chr : inputData.toLowerCase().toCharArray()){
            if(dictionary.containsKey(chr)){
                dictionary.put(chr, dictionary.get(chr)+1);
            }else{
                dictionary.put(chr,1);
            }
        }
        Map<Character, Integer> treeMap = new TreeMap<>(dictionary);
        System.out.println("Counted letters:");
        for (Character chr : treeMap.keySet()) {
            System.out.println(chr+"="+treeMap.get(chr));
        }
    }
}