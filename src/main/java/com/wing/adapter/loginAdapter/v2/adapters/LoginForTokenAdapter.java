package com.wing.adapter.loginAdapter.v2.adapters;


import com.wing.adapter.loginAdapter.ResultMsg;

/**
 * Created by wing.
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
