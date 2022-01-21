package com.switchcase_for;

public class While_loop {
    public static void main(String[] args) {

        //print even and odd numbers by using "while loop"

        System.out.println("print even numbers");
        int even =2;
        while (even<20) {
            System.out.println(even);
            even+=2;
        }
        System.out.println("print odd numbers");
        int odd =1;
        while (odd<20) {
            System.out.println(odd);
            odd+=2;
        }

        //print 9 table by using while loop
        System.out.println("print 9 table");
        int table=9,number =1;

        while (number<=10) {
            System.out.println(table+"*"+ number +"="+ number *table);
            number++;
        }



    }
    }


