package com.dmdev.practice.generics;

public class PairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> test = new Pair<>("test", 1);
        System.out.println(test);

        Pair<Integer, String> test2 = PairUtil.swap(test);
        System.out.println(test2);
    }
}
