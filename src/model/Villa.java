package model;

import util.CurrencyType;

public class Villa extends Build{

    public Villa(double squareMeter, int numberOfRooms, int numberOfHalls, double price, CurrencyType currencyType) {
        super(squareMeter, numberOfRooms, numberOfHalls, price, currencyType);
    }
}
