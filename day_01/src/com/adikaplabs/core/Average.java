package com.adikaplabs.core;

public class Average {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Please enter 2 or more numbers");
            return;
        }

        Double sum = 0d;
        for(String e:args)
            sum += Double.parseDouble(e);

        Double avg = sum / args.length;
        System.out.println("Average: " + avg);
    }
}
