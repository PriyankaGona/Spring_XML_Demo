package com.spring.demo.register;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RegisterMapper implements RowMapper<Register>{
	public Register mapRow(ResultSet resultSet, int i) throws SQLException {
		Register register = new Register();
		
		register.setReg_id(resultSet.getInt("reg_id"));
		register.setReg_name(resultSet.getString("reg_name"));
		register.setReg_email(resultSet.getString("reg_email"));
		
		return register;
	}
}
