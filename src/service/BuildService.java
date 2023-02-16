package service;

import model.Build;

import java.util.List;

public interface BuildService {
    double getTotalPriceOfHomesInTL(List<Build> buildList);
    double getTotalPriceOfVillasInTL(List<Build> buildList);
    double getTotalPriceOfSummeriesInTL(List<Build> buildList);
    double getTotalPriceOfBuildsInTL(List<Build> buildList);
    double getAverageSquareMeterOfHomes(List<Build> buildList);
    double getAverageSquareMeterOfVillas(List<Build> buildList);
    double getAverageSquareMeterOfSummeries(List<Build> buildList);
    double getAverageSquareMeterOfBuilds(List<Build> buildList);
    List<Build> filterBuildsByRoomCountAndHallCount(List<Build> buildList, int roomCount, int hallCount);
}
