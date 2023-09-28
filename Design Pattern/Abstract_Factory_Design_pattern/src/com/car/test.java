package com.car;

import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String ownerName = sc.next();

        System.out.print("Enter Car Name : ");
        String carName = sc.next();

        System.out.print("Enter fuel type : ");
        String fuelType = sc.next();

        System.out.println();

        Car car = carCall.typeCar(ownerName,fuelType,ownerName);
        if(car==null)
            System.out.println("NULL");
        else
        {
            car.drive();
            car.fuel();
        }

    }
}
