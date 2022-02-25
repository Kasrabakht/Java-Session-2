package com.java.kasrabakht;

import java.util.Scanner;

public class Tamrin2 {
    public static void main(String[] args) {
        Scanner arr= new Scanner(System.in);
        System.out.print("Enter n:");
        int  n=arr.nextInt();
        int a[]= new int[n];
        for (int i=0;i<a.length;i++)
        {
            System.out.print("enter number for array:");
            a[i]= arr.nextInt();
        }
        int max=a[0];
        for (int i=0;i<a.length;i++) {
            if(a[i]>max)
            {
                max=a[i];
            }

        }
        System.out.println("Max is:"+max);
    }
}
