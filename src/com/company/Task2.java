package com.company;
import java.util.Scanner;
public class Task2 {
    static void run(){
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 0;
        number1=input();
        number2=input();
        System.out.println("NOD - "+NOD(number1,number2)+"\nNOK - "+NOK(number1,number2));
    }

    static int input() {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            return scan.nextInt();
        }
        else
            System.out.println("wrong enter!");
        return 0;
    }
    static int NOD(int a,int b){
        int min;
        if(a<b)
            min=a;
        else
            min=b;
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0)
                return i;
        }
        return 0;
    }
    static int NOK(int a,int b){
        int max;
        if(a>b)
            max=a;
        else
            max=b;
        for(int i=max;max>0;i++) {
            if (i % a == 0 && i % b == 0)
                return i;
        }
        return 0;
    }
}
