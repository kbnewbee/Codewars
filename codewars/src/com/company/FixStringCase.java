package com.company;

public class FixStringCase {

    public static void main(String[] args) {
        final String str = "KALLol";

//        int lower = 0, upper = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (Character.isLowerCase(c)) lower++;
//            else if (Character.isUpperCase(c)) upper++;
//
//        }
//        if (upper > lower) {
//            System.out.println(str.toUpperCase());
//        }else{
//            System.out.println(str.toLowerCase());
//        }

        boolean b = str.chars().filter(Character::isLowerCase).count() > str.chars().filter(Character::isUpperCase).count();
        System.out.println(str.chars().filter(Character::isLowerCase));


    }
}
