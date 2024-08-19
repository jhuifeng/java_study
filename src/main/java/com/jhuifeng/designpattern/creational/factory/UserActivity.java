package com.jhuifeng.designpattern.creational.factory;

/**
 * @author jianghuifeng created on 2024/8/18
 * @version $
 */
public class UserActivity implements Activity{

    @Override
    public boolean create() {
        System.out.println("create user activity");
        return false;
    }

    @Override
    public boolean update() {
        System.out.println("update user activity");
        return false;
    }

    @Override
    public boolean delete() {
        System.out.println("delete user activity");
        return false;
    }
}