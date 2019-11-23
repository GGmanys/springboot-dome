package com.ggman.springboot.designMode.pattern.extension;

import com.ggman.springboot.designMode.pattern.AbstractFactory;
import com.ggman.springboot.designMode.pattern.Color;
import com.ggman.springboot.designMode.pattern.People;
import com.ggman.springboot.designMode.pattern.colorImpl.Green;
import com.ggman.springboot.designMode.pattern.colorImpl.Red;
import com.ggman.springboot.designMode.pattern.colorImpl.Yellow;

/**
 * 创建工厂来获取对象
 */
public class ColorFactroy extends AbstractFactory {
    @Override
    public People getRun(String run) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("green")){
            return new Green();
        }else if(color.equalsIgnoreCase("red")){
            return new Red();
        }else if (color.equalsIgnoreCase("yellow")){
            return new Yellow();
        }
        return null;
    }
}
