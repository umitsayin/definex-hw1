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
        System.out.println("Total price of summer homes: " + buildService.getTotalPriceOfSummerHomesInTL(buildList) + CurrencyConstant.TL_CURRENCY);
        System.out.println("Total price of builds: " + buildService.getTotalPriceOfHomesInTL(buildList) + CurrencyConstant.TL_CURRENCY);

        System.out.println("---------------------------------");

        System.out.printf("Average square meter of houses: %.2f \n", buildService.getAverageSquareMeterOfHomes(buildList));
        System.out.printf("Average square meter of villas: %.2f \n", buildService.getAverageSquareMeterOfVillas(buildList));
        System.out.printf("Average square meter of summer homes: %.2f \n", buildService.getAverageSquareMeterOfSummerHomes(buildList));
        System.out.printf("Average square meter builds: %.2f \n", buildService.getAverageSquareMeterOfBuilds(buildList));

        System.out.println("---------------------------------");

        for(Build build : buildService.filterBuildsByRoomCountAndHallCount(buildList,4,2)){
            System.out.println("Filter 4 room and 2 halls builds : " + build.toString());
        }
    }
}