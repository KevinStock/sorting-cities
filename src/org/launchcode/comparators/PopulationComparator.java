package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by kevinstock on 4/3/17.
 */
public class PopulationComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return o1.getPopulation() < o2.getPopulation() ? -1 : o1.getPopulation() > o2.getPopulation() ? +1 : 0;
    }
}
