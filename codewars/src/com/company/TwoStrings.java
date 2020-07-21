package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoStrings {

    public static String twoStrings(String a, String b) {
        Map<String, Integer> map = new HashMap<>();
//        a.toLowerCase().chars().forEach(w -> {
//            if (map.containsKey((char) w)) {
//                int cnt = map.get((char) w);
//                map.put((char) w, cnt + 1);
//            } else {
//                map.put((char) w, 1);
//            }
//        });


//        StringBuilder stringBuilderb = new StringBuilder();
//        for (int i = 0; i < b.length(); i++) {
//            char k = Character.toLowerCase(b.charAt(i));
//            stringBuilderb.append(map.containsKey(k) ? (((map.get(k) % 2) != 0) ? (Character.isUpperCase(b.charAt(i)) ? Character.toLowerCase(b.charAt(i)) : Character.toUpperCase(b.charAt(i))) : b.charAt(i)) : b.charAt(i));
//
//        }
//        map.clear();
//        return stringBuilderb;
        for (int i = 0; i < b.length(); i++) {
            map.merge(b.substring(i, i + 1).toLowerCase(), 1, Integer::sum);
        }

        return Arrays.stream(a.split(""))
                .map(s -> map.get(s.toLowerCase()) != null && map.get(s.toLowerCase()) % 2 != 0
                        ? (s.toUpperCase().equals(s)
                        ? s.toLowerCase()
                        : s.toUpperCase())
                        : s)
                .collect(Collectors.joining(""));

    }

    public static void main(String[] args) {
        String a = "abcdeFgtrzw", b = "defgGgfhjkwqe";
//        StringBuilder stringBuilderb = twoStrings(a, b);
//        StringBuilder stringBuildera = twoStrings(b, a);
//        System.out.println(stringBuildera.append(stringBuilderb).toString());


//        char c = Character.isUpperCase(b.charAt(2)) ? Character.toLowerCase(b.charAt(2)) : Character.toUpperCase(b.charAt(2));
//        b.chars()
//                .forEach(c -> map.containsKey((char) c) ?
//                            map.get((char) c) % 2 != 0 ?
//                                Character.isUpperCase((char) c) ? Character.toLowerCase((char) c) : Character.toUpperCase((char) c)
//                            : c
//                        : c).collect(Collectors.joining(""));


        System.out.println("abcDeFGtrzWDEFGgGFhjkWqE \n");
//        System.out.println(stringBuilderb);

    }
}
