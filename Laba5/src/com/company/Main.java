package com.company;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] myArr = new int[size];
        for(int i = 0;i<myArr.length;i++){
            myArr[i] = rnd.nextInt(-10,10);
            System.out.print(myArr[i]+" ");
        }
        System.out.println();
        sort(myArr);
    }

    static void sort(int[] myArr){
        for (int i = 1; i<myArr.length; i++){
            if ((myArr[i] % 2) == 0) {
                for(int j = i;(j>0);j--){
                    if ((myArr[j-1] < myArr[j]) && (myArr[j-1] % 2 == 0)){
                        break;
                    }
                    //смена мест в массиве
                    int tmp=myArr[j-1];
                    myArr[j-1]=myArr[j];
                    myArr[j]=tmp;
                }
            }
        }
        //вывод массива
        for (int i:myArr) {
            System.out.print(i + " ");
        }
    }
}