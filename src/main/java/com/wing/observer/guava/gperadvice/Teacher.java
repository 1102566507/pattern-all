package com.wing.observer.guava.gperadvice;

import com.google.common.eventbus.Subscribe;
import com.wing.observer.guava.api.GuavaEvent;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher {
    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Subscribe
    public void update(Question question) {
        System.out.println("--------------------------");
        System.out.println(name + "老师，你好！\n" +
        "您收到了一个来自“" + GPer.getInstance().getName() + "”的提问，希望您解答，问题内容如下：\n" +
        question.getContent() + "\n" +
        "提问者：" + question.getUserName());
    }


    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }



}
