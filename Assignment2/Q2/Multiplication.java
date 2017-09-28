package com.company;

public class Multiplication {

    private int i,j;

    public Multiplication(int one,int two){

        this.i=one;
        this.j=two;
    }
    int total(int one,int two) {
        int a = 0;
        int product = one;
        if (two > one) {
            for (int i = 1; i < (two - one) + 1; i++) {

                a = one + i;
                product = product * a;
            }
        }
        else {
            for (int i = 1; i < (one - product) + 1; i++) {
                a = one - i;
                product = product * a;
            }
        }
        return product;

    }
}