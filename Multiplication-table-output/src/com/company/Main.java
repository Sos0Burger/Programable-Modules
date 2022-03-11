package com.company;

import java.nio.file.ClosedWatchServiceException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int n = 0;
        double y =0;
        double x = input();
        while (Math.abs(x)<1) {
            x += ((nechet(n) *Math.pow(x, 2*n+1))/(chet(n)*(2*n+1)));
            y = Math.asin(x);
            System.out.println("n = " + n + " x = " + x + " y = " + y);
            n++;
        }

    }
    //Ввод X с проверкой
    public static double input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x");
        double x = scan.nextDouble();
        if (!(Math.abs(x)<1)){
            System.out.println("Не подходит");
            x = input();
        }
        return x;
    }
    //Метод для вычисления ряда четных чисел
    public static int chet(int n){
        int composition = 1;
        while (n != 0){
            composition *= 2*n;
            n -=1;
        }
        return composition;
    }
    //Метод для вычисления ряда нечетных чисел
    public static int nechet(int n){
        int composition = 1;
        while (n != 0){
            composition *= 2*n-1;
            n -=1;
        }
        return composition;
    }

}
