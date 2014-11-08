package com.suhorukov.titov.exceptiongenerator;

/**
 * Created by demo3 on 08.11.14.
 */
public interface ExceptionGenerator {
    void generatorNullPointerException();
    void generatorClassCastException();
    void generatorNumberFormatException();
    void generatorStackOverflowError();
    void generatorOutOfMemoryError();
    void generatorMyException(String message) throws MyException;
}
