package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class DelivererActivity implements Activity{

    @Override
    public boolean create() {
        System.out.println("create deliverer activity");
        return false;
    }

    @Override
    public boolean update() {
        System.out.println("update deliverer activity");
        return false;
    }

    @Override
    public boolean delete() {
        System.out.println("delete deliverer activity");
        return false;
    }
}