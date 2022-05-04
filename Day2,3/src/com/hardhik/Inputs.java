package com.hardhik;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        //For printing Integer

        System.out.println(System.in);
        System.out.println("Please enter input = ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is = " + rollno);

        //For printing String only one word

        String name = input.next();
        System.out.println(name);

        //For printing String whole line

//        String name = input.nextLine();
//        System.out.println(name);
    }
}
