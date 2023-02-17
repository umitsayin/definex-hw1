package model;

import util.BuildType;
import util.CurrencyType;

public class SummerHouse extends Build{

    public SummerHouse(double squareMeter, int numberOfRooms, int numberOfHalls, double price, CurrencyType currencyType, BuildType buildType) {
        super(squareMeter, numberOfRooms, numberOfHalls, price, currencyType, buildType);
    }
}
