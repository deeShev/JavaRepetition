package com.shevelev.java.core;

public class DataType {
    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;

    private float aFloat;
    private double aDouble;

    private char aChar;

    private boolean aBoolean;

    public static void main(String[] args) {
        DataType dataType = new DataType();
        dataType.localVariable();
    }

    private void localVariable(){
        int i = 0; //local variable
        System.out.println(i);
    }
}
