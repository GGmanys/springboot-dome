package com.ggman.springboot.bean;


/**
 * 简单model 用来做于测试
 */

public class Sales extends Employee {


    private double task;

    public double getTask() {
        return task;
    }

    public Sales(Integer id, String lastNaem, Integer gender, String email, Integer dId, double task) {
        super(id, lastNaem, gender, email, dId);
        this.task = task;
    }

    public void setTask(double task) {
        this.task = task;
    }

}
