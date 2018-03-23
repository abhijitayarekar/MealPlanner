package com.mealplanner.data;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by aayarekar on 3/23/2018.
 */

public class MealPlan {

    private static final MealPlan sfInstance = new MealPlan();

    public ArrayList<User> mUsers;

    public static MealPlan getInstance() {
        return sfInstance;
    }

    private MealPlan() {
        mUsers = new ArrayList<User>(0);
        mUsers.add(new User("All"));
        mUsers.add(new User("Abhijit"));
        mUsers.add(new User("Prachiti"));
        mUsers.add(new User("Aaniya"));
        mUsers.add(new User("Aaryav"));
    }
}
