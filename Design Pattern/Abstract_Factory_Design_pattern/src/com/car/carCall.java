package com.car;

import java.util.ArrayList;
import java.util.List;

public class carCall
{
    public static Car typeCar(String carName,String fuel,String ownerName)
    {
        if(fuel=="petrol")
            return new petrolCarFactory().getCar(carName,ownerName);
        else if(fuel.equalsIgnoreCase("diesel"))
            return new dieselCarFactory().getCar(carName,ownerName);
        else
            return null;
    }
}
