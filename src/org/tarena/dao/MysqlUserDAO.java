package org.tarena.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.tarena.entity.User;


public class MysqlUserDAO implements UserDAO{
	private JDBCDataSource dataSource;
	
	public MysqlUserDAO(JDBCDataSource dataSource){
		this.dataSource=dataSource;
	}
	
	public User findByName(String name){
		String sql="select * from users where name=?";
		Connection conn=null;
		try{
			conn=dataSource.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			User user=null;
			while(rs.next()){
				user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPhone(rs.getString("phone"));
				user.setPwd(rs.getString("pwd"));
			}
			rs.close();
			ps.close();
			return user;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			dataSource.close(conn);
		}
	}
}
