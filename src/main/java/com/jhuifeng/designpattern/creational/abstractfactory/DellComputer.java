package com.jhuifeng.designpattern.creational.abstractfactory;

/**
 * @author jianghuifeng created on 2024/8/19
 * @version $
 */
public class DellComputer implements Computer{

    @Override
    public boolean create() {
        System.out.println("Dell computer create");
        return false;
    }
}