package org.infotoast.caloriesorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemSort {
    private static List<Food> foods;
    public ItemSort() {
        foods = new ArrayList<>();
        // Add all the foods to the foods list.
        foods.add(new Food("100% Bran", 70));
        foods.add(new Food("100% Natural Bran", 120));
        foods.add(new Food("All-Bran", 70));
        foods.add(new Food("All-Bran with Extra Fiber", 50));
        foods.add(new Food("Almond Delight", 110));
        foods.add(new Food("Apple Cinnamon Cherrios", 110));
        foods.add(new Food("Apple Jacks", 110));
        foods.add(new Food("Basic 4", 130));
        foods.add(new Food("Bran Chex", 90));
        foods.add(new Food("Bran Flakes", 90));
        foods.add(new Food("Cap'n'Crunch", 120));
        foods.add(new Food("Cheerios", 110));
        foods.add(new Food("Cinnamon Toast Crunch", 120));
        foods.add(new Food("Clusters", 110));
        foods.add(new Food("Cocoa Puffs", 110));
        foods.add(new Food("Corn Chex", 110));
        foods.add(new Food("Corn Flakes", 100));
        foods.add(new Food("Corn Pops", 110));
        foods.add(new Food("Count Chocula", 110));
        foods.add(new Food("Cracklin' Oat Bran", 110));
        foods.add(new Food("Cream of Wheat (Quick)", 100));
    }

    public List<Food> sort() {
        List<Food> newFoodList = foods;
        Collections.sort(newFoodList);
        return newFoodList;
    }
}
