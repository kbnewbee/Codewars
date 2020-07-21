package com.company.kyu7;

public class Split {
    public static void main(String[] args) {
        String str = "supercalifragilisticexpialidocious";
        int sz = 3;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        for (int i = 1; i < str.length() ; i++) {
            if (i % sz == 0) stringBuilder.append(' ');
            stringBuilder.append(str.charAt(i));
        }

        System.out.println(stringBuilder);


    }
}
