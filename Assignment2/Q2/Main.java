package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner Sid = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int one = Sid.nextInt();

        System.out.println("Enter the second integer:");
        int two = Sid.nextInt();

        Multiplication object = new Multiplication(one, two);
        int product = object.total(one, two);

        System.out.println("The final product is " + product);

    }
}