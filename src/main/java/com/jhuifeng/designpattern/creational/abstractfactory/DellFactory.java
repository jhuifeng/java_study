package com.jhuifeng.designpattern.creational.abstractfactory;

/**
 * @author jianghuifeng created on 2024/8/19
 * @version $
 */
public class DellFactory implements AbstractProductFactory{

    @Override
    public Computer createComputer() {
        return new DellComputer();
    }

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}