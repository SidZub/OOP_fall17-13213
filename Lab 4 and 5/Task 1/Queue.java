package com.company;

public class Queue {

    char y[];

    int getloc, putloc;

    public Queue(int size) {

        y=new char[size];
        putloc = -1;
    }

    public char get(){

        if(putloc == -1){
            System.out.println("Your array is empty.");
            return 0;
        }

        return y[putloc];
    }

    public void put(char c) {

        if(putloc == 9) {
            System.out.println("You've reached the maximum capacity.");

            return;
        }

        y[putloc=putloc+1]=c;
    }
}
