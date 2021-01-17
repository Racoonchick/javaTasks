package com.company;
import java.util.Scanner;

public class Task1 {
    static void run() {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        System.out.println("Enter number");
        if(scanner.hasNextInt()){
            number=scanner.nextInt();
            if(number%2==0)
                System.out.println("the number is even");
            else
                System.out.println("the number is not even");
            if(primeNumb(number))
                System.out.println("the number is prime");
            else
                System.out.println("the number is composite");
        }
        else
            System.out.println("Wrong enter!");
    }

    static boolean primeNumb(int numb) {
        int count = 0;
        for (int i = 1; i < numb; i++) {
            if (numb % i == 0)
                count++;
        }
        if (count == 1)
            return true;
        else
            return false;
    }
}
