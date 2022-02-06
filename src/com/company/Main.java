package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = a.toLowerCase(Locale.ROOT);
        b = b.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(b);

            StringBuilder sb=new StringBuilder(b);
            sb.reverse();
            String rev=sb.toString();
            if(b.equals(rev)){
                System.out.println("True, it is a palindrome");
            }else{
                System.out.println("False, it is not a palindrome");

        }
    }}

