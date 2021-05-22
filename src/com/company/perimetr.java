package com.company;

import java.util.Scanner;

public class perimetr {


    public static int perimeter (int[] arr, int size) {
        int sum_max = 0, sum = 0;

        for (int i = 0; i < size; i++) {

            for (int k = 0; k < size; k++) {

                for (int m = 0; m < size; m++) {

                    if ((arr[i] + arr[k] > arr[m]) && (arr[i] + arr[m] > arr[k]) && (arr[k] + arr[m] > arr[i])
                            && (i != k) && (i != m) && (m != k)
                            && (Square(arr[i], arr[k], arr[m]))) {

                        sum = arr[i] + arr[m] + arr[k];

                    }
                    if (sum > sum_max) sum_max = sum;
                }
            }
        }
        return sum_max;
    }

    public static boolean Square (int a, int b, int c) {
        float p = (a + b + c) / 2;
        float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s != 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Задача про треугольник с максимальным периметром:\n"+"Укажите длину массива: ");

        int size = input.nextInt();
        int array[] = new int[size];

        if (size > 10000 || size < 3) {

            System.out.println("Количество вводимых элементов должно быть не меньше 3 и не больше 100");

        } else {

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
                if (array[i] < 0 || array[i] > Math.pow(10, 6)) {
                    System.out.println("Вводимые числа не должны быть меньше 0 или больше 10^6");
                    break;
                }
            }

            System.out.println("Максимально возможный периметр равен " + perimeter(array, size));
        }
    }
}