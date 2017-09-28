package com.company;

public class Summation {


    private int i , j;

    public Summation(int one,int two){

        this.i=one;
        this.j=two;
    }
    int total(int one,int two) {

        int z = 0;
        int sum = one;
        if (two > one) {
            for (int i = 1; i < (two - one) + 1; i++) {

                z = one + i;
                sum = sum + z;
            }
        } else {
            for (int i = 1; i < (one - two) + 1; i++) {
                z = one - i;
                sum = sum + z;
            }
        }
        return sum;

    }}