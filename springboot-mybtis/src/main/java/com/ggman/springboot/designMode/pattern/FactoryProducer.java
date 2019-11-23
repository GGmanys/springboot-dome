package com.ggman.springboot.designMode.pattern;

import com.ggman.springboot.designMode.pattern.extension.ColorFactroy;
import com.ggman.springboot.designMode.pattern.extension.PeopleFactroy;


/**
 * 创建一个工厂创造器/生成器类，通过传递形状信息来获取工厂。
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String  code){

        if(code.equalsIgnoreCase("run")){
            return new PeopleFactroy();
        }else if(code.equalsIgnoreCase("color")){
            return new ColorFactroy();
        }
        return null;
    }
}
