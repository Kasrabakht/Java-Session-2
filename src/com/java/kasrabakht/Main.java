package com.java.kasrabakht;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter first number:");
        int a =S.nextInt();
        System.out.print("Enter second number:");
        int b =S.nextInt();
        System.out.print("Enter plus or times or divided or minus:");
        String srt= reader.nextLine();
        switch(srt){
            case "plus":
                System.out.println("plus="+(a+b));
                break;
            case "times":
                System.out.println("times="+(a*b));
                break;
            case"divided":
                System.out.println("divided="+(double)a/b);
            case"minus":
                System.out.println("minus="+(a-b));
                break;
        }

    }
}

