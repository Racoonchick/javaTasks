package com.company;
import java.util.*;

public class Task3 {
    static void run(){
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        System.out.println(countWords(text));
        System.out.println(sort(text));
        System.out.println(capitalLetter(text));
    }
    static int countWords(String text){
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ')
                count++;
        }
        return count+1;
    }
    static String sort(String text) {
        String sorted="";
        String[] words=text.split(" ");
        Arrays.sort(words);
        for(int i=0;i<words.length;i++){
            sorted+=words[i]+" ";
        }
        return sorted;
    }
    static String capitalLetter(String text){
        StringBuilder builder = new StringBuilder(text);
        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));

        return builder.toString();

    }
}
