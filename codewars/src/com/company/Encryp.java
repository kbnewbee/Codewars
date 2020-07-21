package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Encryp {
    public static void main(String[] args) {
        String text = "A wise old owl lived in an oak";

        String[] words = text.split(" ");
//        System.out.println((int)words[0].charAt(0));
//        System.out.println(a);

        StringBuilder stringBuilder = new StringBuilder();
        for (String w : words) {
            stringBuilder.append((int) w.charAt(0));
            if (w.length() > 1) {
                stringBuilder.append(w.charAt(w.length() - 1));
                if (w.length() > 2)
                    stringBuilder.append(w.substring(2, w.length() - 1)).append(w.charAt(1));
            }
            stringBuilder.append(' ');
//            65 119esi 111dl 111lw 108dvei 105n 97n 111ka
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        System.out.println(stringBuilder);

        System.out.println(Arrays.stream(text.split(" "))
                .map(w -> w.length() > 2 ? (int) w.charAt(0) + w.substring(w.length() - 1) + w.substring(2, w.length() - 1) + w.substring(1, 2) :
                        w.length() > 1 ? (int) w.charAt(0) + w.substring(1) :
                                w.length() == 1 ? (int) w.charAt(0) + "" : "")
                .collect(Collectors.joining(" ")));
    }
}
