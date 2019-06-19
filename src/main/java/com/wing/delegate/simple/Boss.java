package com.wing.delegate.simple;

/**
 * Created by wing.
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}

