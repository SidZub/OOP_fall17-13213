package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        for (; ; ) {

            Scanner Sid = new Scanner(System.in);

            CPUtimer object;
            System.out.println("Please select one of the following given options: One, Three, Five (Type the first letter in lowercase of the option you have chosen.)");
            char ch = Sid.next().charAt(0);
            if (ch == 'o') {
                System.out.println("Please enter the instruction count:");
                int a = Sid.nextInt();

                System.out.println("Please enter the cycles per instruction:");
                int b = Sid.nextInt();

                System.out.println("Please enter the speed of the clock in MHz:");
                int c = Sid.nextInt();

                object = new CPUtimer(a, b, c);
                System.out.println("The seconds per program are: " + object.getSec());


            } else if (ch == 't') {
                System.out.println("Please enter the instruction count:");
                int a = Sid.nextInt();

                System.out.println("Please enter the seconds per instruction:");
                int b = Sid.nextInt();

                object = new CPUtimer(a, b);
                System.out.println("The seconds per program are: " + object.getSec());


            } else if (ch == 'f') {
                System.exit(0);

            }
            System.out.println("Do you want to rerun the program? Yes or No? (Type the first letter in lowercase of the option you have chosen.)");
            char in = Sid.next().charAt(0);
            if (in == 'n') {
                System.exit(0);
            }


        }

    }
}