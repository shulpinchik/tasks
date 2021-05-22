package com.company;
import java.util.*;
public class coins {

    public static void main(String[] args){
        int x1[] = {2,4,1,2,7,8};
        System.out.println(compute(x1));

        int x2[] = {2,4,5};
        System.out.println(compute(x2));

        int x3[] = {9,8,7,6,5,1,2,3,4};
        System.out.println(compute(x3));
    }
    public static int compute(int[] piles) {
        int i = 0;
        int otv = 0;
        Arrays.sort(piles);
        int len = piles.length / 3;
        int temp = piles.length - 2;
        while(i < len)
        {
            otv+=piles[temp];
            temp-=2;
            i += 1;
        }
        return otv;
    }

}




