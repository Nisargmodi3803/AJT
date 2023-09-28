package com.car;

public class i20_petrol implements i20
{
    private String ownerName;
    public i20_petrol(String ownerName)
    {
        this.ownerName = ownerName;
        System.out.println("i20 petrol constructor called.");
    }
    @Override
    public void drive()
    {
        System.out.println("i20 petrol car is drive by "+ownerName+".");
    }

    @Override
    public void fuel()
    {
        System.out.println("Fill the petrol in i20 petrol car.");
    }
}
