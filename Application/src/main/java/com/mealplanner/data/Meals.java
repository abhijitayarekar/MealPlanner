package com.mealplanner.data;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by aayarekar on 3/23/2018.
 */

public class Meals {

    public Date mDate;
    public ArrayList<Meal> mMeals;

    public Meals() {
        mDate = new Date();
        mMeals = new ArrayList<>();
    }
}
