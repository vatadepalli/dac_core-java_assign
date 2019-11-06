package com.adikaplabs.core;

public class Converter {
    public static double ptokg(double p) {
        return p * 0.4536;
    }

    public static double ctof(double c) {
        return (c * 9 / 5 + 32);
    }

    public static String stohms(int s_) {
        int h = s_ / 3600;
        int m = (s_ % 3600) / 60;
        int s = (s_ % 3600) % 60;

        return (h + " h : " + m + " m : " + s + " s");
    }
}