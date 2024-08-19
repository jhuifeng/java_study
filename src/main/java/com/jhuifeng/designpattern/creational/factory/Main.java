package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class Main {

    private static Activity activity;

    public static void main(String[] args) {
        String activityType = "user";
        if ("user".equals(activityType)) {
            activity = new UserActivity();
        } else {
            activity = new DelivererActivity();
        }
        boolean b = activity.create();
    }

}