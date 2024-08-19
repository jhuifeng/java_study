package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class DelivererFactory extends AbstractActivityFactory {

    @Override
    protected Activity createActivity() {
        return new DelivererActivity();
    }

}