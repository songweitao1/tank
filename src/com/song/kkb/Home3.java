package com.song.kkb;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Home3 {
    static String tr = "fjekwFDQFjfeAFEajfeo2FAFEjfew";
    Map<Character,Integer> map = new TreeMap<>();
    public Map<Character, Integer> forChar() {
        char[] chars = tr.toCharArray();
        for (char aChar : chars) {
            if(aChar>'z'||aChar< 'a'&& aChar>'Z'||aChar<'A'){
                continue;
            }
            Integer integer = map.get(aChar);
            if(integer == null){
                map.put(aChar,1);
            }else {
                map.put(aChar,integer+1);
            }
        }
     return map;
    }

    public static void main(String[] args) {

        Home3 home3 = new Home3();
        Map<Character, Integer> characterIntegerMap = home3.forChar();
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<Character,Integer> mapentry :characterIntegerMap.entrySet()){
            sb.append(mapentry.getKey() + "  (" + mapentry.getValue()+")  ");
        }
        System.out.println(sb.toString());


    }
}



