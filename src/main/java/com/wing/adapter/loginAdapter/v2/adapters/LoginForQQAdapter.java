package com.wing.adapter.loginAdapter.v2.adapters;


import com.wing.adapter.loginAdapter.ResultMsg;

/**
 * Created by wing on 2019/3/16.
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
