package com.company;

public class CPUtimer {


    private int IC;
    private Double InstPersec;

    public CPUtimer(int Ic, int cycPerInst, int cycPerSec){

        this.IC=Ic;

        this.InstPersec=(double)cycPerSec*1000000;

        InstPersec=InstPersec/cycPerInst;
    }

    public CPUtimer(int iC,int InstPerSec){

        this.IC=iC;
        this.InstPersec=(double)InstPerSec;
    }

    // returns the instruction count as stored in the object
    int getIC(){
        return IC;
    }
    // returns the instruction per second
    double getSPI(){
        double get=1/(InstPersec);
        return get;
    }

    // returns the seconds per program
    double getSec(){

        return IC*getSPI();
    }

}