package com.wing.Factory.factorymethod;

import com.wing.Factory.ICourse;
import com.wing.Factory.PythonCourse;

/**
 * Created by wing.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
