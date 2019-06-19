package com.wing.adapter.loginAdapter.v1;

import com.wing.adapter.loginAdapter.v1.service.SinginForThirdService;

/**
 * Created by wing on 2019/3/16.
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("wing","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
