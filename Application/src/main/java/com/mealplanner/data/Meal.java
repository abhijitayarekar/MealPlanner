package com.mealplanner.data;

import android.util.ArrayMap;

import java.time.LocalTime;

/**
 * Created by aayarekar on 3/23/2018.
 */

public class Meal {

    public String mName;
    public LocalTime mTime;
    public ArrayMap<String, MealItem> mItems;

    public Meal(String name, LocalTime time) {
        mName = name;
        mTime = time;
        mItems = new ArrayMap<String, MealItem>(0);
    }
}
