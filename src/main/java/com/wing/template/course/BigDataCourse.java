package com.wing.template.course;

public class BigDataCourse extends NetworkCourse  {

    private boolean needHomeworkFlag = false;
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
