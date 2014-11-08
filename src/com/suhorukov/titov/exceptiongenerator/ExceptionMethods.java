package com.suhorukov.titov.exceptiongenerator;

import java.lang.reflect.Array;
import java.util.Stack;

/**
 * Created by demo3 on 08.11.14.
 */
public class ExceptionMethods implements ExceptionGenerator {
    @Override
    public void generatorNullPointerException() {
        try {
            String[] itsNull = null;
            System.out.println(itsNull.length);

        } catch (NullPointerException e) {
            System.out.println("It's NullPointerException!");
        }
    }

    @Override
    public void generatorClassCastException() {
        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            System.out.println("It's ClassCastException!");
        }
    }

    @Override
    public void generatorNumberFormatException() {
        try {
            String myString = "Bla-Bla-Bla";
            System.out.println(Integer.parseInt(myString));
        } catch (NumberFormatException e) {
            System.out.println("It's NumberFormatException!");
        }
    }

    static void myMethod() {
        myMethod();
    }

    @Override
    public void generatorStackOverflowError() {
        try {
            myMethod();
        } catch (StackOverflowError e) {
            System.out.println("It's StackOverflowError!");
        }
    }

    @Override
    public void generatorOutOfMemoryError() {
        try {
//            Stack<Integer> myStack = new Stack<>();
//            while (true) {
//                myStack.push(1);
//            }
            for (int i = 2; true; i++) {
                i = i*2;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("It's OutOfMemoryError!");
        }
    }

    @Override
    public void generatorMyException(String message) throws MyException {
//        throw new Exception();
    }
}
