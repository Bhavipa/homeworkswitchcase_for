package com.switchcase_for;

public class For_loop {
    public static void main(String[] args) {

        //print odd and even number by using "for loop"
        System.out.println("print even numbers");
        for (int even = 2; even <=20; even +=2) {
            System.out.println(even);
        }
        System.out.println("print odd numbers");
        for (int odd = 1; odd <=20; odd +=2) {
            System.out.println(odd);
        }


        //print 10 table by using "nested loop"
        System.out.println("print 10 table");

        for (int table = 10; table <=10; table++)
            for (int number = 1; number <=10; number++) {
                System.out.println(table + "*" + number + "="+ table * number);


            }
    }
}
