import constant.CurrencyConstant;
import model.Build;
import repository.BuildRepository;
import service.BuildService;
import service.BuildServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final BuildRepository buildRepository = new BuildRepository();
        final List<Build> buildList = buildRepository.getAll();
        final BuildService buildService = new BuildServiceImpl();

        System.out.println("Total price of houses: " + buildService.getTotalPriceOfHomesInTL(buildList) + CurrencyConstant.TL_CURRENCY);
        System.out.println("Total price of villas: " + buildService.getTotalPriceOfVillasInTL(buildList) + CurrencyConstant.TL_CURRENCY);
        System.out.println("Total price of summeries: " + buildService.getTotalPriceOfSummeriesInTL(buildList) + CurrencyConstant.TL_CURRENCY);
        System.out.println("Total price of builds: " + buildService.getTotalPriceOfHomesInTL(buildList) + CurrencyConstant.TL_CURRENCY);

        System.out.println("---------------------------------");

        System.out.println("Average square meter of houses: " + buildService.getAverageSquareMeterOfHomes(buildList));
        System.out.println("Average square meter of villas: " + buildService.getAverageSquareMeterOfVillas(buildList));
        System.out.println("Average square meter of summeries: " + buildService.getAverageSquareMeterOfSummeries(buildList));
        System.out.println("Average square meter builds: " + buildService.getAverageSquareMeterOfBuilds(buildList));

        System.out.println("---------------------------------");

        for(Build build : buildService.filterBuildsByRoomCountAndHallCount(buildList,4,2)){
            System.out.println("Filter 4 room and 2 halls builds : " + build.toString());
        }
    }
}