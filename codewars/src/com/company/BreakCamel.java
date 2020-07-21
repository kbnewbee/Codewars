package com.company;

public class BreakCamel {
    public static void main(String[] args) {
        String input = "camelCasing";
//        Arrays.stream(input.split("")).map(c -> )

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(input.charAt(i));

        }

        System.out.println(stringBuilder);
        System.out.println(input.replaceAll("([A-Z])", " $1"));
    }
}
