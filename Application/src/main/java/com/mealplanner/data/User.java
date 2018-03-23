package com.mealplanner.data;

import java.util.ArrayList;

/**
 * Created by aayarekar on 3/23/2018.
 */

public class User {

    public String mName;
    public  ArrayList<Meals> mMeals;

    public User(String name) {
        mName = name;
        mMeals = new ArrayList<Meals>(0);
    }
}
