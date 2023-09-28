package com.car;

public class dieselCarFactory implements carFactory
{

    @Override
    public Car getCar(String carName, String ownerName) {
        if(carName=="i20")
            return new i20_diesel(ownerName);
        else if(carName.equalsIgnoreCase("creta"))
            return new creta_diesel(ownerName);
        else
            return null;
    }
}
