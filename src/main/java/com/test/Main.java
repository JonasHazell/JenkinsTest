package com.test;

public class Main {

    public static void main(String[] args) {
        Adder adder = new Adder();
        if (args.length != 2) {
            System.err.println("Usage: java -jar <Number> <Number>");
        } else {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println(adder.add(a, b));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
