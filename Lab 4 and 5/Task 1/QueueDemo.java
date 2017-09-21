package com.company;

import java.util.Scanner;

public class QueueDemo {

    Queue n;

    Scanner input = new Scanner(System.in);

    public static void main(String args[]) {

        QueueDemo demo = new QueueDemo();

        demo.doWork();
    }


    public void doWork() {
        n = new Queue(10);
        System.out.println("Enter a character to add to the array:");

        String u = input.next();


        if(u.length() > 1) {
            System.out.println("The value you enetered is not a character!");

            System.exit(0);
        } else {
            qu.put(u.charAt(0));
        }

    }

}