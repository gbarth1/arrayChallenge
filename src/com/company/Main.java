package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int grades[]= new int[100];
        Scanner input = new Scanner(System.in);
        int sum=0;
        int count=0;
        int grade2;

        while(true)
        {
            System.out.println("Insert your grade or -1:");
            int grade2=input.nextInt();
            if(grade2 == -1);
                break;
            grades[count]=grade2;
        }

        for(int v=0;v< count;v++)
            sum=sum+grade2[v];
        int average = sum/count;
        System.out.println(average);
    }
}
