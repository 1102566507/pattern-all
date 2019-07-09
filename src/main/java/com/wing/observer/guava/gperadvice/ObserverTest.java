package com.wing.observer.guava.gperadvice;

/**
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher wing = new Teacher("wing");
        Teacher mic = new Teacher("Mic");


        //这为没有wing老师
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        gper.register(wing);
        gper.register(mic);
        gper.post(question);


    }

}
