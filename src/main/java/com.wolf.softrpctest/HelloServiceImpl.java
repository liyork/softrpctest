package com.wolf.softrpctest;

/**
 * Description:
 * <br/> Created on 2019-01-23
 *
 * @author 李超
 * @since 1.0.0
 */
/**
 * Quick Start demo implement
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String string) {
        System.out.println("Server receive: " + string);
        return "hello " + string + " ！";
    }
}
