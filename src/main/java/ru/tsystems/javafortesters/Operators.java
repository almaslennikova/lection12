package ru.tsystems.javafortesters;

public class Operators {

    public void test() {
        boolean equal = 1 == 2;
        boolean notEqual = 1 != 2;//number, characters, boolean, object reference
        System.out.println("1 == 2 is " + equal);
        System.out.println("1 != 2 is " + notEqual);

        double price = 999.00;
        int price2 = 999;
        System.out.println("price are equal " + (price == price2));

        //be careful - result of assignment expression is the variable following the assignment
        boolean checkMe = false;
        if (checkMe=false) {
            System.out.println("I want to be here...");
        } else {
            System.out.println("Ooops! But I am here...");
        }

        int x = 3, y = 4;
        /*x = x + 1; //all operations executes increment by 1
        x += 1;
        x++;
        ++x;
        System.out.println(x);*/
        if ((x++ > y) || (x < ++y)) {
            System.out.println("x = " + x + " y = " + y);
        }

        byte b1 = 7;//111
        byte b2 = 9;//1001
        byte byteRes= 7 | 9;//1111
        System.out.println("res of byte OR " + byteRes);

        int x2 = 4, y2 = 5;
        if ((x2 < y2) | (++x2 < y2)) {
            System.out.println("x = " + x2 + " y = " + y2);
        }

        int res1 = 2;
        res1 *= 2 + 3;
        System.out.println("res1 = " + res1);
    }

}
