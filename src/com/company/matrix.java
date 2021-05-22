package com.company;

import java.util.ArrayList;
import java.util.Random;

public class matrix {



    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int op = 0;
        int[][] matrx = new int[n][m];
        Random rand = new Random();
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                matrx[j][i] = rand.nextInt(90) + 10;
            }
        }
        System.out.println("Исходная матрица");
        print(matrx);
        sort(matrx);
        System.out.println("Отсортированная матрица");
        print(matrx);
    }

    static void sort(int[][] mat) {
        int m = 5;
        int n = 10;
        for(int temp = 0; temp < m + n - 1; ++temp) {
            int start_x = temp < n ? 0 : temp - n;
            int start_y = temp < n ? n - temp - 1 : 0;
            ArrayList<Integer> list = new ArrayList();

            int offset;
            int x;
            int y;
            for(offset = 0; offset >= 0; ++offset) {
                x = start_x + offset;
                y = start_y + offset;
                if (x >= m || y >= n) {
                    break;
                }

                list.add(mat[x][y]);
            }

            list.sort((a, b) -> {
                return a.compareTo(b);
            });

            for(offset = 0; offset >= 0; ++offset) {
                x = start_x + offset;
                y = start_y + offset;
                if (x >= m || y >= n) {
                    break;
                }

                mat[x][y] = (Integer)list.remove(0);
            }
        }

    }

    static void print(int[][] mat) {
        for (int[] x1: mat
        ) {
            for (int x2: x1
            ) {
                System.out.print(x2+" ");
            }
            System.out.println();
        }
    }


}
