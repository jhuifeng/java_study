package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class UserAbstractActivityFactory extends AbstractActivityFactory {

    @Override
    protected Activity createActivity() {
        return new UserActivity();
    }

}