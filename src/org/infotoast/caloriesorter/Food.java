package org.infotoast.caloriesorter;

public class Food implements Comparable {
    private String foodName;
    private int calories;
    public Food(String n, int c) {
        foodName = n;
        calories = c;
    }

    public String getName() {
        return foodName;
    }

    public int getCalories() {
        return calories;
    }

    public String toString() {
        return foodName + "; Calories: " + Integer.toString(calories);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Food) {
            Food f = (Food)o;
            if (f.getCalories() < calories) {
                return 1;
            } else if (f.getCalories() > calories) {
                return -1;
            }
        }
        return 0;
    }
}
