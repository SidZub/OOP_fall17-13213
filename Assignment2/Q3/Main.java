package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner Sid = new Scanner(System.in);

        System.out.println("Enter a number for the table:");

                int in = Sid.nextInt();

                ModulusTable object = new ModulusTable(in,12);

                System.out.println(" 1" + " 2" + " 3"+ " 4" + " 5" + " 6" + " 7" + " 8" + " 9" + " 10" + " 11" + " 12");

                for(int l=1;l<13;l++){
                System.out.print(l + " ");

                for(int m=1;m<13;m++){
                System.out.print(object.toString(l,in,m) + " ");
        }

                System.out.println();
        }
    }
}

