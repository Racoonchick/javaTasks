package com.company;
import java.util.*;
public class Task4 {
    static void run(){
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        String word=scanner.nextLine();
        int sub=search(text,word);
        System.out.println(sub);
    }
    static int search(String text,String word){
        int count=0;
        String[] words=text.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase(word))
                count++;
        }
        return count;
    }
}
