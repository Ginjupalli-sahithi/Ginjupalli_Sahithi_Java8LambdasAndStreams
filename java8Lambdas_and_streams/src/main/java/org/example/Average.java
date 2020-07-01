package org.example;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average{
    public static void main(String args[])
    {
        IntStream stream=IntStream.of(10,20,30,40,90,60);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println("Stream average is : "+obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}
