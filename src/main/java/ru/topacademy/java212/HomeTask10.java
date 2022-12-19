package ru.topacademy.java212;

public class HomeTask10 {


    public  StringBuilder ex1(int stringLength) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i <= stringLength; i++) {
            str.append(i);
        }
        return str;
    }


    public double ex2(String str) {
        String REGEX_WORDS = "[\\d\\p{Punct}\\s]+";
        String[] str1 = str.split(REGEX_WORDS);
        String without_a_space = str.replaceAll("\\s+", "");
        double average = without_a_space.length() / str1.length;

        return average;
    }


    public int ex3(String str) {
        String[] str1 = str.split("[:\\s]+");
        int evenWords = 0;
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].length() % 2 == 0) {
                evenWords++;
            }
        }
        return evenWords;
    }
}
