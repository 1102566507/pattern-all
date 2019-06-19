package com.wing.Factory.abstractfactory;

/**
 * Created by wing.
 */
public class PythonCourseFactory implements CourseFactory {

    public INote createNote() {
        return new PythonNote();
    }


    public IVideo createVideo() {
        return new PythonVideo();
    }
}
