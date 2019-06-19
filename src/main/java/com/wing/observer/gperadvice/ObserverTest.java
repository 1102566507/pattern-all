package com.wing.observer.gperadvice;

/**
 * Created by wing on 2019/3/17.
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher wing = new Teacher("wing");
        Teacher mic = new Teacher("Mic");


        //这为没有@wing老师
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        gper.addObserver(wing);
        gper.addObserver(mic);
        gper.publishQuestion(question);


    }

}
