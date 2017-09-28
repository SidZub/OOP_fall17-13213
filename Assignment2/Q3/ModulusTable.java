package com.company;

public class ModulusTable {
    private int modulus, tablesize;

    public ModulusTable(int modulus,int tablesize) {

        this.modulus = modulus;

        this.tablesize = tablesize;
    }

    public String toString(int l,int number,int m){

        return " " + ((l*m) % number);
    }
}
