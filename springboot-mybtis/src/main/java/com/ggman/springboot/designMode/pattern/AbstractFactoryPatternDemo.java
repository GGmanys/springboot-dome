package com.ggman.springboot.designMode.pattern;

/**
 *
 * 测试类
 * 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 *
 * code: w
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
    //获取工厂
    AbstractFactory run = FactoryProducer.getFactory("run");
    //进入工厂 获取方法
    People rap = run.getRun("rap");
    //获取对象
    rap.run();

    }
}
