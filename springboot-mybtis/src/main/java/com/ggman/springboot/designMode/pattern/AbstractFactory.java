package com.ggman.springboot.designMode.pattern;

/**
 *
 * 创建抽象类来获取工厂。
 *  做解耦操作
 */
public abstract class AbstractFactory {
    public abstract People getRun(String run);
    public abstract Color getColor(String color);
}
