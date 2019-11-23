package com.ggman.springboot.designMode.pattern.extension;

import com.ggman.springboot.designMode.pattern.AbstractFactory;
import com.ggman.springboot.designMode.pattern.Color;
import com.ggman.springboot.designMode.pattern.People;
import com.ggman.springboot.designMode.pattern.peopleImpl.A;
import com.ggman.springboot.designMode.pattern.peopleImpl.B;
import com.ggman.springboot.designMode.pattern.peopleImpl.C;

/**
 * 创建工厂来获取对象
 */
public class PeopleFactroy extends AbstractFactory {

    @Override
    public People getRun(String run) {
        if(run==null){
            return null;
        }
        if(run.equalsIgnoreCase("唱")){
            return new A();
        }else if(run.equalsIgnoreCase("跳")){
            return new B();
        }else if (run.equalsIgnoreCase("rap")){
            return new C();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
