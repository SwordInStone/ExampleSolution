package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class duplicateCount {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> parser = new HashMap<Character, Integer>();
        int counter = 0;
        char[] arg = text.toLowerCase(Locale.ROOT).toCharArray();
        for(char c : arg){
            if(parser.containsKey(c)){
                parser.replace(c, parser.get(c),parser.get(c) + 1);
            }
            else {
                parser.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : parser.entrySet()){
            if(entry.getValue()>1){
                counter++;
            }
        }
        return counter;
    }
}
