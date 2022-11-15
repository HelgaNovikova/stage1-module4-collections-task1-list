package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        if (Math.abs(intA)==Math.abs(intB)){
            return intA - intB;
        }
        return (int) ((5 * Math.pow(intA,2) +3) -  (5 * Math.pow(intB,2) +3));
    }
}
