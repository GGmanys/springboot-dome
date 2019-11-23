package com.ggman.springboot.designMode.pattern.peopleImpl;

import com.ggman.springboot.designMode.pattern.People;

public class A implements People {
    @Override
    public void run() {
        System.out.println("唱");
    }
}
