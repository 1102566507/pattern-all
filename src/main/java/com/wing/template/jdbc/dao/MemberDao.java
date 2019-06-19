package com.wing.template.jdbc.dao;

import com.wing.template.jdbc.Member;
import com.wing.template.jdbc.RowMapper;
import com.wing.template.jdbc.jdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class MemberDao extends jdbcTemplate {


    public MemberDao(DataSource dataSource) {
         super(dataSource);
    }


    public List<?> selectAll() throws Exception {
        String sql=" select * from  t_member";
        return super.exceteQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                //字段过多，原型模式
                member.setUserName(rs.getString("username"));
                member.setPassWord(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }
}
