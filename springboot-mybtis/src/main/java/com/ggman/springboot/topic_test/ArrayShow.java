package com.ggman.springboot.topic_test;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * 每日一练
 *  个人小题题目
 *
 */
public class ArrayShow {
    public static void main(String[] args) {
        //获取日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);


        ArrayShow arrayShow = new ArrayShow();
        //题目一
        arrayShow.An();
        //题目二
        arrayShow.removeRepetition();
      //题目三
        arrayShow.getNum(2);

    }

    /**
     * 题目一
     *  定义一个数组，判断里面的数字加的和等于20，显示这些数字组合
     */
    public void An(){
        int[] array= {1,2,14,4,11,8,6,9,12,6};
        for(int i=0;i<array.length;i++){
            for (int j=1;j<array.length;j++){
                int sum=array[i]+array[j];
                if(sum==20){
                    System.out.println("和为20的组合数为："+array[i]+"+"+array[j]);
                }
            }
        }
    }

    /**
     * 题目二
     *  数组去重复
     */
    public void removeRepetition(){
        int[] str ={1,2,3,4,4,45,3,5,56,66,0,6,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(!list.contains(str[i])){
                list.add(str[i]);
            }
        }
        System.out.println("去重复的数组为"+list);
    }

    /**
     * 题目三
     *  输入N 判断奇1+1/3+1/n 则偶 1/2+1/4+1/n 判断求结果
     */
    public void getNum(double n){
        if(n%2==0){
            System.out.println(evenNum(n));
        }else{
            System.out.println(oddNum(n));
        }
    }
    //偶数递归
    public double evenNum(double n){
        if(n<=2){
            return  (double) 1/2;
        }
        return evenNum(n-2)+1/n;
    }
    //奇数递归
    public double oddNum(double n){
        if(n<=1){
            return 1/3;
        }
        return evenNum(n-2)+1/n;
    }
}
