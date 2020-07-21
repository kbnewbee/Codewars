package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestVowel {
    public static void main(String[] args) {
        final String s = "codewarraars";
        int cnt = 0;
        int maxc=1;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a'|| c == 'u'|| c == 'o'|| c == 'i'|| c == 'e') {
                flag = true;
                cnt++;
            } else {
                flag = true;
                cnt = 0;
            }
            maxc = Integer.max(maxc,cnt);

        }

        System.out.println(maxc);

        System.out.println(Arrays.stream(s.split("[^aeiou]")).collect(Collectors.toList()));
        System.out.println(Arrays.stream(s.split("[^aeiou]")).mapToInt(i -> i.length()).max());
        System.out.println(Arrays.stream(s.split("[^aeiou]")).mapToInt(i -> i.length()).count());

    }
}
