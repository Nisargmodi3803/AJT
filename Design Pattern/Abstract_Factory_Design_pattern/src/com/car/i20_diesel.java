package com.car;

public class i20_diesel implements i20
{
    private String ownerName;

    public i20_diesel(String ownerName)
    {
        this.ownerName = ownerName;
        System.out.println("i20_diesel Constructor called.");
    }


    @Override
    public void drive() {
        System.out.println("i20 diesel car is drive by "+ownerName+".");
    }

    @Override
    public void fuel() {
        System.out.println("Fill the diesel in i20 diesel car.");
    }
}
