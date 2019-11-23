package com.ggman.springboot.designMode.pattern.peopleImpl;

import com.ggman.springboot.designMode.pattern.People;

public class B implements People {
    @Override
    public void run() {
        System.out.println("跳");
    }
}
