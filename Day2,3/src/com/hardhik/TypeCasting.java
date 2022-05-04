package com.hardhik;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        //Type Conversion
//        float num = input.nextFloat();
//        System.out.println(num);
//
//        //Type Casting
//        int num = (int) (67.33);
//        System.out.println(num);

        //Automatic type promotion in expression
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

        //Ascii value of alphabet
        int number = 'A';
        System.out.println(number);

    }
}
