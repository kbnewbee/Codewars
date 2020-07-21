package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Consonant {
    public static void main(String[] args) {
        String str = "strength";

        String[] s = str.split("[aeiou]");


        List<String> ss = Arrays.stream(s).collect(Collectors.toList());
        int msum =0;
        for (String w : ss) {
            int sum =0;
            for (int i = 0; i < w.length(); i++) {
                sum += (int)w.charAt(i) - 'a' +1;

            }
            System.out.println(sum);
            msum = Math.max(sum,msum);
        }

        System.out.println(msum);

        System.out.println((int) 'b' - 'a');
//        System.out.println(s.toString());
    }
}
