package com.wing.Factory.abstractfactory;

/**
 * Created by wing.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaICourseFactory factory = new JavaICourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }

}
