package repository;

import model.Build;
import model.Home;
import model.Summery;
import model.Villa;
import util.CurrencyType;

import java.util.ArrayList;
import java.util.List;

public class BuildRepository {

    public List<Build> getAll(){
        final List<Build> buildList = new ArrayList<>();

        Build home1 = new Home(76.5, 3, 1, 120000, CurrencyType.TL);
        Build home2 = new Home(120, 2, 1, 20000, CurrencyType.USD);
        Build home3 = new Home(155.3, 4, 2, 25000, CurrencyType.EURO);

        Build villa1 = new Villa(90, 2, 1, 765000, CurrencyType.TL);
        Build villa2 = new Villa(160, 4, 2, 25400, CurrencyType.USD);
        Build villa3 = new Villa(185, 5, 2, 29700, CurrencyType.EURO);

        Build summery1 = new Summery(40, 1, 0, 375000, CurrencyType.TL);
        Build summery2 = new Summery(66.8, 2, 1, 75000, CurrencyType.USD);
        Build summery3 = new Summery(112, 4, 2, 18000, CurrencyType.EURO);

        buildList.add(home1);
        buildList.add(home2);
        buildList.add(home3);
        buildList.add(villa1);
        buildList.add(villa2);
        buildList.add(villa3);
        buildList.add(summery1);
        buildList.add(summery2);
        buildList.add(summery3);

        return buildList;
    }
}
