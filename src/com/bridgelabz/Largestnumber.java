package com.bridgelabz;

public class Largestnumber {
    public static void main(String[] args) {
        double [] mylist = {1.5,1.6,1.7};
        for (int i = 0; i< mylist.length; i++){
            System.out.println(" " + mylist[i]);
        }
        double sum = 0;
        for (int i = 0; i< mylist.length; i++){
            sum += mylist[i];
            System.out.println("mylist = " + mylist[i]);
        }
        double max =mylist[0];
        for (int i = 0; i< mylist.length; i++){
            if(max< mylist[i]) max= mylist[i];
        }
        System.out.println(" = " +max);
    }
}
