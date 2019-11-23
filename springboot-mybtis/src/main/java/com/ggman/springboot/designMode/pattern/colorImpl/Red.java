package com.ggman.springboot.designMode.pattern.colorImpl;

import com.ggman.springboot.designMode.pattern.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红");
    }
}
