package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class Main {

    private static AbstractActivityFactory abstractActivityFactory;

    public static void main(String[] args) {
        String activityType = "user";
        if ("user".equals(activityType)) {
            abstractActivityFactory = new UserAbstractActivityFactory();
        } else {
            abstractActivityFactory = new DelivererFactoryAbstract();
        }
        Activity activity = abstractActivityFactory.createActivity();
        activity.create();
    }

}