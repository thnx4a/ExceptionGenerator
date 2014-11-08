package com.suhorukov.titov.exceptiongenerator;

public class Main {

    public static void main(String[] args) {
        ExceptionGenerator eg = new ExceptionMethods();
        eg.generatorNullPointerException();
        eg.generatorClassCastException();
        eg.generatorNumberFormatException();
        eg.generatorStackOverflowError();
        eg.generatorOutOfMemoryError();
    }
}
