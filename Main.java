package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        StringBuilder sb = new StringBuilder("Welcome");
//        sb.append(" to Java");
//        sb.toString();
//        String result = sb.toString();
//        System.out.println(result);
//          StringBuilder b = new StringBuilder();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter value 1: ");
//        String input1 = scanner.nextLine();
//
//        System.out.println("Enter value 2: ");
//        String input2 = scanner.nextLine();
//
//        b.append(input1).append(" ").append(input2);
//
//        System.out.println(b.toString());
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        if (str3.equalsIgnoreCase(str4)) {
            System.out.println("They're same");
        } else {
            System.out.println("They're not same");
        }

    }
}
