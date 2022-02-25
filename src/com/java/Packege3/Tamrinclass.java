package com.java.Packege3;

import java.util.Scanner;

public class Tamrinclass {
    public static void Writer()
    {
        Scanner writer=new Scanner(System.in);
        Books book=new Books();
        System.out.print("Enter the name of writer (sadi,hafez,jami):");
        book.writer= writer.nextLine();
        switch (book.writer)
        {
            case"hafez":
                System.out.print("divan hafez has been barrowed");
                break;
            case "sadi":
                System.out.print("there isn't any bostan");
                break;
            case "jami":
                System.out.print("haft orang it's on third raw 21-a");
                break;

        }
    }
public static void Book()
{  Scanner book=new Scanner(System.in);
    Books a=new Books();
    System.out.print("Enter the names of the books (divan hafez,bostan,haft orang):");
    a.name= book.nextLine();
    switch (a.name)
    {
        case"divan hafez":
            System.out.print("divan hafez has been barrowed");
            break;
        case "bostan":
            System.out.print("there isn't any bostan");
            break;
        case "haft orang":
            System.out.print("haft orang it's on third raw 21-a");
            break;

    }


}
public static void Number()
{
    Scanner num=new Scanner(System.in);
    Books b=new Books();
    System.out.print("Enter the number of book (1,2,3):");
    b.number= num.nextInt();
    switch (b.number)
    {
        case 1:
            System.out.print("divan hafez has been barrowed");
            break;
        case 2:
            System.out.print("there isn't any bostan");
            break;
        case 3:
            System.out.print("haft orang it's on third raw 21-a");
            break;

    }
}

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Chose the name of the book or writer or number:");
        String a = reader.nextLine();
        if (a.equals("writer")) {
            Writer();
        } else if (a.equals("book"))
        {
           Book();
        }
        else if (a.equals("number"))
        {
           Number();
        }
    }

}
