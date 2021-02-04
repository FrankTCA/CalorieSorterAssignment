package org.infotoast.caloriesorter;

public class CalorieSorter {
    public static void main(String[] args) {
        ItemSort sort = new ItemSort();
        System.out.println("Sorted list: " + sort.sort().toString());
    }
}
