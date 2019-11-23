package com.ggman.springboot.designMode.pattern.colorImpl;

import com.ggman.springboot.designMode.pattern.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("绿");
    }
}
