package com.example;

public class MyClass
{
    public static void main (String[] args)
    {
        int meters=28;
        int kilometers=168;
        int centimeters=47;
        int kph=27;
        int liters=92;
        int kilograms=200;

        System.out.println("There are " + (meters*3.28084) + " feet in 28 meters");
        System.out.println("There are " + (kilometers*.621371) + " miles in 168 kilometers");
        System.out.println("There are " + (centimeters*.393701) + " inches in 47 centimeters");
        System.out.println((kph*.911344) + " feet per second is equal to 27 kilometers per hour");
        System.out.println("There are " + (liters*.264172) + " gallons in 92 liters");
        System.out.println((kilograms*2.20462) +" pounds is equal to 200 kilograms");
    }
}
