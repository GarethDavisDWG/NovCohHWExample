package com.tsi.training.davis.gareth.helloworld;


public class HelloWorld
{
    private static int age = 7;
    private static float day = 7.0f;
    private static char letter = 'G';
    private static char letter2 = (char)(letter + 16);
    private static int myNumber = letter * 2;

    public static void main(String[] args)
    {
        String world = "Hello World ";
        System.out.println(world + myNumber+letter2);
        System.out.println("Welcome Jillul");

    }

}
