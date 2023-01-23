package com.sparta.ec.primitive_types;

public class PrimitiveAppMain {
    public static void main(String[] args) {

        int x;

        int anInt = 3; // explicitly typed
        var vInt = 6; // implicitly typed


        // floating point values

        float num = 111.222f;

        // binary number

        int b = 0b101;
        int h = 0xff;

        float sum = 0;
        for (int i = 0; i < 100_000; i++)
        { sum += 2 / 5.0f; }
        System.out.println("2/5 added 100,000 times: " + sum);
        System.out.println("2/5 multiplied by 100,000: " + 2 / 5.0f * 100_000);


        double sum2 = 0;
        for (int i = 0; i < 100_000; i++)
        { sum += 2 / 5.0; }
        System.out.println("2/5 added 100,000 times: " + sum);
        System.out.println("2/5 multiplied by 100,000: " + 2 / 5.0 * 100_000);

        final int z= 3;
        // z = 6;

    }
}
