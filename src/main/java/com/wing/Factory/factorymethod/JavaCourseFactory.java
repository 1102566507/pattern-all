package com.wing.Factory.factorymethod;

import com.wing.Factory.ICourse;
import com.wing.Factory.JavaCourse;

/**
 * Created by wing.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
