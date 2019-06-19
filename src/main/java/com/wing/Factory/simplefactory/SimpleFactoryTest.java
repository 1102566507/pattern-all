package com.wing.Factory.simplefactory;

import com.wing.Factory.ICourse;
import com.wing.Factory.JavaCourse;

/**
 * 小作坊式的工厂模型
 * Created by wing.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.wing.pattern.factory.JavaCourse");
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

    }
}
