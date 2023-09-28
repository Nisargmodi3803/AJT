package com.car;

public class creta_diesel implements i20
{
    private String ownerName;

    public creta_diesel(String ownerName)
    {
        this.ownerName = ownerName;
        System.out.println("creta_diesel Constructor called.");
    }


    @Override
    public void drive() {
        System.out.println("creta diesel car is drive by "+ownerName+".");
    }

    @Override
    public void fuel() {
        System.out.println("Fill the diesel in creta diesel car.");
    }
}
