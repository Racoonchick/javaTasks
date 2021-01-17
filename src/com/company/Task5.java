package com.company;
import java.util.*;

public class Task5 {
    static void run(){
        Scanner scanner = new Scanner(System.in);
        int total=0;
        System.out.println("Enter number please");
        int N=scanner.nextInt();
        while(N>100){
            System.out.println("Enter number <100 !");
            N=scanner.nextInt();
        }
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
            if(check(arr[i]))
                total++;
        }
        System.out.println(total);
    }
    static boolean check(int number){
        int palind=number,reverse=0;
        while(palind!=0){
            int remainder=palind%10;
            reverse=reverse*10+remainder;
            palind=palind/10;
        }
        if(number==reverse)
            return true;
        else return false;
    }
}
