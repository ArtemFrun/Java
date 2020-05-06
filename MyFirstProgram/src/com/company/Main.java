package com.company;

public class Main {

    public static void main(String[] args) {

        //--- INTEGRAL   ----------------------

        double y = Math.sin(Math.PI);
        System.out.println(y);

        y = -(Math.cos(Math.PI)-Math.cos(0));
        System.out.println(y);

        //-----------------------------------------------


        //--- PALINDROME   ----------------------

        String str = "Аргентина манит негра";

        String str2 = str.toLowerCase();

        System.out.println(str2);

        String str3 = str2.replaceAll(" ", "");

        System.out.println(str3);

        String str4 = "";

        for (int i = str3.length()-1; i >= 0; i--)
        {
            str4 += str3.charAt(i);
        }

        System.out.println(str4);

        if (str3.equals(str4)) System.out.println("Палендром");

    }
}
