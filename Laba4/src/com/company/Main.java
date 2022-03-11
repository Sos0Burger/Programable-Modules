package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов массива");
        int Size = in.nextInt();
        int[] myArr = new int[Size];

        //вывод массива
        for (int i = 0; i < myArr.length;i++){
                myArr[i] = rnd.nextInt(-10,10);
                System.out.print(myArr[i] + " ");
            }
        System.out.println();

        int min = MinElem(myArr);
        double average = Average(myArr);
        double sum = min + average;
        System.out.println("Минимальный элемент = " + min +  " среднее арифметическое = "+average + " сумма = " + sum);
    }



    //вычисление минимального элемента
    static int MinElem(int[] myArr){
        int min = myArr[0];
        for(int i = 0; i< myArr.length;i++){
            if (myArr[i]< min){
                min = myArr[i];
            }
        }
        return min;
    }
    //вычисление среднего арифметического
    static double Average(int[] myArr){
        int average = 0;
        for(int i = 0; i< myArr.length;i++){
            average += myArr[i];
            }
        average = average/myArr.length;
        return average;
    }
}
