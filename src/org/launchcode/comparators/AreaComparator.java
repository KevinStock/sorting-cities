package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by kevinstock on 4/3/17.
 */
public class AreaComparator implements Comparator<City>{
    @Override
    public int compare(City o1, City o2) {
        if (o1.getArea() < o2.getArea()) {
            return -1;
        } else if (o1.getArea() > o2.getArea()) {
            return +1;
        }
        else {
            return 0;
        }

        // return o1.getArea() < o2.getArea() ? -1 : o1.getArea() > o2.getArea() ? +1 : 0;
    }
}
