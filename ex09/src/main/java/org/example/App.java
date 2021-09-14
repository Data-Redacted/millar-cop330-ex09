package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter length");
        int l = scan.nextInt();

        System.out.println("enter width");
        int w = scan.nextInt();

        float a = l * w;
        float g = a / 350;

        System.out.println(Math.ceil(g));
    }
}
