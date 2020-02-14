package main;

import definition.IOBbank;

public class Main {
    public static void main(String[] args) {
        IOBbank obj = new IOBbank();
        System.out.println(obj.getFixedDepositInterest());
        System.out.println(obj.getRateOfInterest());
    }
}
