package com.wing.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jdbcTemplate {

    private DataSource dataSource;

    public jdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> exceteQuery(String sql, RowMapper<?> rowMapper, Object[] values) throws Exception {
        //1:获取连接
        Connection conn = this.getConnection();
        //2:创建语句集
        PreparedStatement pstm = this.createPrepareStatement(conn, sql);
        //3:执行语句集
        ResultSet rs = this.executeQuery(pstm, values);
        // 处理结果集
        List<?> result = this.parseResultSet(rs, rowMapper);
        //5 关闭结果集
        this.colseResultSet(rs);
        //关闭语句集
        this.closeStatement(pstm);
        //7 关闭连接诶
        this.closeConnection(conn);
        return result;

    }

    protected void closeStatement(PreparedStatement pstm) throws Exception {
        pstm.close();
    }

    protected void colseResultSet(ResultSet rs) throws Exception {
        rs.close();
    }

    protected List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result=new ArrayList<Object>();
        int rowNum=1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i=0;i<values.length;i++){
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }


    protected void closeConnection(Connection conn) throws Exception {
        //数据库连接池,这里不是关闭 返回给数据库连接池
        conn.close();
    }


    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

}
