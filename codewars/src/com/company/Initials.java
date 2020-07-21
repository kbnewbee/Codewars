package com.company;

public class Initials {
    public static void main(String[] args) {
        String name = "Barack Hussain obama";

        String[] n = name.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n.length - 1; i++) {
            stringBuilder.append(Character.toUpperCase(n[i].charAt(0))).append('.');
        }

        stringBuilder.append(Character.toUpperCase(n[n.length - 1].charAt(0))).append(n[n.length - 1].toLowerCase().substring(1,n[n.length - 1].length()));
        System.out.println(stringBuilder.toString());
    }
}
