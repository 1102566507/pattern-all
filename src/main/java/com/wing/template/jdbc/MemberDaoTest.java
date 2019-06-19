package com.wing.template.jdbc;


import com.wing.template.jdbc.dao.MemberDao;

import java.util.List;

public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        try {
            List<?> results = memberDao.selectAll();
            System.out.println(results);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
