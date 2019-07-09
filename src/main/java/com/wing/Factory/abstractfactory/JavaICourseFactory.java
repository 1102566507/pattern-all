package com.wing.Factory.abstractfactory;

/**
 * Created by wing.
 */
public class JavaICourseFactory implements ICourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
