package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class maxNumber {

    private int[] array;

    public static void main(String[] args) {

        int[] array = new int[]{
                11, 78, 9, 5, 40
        };


        System.out.println("Задача про максимальное число:\n" + "Максимальное число = " + maxNum(array));
    }

    public static String maxNum(int[] nums) {

        String s = "";
        List<Integer> list = new ArrayList<>(nums.length);
        for (int x : nums) {
            list.add(x);
        }

        list.sort((a, b) -> measure(b) - measure(a));
        for (int x : list) {
            s += x;
        }

        return s;
    }

    public static int measure(int n) {

        if (n < 10) {
            return 100 * n + 10 * n + n;

        } else if (n < 100) {
            return 10 * n + n % 10;

        } else if (n < 1000) {
            return n;

        } else {
            return -1;
        }
    }
}
