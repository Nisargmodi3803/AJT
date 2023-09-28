package com.car;

public class creta_petrol implements i20
{
    private String ownerName;
    public creta_petrol(String ownerName)
    {
        this.ownerName = ownerName;
        System.out.println("creta_petrol constructor called.");
    }
    @Override
    public void drive()
    {
        System.out.println("creta petrol car is drive by "+ownerName+".");
    }

    @Override
    public void fuel()
    {
        System.out.println("Fill the petrol in creta petrol car.");
    }
}
