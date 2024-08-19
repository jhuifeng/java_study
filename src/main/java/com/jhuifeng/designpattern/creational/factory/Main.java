package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class Main {

    private static ActivityFactory activityFactory;

    public static void main(String[] args) {
        String activityType = "user";
        if ("user".equals(activityType)) {
            activityFactory = new UserActivityFactory();
        } else {
            activityFactory = new DelivererFactory();
        }
        Activity activity = activityFactory.createActivity();
        activity.create();
    }

}