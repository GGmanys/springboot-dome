package com.ggman.springboot.weixin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ControllerText  {
    @RequestMapping("getUser")
    public Map<String ,Object> getUser(){
        System.out.println("调用微信小程序");
        Map<String ,Object> map = new HashMap<>();
        List<String > list = new ArrayList<>();
        list.add("张申");
        list.add("李师");
        list.add("王五");
        list.add("码子");
        map.put("list",list);
        System.out.println("调用完成");
        return map;
    }

    @RequestMapping("getWord")
    public Map<String,Object> getWord(String word){
        Map<String ,Object> map = new HashMap<>();
        String message="没有获取到内容";
        if("王五".equals(word)){
            message="正在热映的后来的我们是刘若英的处女作。";
        }else if("微信小程序".equals(word)){
            message= "想获取更多微信小程序相关知识，请更多的阅读微信官方文档，还有其他更多微信开发相关的内容，学无止境。";
        }else if("西安工业大学".equals(word)){
            message="西安工业大学（Xi'an Technological University）简称”西安工大";
        }
        map.put("message", message);
        return map;
    }

    @RequestMapping("")
    public String getText(){
        return "hello world";
    }

}
