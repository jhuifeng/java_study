package com.jhuifeng.designpattern.creational.abstractfactory;

/**
 * @author jianghuifeng created on 2024/8/19
 * @version $
 */
public class Main {

    public static void main(String[] args) {

        String productType = "HP";

        AbstractProductFactory abstractProductFactory;

        if ("HP".equals(productType)) {
            abstractProductFactory = new HPFactory();
            Computer computer = abstractProductFactory.createComputer();
            computer.create();
            Mouse mouse = abstractProductFactory.createMouse();
            mouse.create();
        } else {
            abstractProductFactory = new DellFactory();
            Computer computer = abstractProductFactory.createComputer();
            computer.create();
            Mouse mouse = abstractProductFactory.createMouse();
            mouse.create();
        }
    }

}