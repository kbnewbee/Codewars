package com.company;

import java.util.ArrayList;
import java.util.List;

public class AltCap {

    public static void main(String[] args) {
        String s = "abcdef";

        String[] str;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(Character.toUpperCase(s.charAt(i)));
                stringBuilder1.append(Character.toLowerCase(s.charAt(i)));

            } else {
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
                stringBuilder1.append(Character.toUpperCase(s.charAt(i)));
            }
        }


    }


}

