package com.ggman.springboot.weixin.pay;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 微信支付 通过servlet
 */
public class payment  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //获取商品
        String body = req.getParameter("body");
        String price ="1"; //微信价格是分
        //二维码生成。二维码为一个字符串生成图片
        //得到二维码原始二维码字符串 （安微信要求生成）
        //字符串转二维码
        //跳转支付
    }
}
