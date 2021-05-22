package com.company;

import java.util.Scanner;

public class stroki {
        public static void main(String[] args) {
            System.out.println("3 задачи про строки:\n"+"Задача первая:");
            Ex_1.ex1();
            System.out.println("Задача вторая:");
            Ex_2.ex2();
            System.out.println("Задача третья:");
            Ex_3.ex3();
        }
}

class Ex_1 {
    public static void ex1() {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = s.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = s.nextLine();

        if (string1.length() != string2.length())
            System.out.println("Строки разной длины");

        else {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < string1.length(); i++) {
                count1 += Method (string1.charAt(i));
                count2 += Method (string2.charAt(i));
            }
            System.out.println(count2 >= count1);
        }
    }
    public static int Method (char a){//метод сопоставляющий букву из слова и ее ценность
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i=0; i < 28;i++){
            if (a == arr[i]){
                return i;
            }
        }
        return 0;
    }
}
class Ex_2 {
    public static void ex2() {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string1 = s.nextLine();
        String sub_max = "";
        for (int k=0;k<string1.length();k++) {
            String sub = "";//текущая подстрока
            for (int i = k; i < string1.length(); i++) {
                sub += string1.charAt(i);
                if ((sub.equals(Palindrom(sub))) == true) {
                    if (sub.length() > sub_max.length())
                        sub_max = sub;
                }
            }
        }
        System.out.println(sub_max);

        //основная работа

    }
    public static String Palindrom (String s){
        String sub = "";
        for(int i=(s.length()-1);i>=0;i--){
            sub+=s.charAt(i);
        }
        return sub;
    }

}
class Ex_3 {
    public static void ex3(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string1 = s.nextLine();
        int count = 0;
        for (int i=0; i<string1.length();i++){
            String sub = "";
            for(int j=i; j<string1.length();j++){
                sub+=string1.charAt(j);
                if (string1.indexOf(sub,j) == i+sub.length()){
                    count++;
                    if (string1.indexOf(sub,j + sub.length()) >= 0){
                        count --;
                    }


                }
            }
        }
        System.out.println(count);
    }
}


