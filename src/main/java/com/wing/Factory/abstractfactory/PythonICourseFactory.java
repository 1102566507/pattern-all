package com.wing.Factory.abstractfactory;

/**
 * Created by wing.
 */
public class PythonICourseFactory implements ICourseFactory {

    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
