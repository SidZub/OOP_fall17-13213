package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner Sid=new Scanner(System.in);

        System.out.println("Enter the 1st integer:");
        int one=Sid.nextInt();


        System.out.println("Enter the 2nd integer:");
        int two=Sid.nextInt();


        Summation object=new Summation(one,two);

        int sum = object.total(one,two);
        System.out.println("The total sum is "+ sum);
    }}
