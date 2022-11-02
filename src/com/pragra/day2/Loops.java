package com.pragra.day2;

public class Loops {
    public static void main(String[] args) {
        // Hello Hello HellO
        // Hello Hello Hello
        // Hello Hello Hello
        // Hello Hello Hello
        // Hello Hello Hello
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
