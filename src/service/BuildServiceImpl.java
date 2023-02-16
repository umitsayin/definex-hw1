package service;

import constant.CurrencyConstant;
import model.Build;
import model.Home;
import model.Summery;
import model.Villa;

import java.util.List;
import java.util.stream.Collectors;

public class BuildServiceImpl implements BuildService{

    @Override
    public double getTotalPriceOfHomesInTL(List<Build> buildList) {
        List<Build> homeList = filterBuildsByBuildType(buildList, Home.class);

        return calculateBuildsPrice(homeList);
    }

    @Override
    public double getTotalPriceOfVillasInTL(List<Build> buildList) {
        List<Build> villaList = filterBuildsByBuildType(buildList, Villa.class);

        return calculateBuildsPrice(villaList);
    }

    @Override
    public double getTotalPriceOfSummeriesInTL(List<Build> buildList) {
        List<Build> summeryList = filterBuildsByBuildType(buildList,Summery.class);

        return calculateBuildsPrice(summeryList);
    }

    @Override
    public double getTotalPriceOfBuildsInTL(List<Build> buildList) {
        return calculateBuildsPrice(buildList);
    }

    @Override
    public double getAverageSquareMeterOfHomes(List<Build> buildList) {
        List<Build> homeList = filterBuildsByBuildType(buildList, Home.class);

        return calculateBuildsAverageSquareMeter(homeList);
    }

    @Override
    public double getAverageSquareMeterOfVillas(List<Build> buildList) {
        List<Build> villaList = filterBuildsByBuildType(buildList, Villa.class);

        return calculateBuildsAverageSquareMeter(villaList);
    }

    @Override
    public double getAverageSquareMeterOfSummeries(List<Build> buildList) {
        List<Build> summeryList = filterBuildsByBuildType(buildList, Villa.class);

        return calculateBuildsAverageSquareMeter(summeryList);
    }

    @Override
    public double getAverageSquareMeterOfBuilds(List<Build> buildList) {
        return calculateBuildsAverageSquareMeter(buildList);
    }

    @Override
    public List<Build> filterBuildsByRoomCountAndHallCount(List<Build> buildList, int roomCount, int hallCount) {
        return buildList.stream()
                .filter(item -> item.getNumberOfRooms() == roomCount && item.getNumberOfHalls() == hallCount)
                .collect(Collectors.toList());
    }

    private double calculateBuildsPrice(List<Build> buildList){
        double totalPriceOfBuildsSoldInUSD = calculateBuildsPriceByCurrencyType(buildList, CurrencyConstant.USD_CURRENCY);
        double totalPriceOfBuildsSoldInEURO = calculateBuildsPriceByCurrencyType(buildList, CurrencyConstant.EURO_CURRENCY);
        double totalPriceOfBuildsSoldInTL = calculateBuildsPriceByCurrencyType(buildList, CurrencyConstant.TL_CURRENCY);

        return totalPriceOfBuildsSoldInTL
                + (totalPriceOfBuildsSoldInUSD  * CurrencyConstant.UNIT_USD_FOR_TL)
                + (totalPriceOfBuildsSoldInEURO * CurrencyConstant.UNIT_EURO_FOR_TL);
    }

    private double calculateBuildsPriceByCurrencyType(List<Build> buildList, String currencyType){
        return buildList.stream()
                .filter(item -> item.getCurrencyType().getValue().equals(currencyType))
                .map(Build::getPrice)
                .reduce(0d,Double::sum);
    }

    private double calculateBuildsAverageSquareMeter(List<Build> buildList){
        return buildList.stream()
                .map(Build::getSquareMeter)
                .reduce(0d,Double::sum) / buildList.size();
    }

    private List<Build> filterBuildsByBuildType(List<Build> buildList, Class<?> buildType){
        return buildList.stream()
                .filter(item -> item.getClass().equals(buildType))
                .collect(Collectors.toList());
    }
}
