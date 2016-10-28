package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
            int grades[]= new int[100];
            String name[]= new String [100];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
            String n = input.nextLine();
        System.out.println("Enter your grade");
            int g = input.nextInt();

        System.out.println(n + " " + g);
    }
}
