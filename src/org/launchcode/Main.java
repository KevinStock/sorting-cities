package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        // sort by city name
//        NameComparator comparator = new NameComparator();
//        cities.sort(comparator);

        // sort by state name
//        StateComparator comparator = new StateComparator();
//        cities.sort(comparator);

        // sort by population
//        PopulationComparator comparator = new PopulationComparator();
//        cities.sort(comparator);

        // sort by area
//        AreaComparator comparator = new AreaComparator();
//        cities.sort(comparator);

        // sort by multiple
        CompoundComparator comparator = new CompoundComparator();
        comparator.add(new StateComparator());
        comparator.add(new NameComparator());
        cities.sort(comparator);

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
