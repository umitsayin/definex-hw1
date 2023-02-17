package model;

import util.BuildType;
import util.CurrencyType;

public class Home extends Build{

    public Home(double squareMeter, int numberOfRooms, int numberOfHalls, double price, CurrencyType currencyType, BuildType buildType) {
        super(squareMeter, numberOfRooms, numberOfHalls, price, currencyType,buildType);
    }
}
