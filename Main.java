package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(2, 10);
        int[] Array = new int[size];

        for(int i = 0; i< Array.length; i++){
            Array[i] = rand.nextInt(20);
            System.out.println(" " + Array[i]);
        }
        System.out.println("++++++++++++");

        int min = Array[0];
        double SredArif = 0;

        for (int k : Array) {
            if (k < min) {
                min = k;
            }
        }
        System.out.println("Минимальное значение " + min);

        if(Array.length > 0){
            double sum1 = 0;
            for (int j : Array) {
                sum1 += j;
            }
            SredArif = sum1 / Array.length;
        }
        double sum2 = SredArif + min;
        System.out.println("Среднее арифметическое " + SredArif);
        System.out.println("Сумма минимального значения и среднего арифметического равно " + sum2);
    }
}





