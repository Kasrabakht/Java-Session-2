package com.java.kasrabakht;

import java.util.Scanner;

public class TamrinClass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean find = false;
        int t = 0;
        System.out.print("Enter a number for n:");
        int n = reader.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number for arraye:");
            a[i] = reader.nextInt();
        }
        System.out.print("Enter your number for search:");
        int b = reader.nextInt();
        for (int i = 0; i < n; i++) {
            if (b == a[i]) {

                System.out.println("true");
                find = true;
                break;
            }
        }

        for (int i=0; i<a.length; i++)
        {
            if (b == a[i])
            {
                t++;
            }
        }
        if(find==true)
        {
            System.out.print("tekrar="+t);
        }
        else
        {
            System.out.println("false");
        }
    }
}
