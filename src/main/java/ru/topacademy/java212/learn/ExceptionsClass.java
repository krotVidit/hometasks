package ru.topacademy.java212.learn;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class ExceptionsClass {
    public int runToSeeExceptions(int n) {
        int visitedBlocksCounter = 0;
        try {
            //System.out.println("before Ex is thrown");
            visitedBlocksCounter ++;
            outerMethod(n);
            try {
                visitedBlocksCounter ++;
                outerMethod(n+1);
            }
            finally {
                visitedBlocksCounter ++;
            }
        } catch (MalformedURLException e) {
            visitedBlocksCounter++;
        }
        return visitedBlocksCounter;
    }

    public int outerMethod(int number) throws MalformedURLException {
        try {
            Exception exception = method(number);
            return exception.hashCode();
        } catch (FileNotFoundException e) {
            System.out.println("in outerMethod, FileNotFound ex");
            throw new MalformedURLException();
        }
    }

    public Exception method(int number ) throws FileNotFoundException, IllegalArgumentException{
        if(number % 3 == 0 || number % 5 == 0  ) {
            throw new FileNotFoundException();
        }
        return new Exception();
    }
}
