package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class Main {

    public static void main(String[] args) {

        String activityType = "user";

        AbstractActivityFactory abstractActivityFactory;

        if ("user".equals(activityType)) {
            abstractActivityFactory = new UserActivityFactory();
        } else {
            abstractActivityFactory = new DelivererFactory();
        }

        Activity activity = abstractActivityFactory.createActivity();
        activity.create();
    }

}