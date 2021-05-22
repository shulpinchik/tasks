package com.company;
import java.util.*;

public class balloons {

    public static void main (String[]args) {
        int [][] proverka1 = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(compute(proverka1));
        int [][] proverka2 = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(compute(proverka2));
        int [][] proverka3 = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(compute(proverka3));
        int [][] proverka4 = {{1,2}};
        System.out.println(compute(proverka4));
        int [][] proverka5 = {{2,3},{2,3}};
        System.out.println(compute(proverka5));
    }

    public static int compute(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int temp = 0;
        int second = Integer.MIN_VALUE;
        for (int [] pre_points: points) {
            if (pre_points[0] > second) {
                temp += 1;
                second = pre_points[1];
            }
        }
        return temp;
    }
}

