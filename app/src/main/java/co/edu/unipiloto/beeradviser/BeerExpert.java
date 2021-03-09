package co.edu.unipiloto.beeradviser;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeerExpert {
    public static List<String> getBrands(String beerType){
        List<String> beerList = new ArrayList<String>();

        if (beerType.equals("Light")) {
            beerList.add("Cajica Honey Ale");
            beerList.add("Bacata");
        }
        else if (beerType.equals("Amber")) {
            beerList.add("Premium Lager");
            beerList.add("Candelaria Classic");
        }
        else if (beerType.equals("Brown")) {
            beerList.add("Monserrate");
            beerList.add("Septimazo Ipa");
        }
        else if (beerType.equals("Dark")) {
            beerList.add("Chapinero Porter");
            beerList.add("Usaquen Stout");
        }

        return beerList;
    }
}
