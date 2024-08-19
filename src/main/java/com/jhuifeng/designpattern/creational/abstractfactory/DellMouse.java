package com.jhuifeng.designpattern.creational.abstractfactory;

/**
 * @author jianghuifeng created on 2024/8/19
 * @version $
 */
public class DellMouse implements Mouse{

    @Override
    public boolean create() {
        System.out.println("Dell mouse create");
        return false;
    }
}