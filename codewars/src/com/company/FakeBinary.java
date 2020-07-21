package com.company;

import java.util.stream.Collectors;

public class FakeBinary {
    public static void main(String[] args) {

        final String str = "1292";

        StringBuilder stringBuilder = new StringBuilder();
        String[] num = str.split("");
        for (String n : num) {
            if (Integer.parseInt(n) < 5) stringBuilder.append('0');
            else stringBuilder.append('5');
        }


        System.out.println(stringBuilder.toString());

        System.out.println(str.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1"));

        System.out.println(str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(Collectors.joining()));


    }
}
