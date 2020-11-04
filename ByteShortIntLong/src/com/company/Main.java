package com.company;

public class Main {

    public static void main(String[] args) {
        // how to find min value range of primitive types

        // byte
        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("Min byte = " + minByteVal + ", Max byte = " + maxByteVal);

        // short
        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        System.out.println("Min short = " + minShortVal + ", Max short = " + maxShortVal);

        // int
        int minIntVal = Integer.MIN_VALUE;
        int maxIntVal = Integer.MAX_VALUE;
        System.out.println("Min int = " + minIntVal + ", Max int = " + maxIntVal);

        // long
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;
        System.out.println("Min long = " + minLongVal + ", Max long = " + maxLongVal);

        // casting down a bigger type to fit into a smaller type
        byte newByteVal = (byte) (minByteVal / 2);
        short newShortVal = (short) (minShortVal / 2);

    }
}
