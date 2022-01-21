package com.switchcase_for;

public class Do_While_Loop {
    public static void main(String[] args) {
        //print even odd numbers by using "do while"
        System.out.println("print even numbers");
        int even = 2;
        do {
            System.out.println(even);
            even += 2;
        } while (even<=20);
        System.out.println("print odd numbers");
        int odd = 1;
        do {
            System.out.println(odd);
            odd += 2;
        } while (odd<=20);

        //print 8 table by using "do while"
        System.out.println("print 8 table");
        int table = 8, number = 1;
        do {
            System.out.println(table+"*"+ number +"="+ number *table);
            number++;
        } while(number<=10);
    }
}