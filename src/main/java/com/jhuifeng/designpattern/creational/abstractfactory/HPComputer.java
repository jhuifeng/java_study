package com.jhuifeng.designpattern.creational.abstractfactory;

/**
 * @author jianghuifeng created on 2024/8/19
 * @version $
 */
public class HPComputer implements Computer{

    @Override
    public boolean create() {
        System.out.println("HP computer create");
        return false;
    }
}