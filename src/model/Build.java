package model;

import util.BuildType;
import util.CurrencyType;

public abstract class Build {
    private final double squareMeter;
    private final int numberOfRooms;
    private final int numberOfHalls;
    private final double price;
    private final CurrencyType currencyType;
    private final BuildType buildType;

    public Build(double squareMeter, int numberOfRooms, int numberOfHalls, double price, CurrencyType currencyType, BuildType buildType) {
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
        this.price = price;
        this.currencyType = currencyType;
        this.buildType = buildType;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public double getPrice() {
        return price;
    }

    public CurrencyType getCurrencyType(){
        return currencyType;
    }

    @Override
    public String toString() {
        return "Build{" +
                "squareMeter=" + squareMeter +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfHalls=" + numberOfHalls +
                ", price=" + price +
                ", currencyType=" + currencyType +
                ", buildType=" + buildType +
                '}';
    }
}
