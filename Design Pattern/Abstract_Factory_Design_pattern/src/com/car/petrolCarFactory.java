package com.car;

public class petrolCarFactory implements carFactory
{

    @Override
    public Car getCar(String carName,String ownerName) {
        if(carName=="i20")
            return new i20_petrol(ownerName);
        else if(carName.equalsIgnoreCase("creta"))
            return new creta_petrol(ownerName);
        else
            return null;
    }
}
