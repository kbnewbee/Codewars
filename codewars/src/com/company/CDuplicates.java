package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CDuplicates {
    public static void main(String[] args) {
        String text = "aabbcc";
        text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        text.chars().forEach(c -> {
            map.put((char)c, map.containsKey((char)c)?1:0 );
        });

        System.out.println(map.values().stream().filter(e -> e > 0).count());
        System.out.println(text
                .toLowerCase()
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()))
                .values()
                .stream()
                .filter(e -> e>1)
                .count());

        int cnt=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());

            if (entry.getValue() == 1) {
                cnt++;
                System.out.println(entry.getValue());
            }
        }

        System.out.println(cnt);
    }
}
