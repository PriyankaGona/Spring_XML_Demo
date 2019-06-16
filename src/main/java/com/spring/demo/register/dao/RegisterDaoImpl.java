package com.spring.demo.register.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.demo.register.Register;
import com.spring.demo.register.RegisterMapper;

public class RegisterDaoImpl implements RegisterDAO{
	
	//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_INSERT_Register = "";
	
	private  String SQL_FIND_Register = "select * from register where reg_id = ?";
	
	private final String SQL_GET_ALL = "select * from register";
	
	private final String SQL_INSERT_REGISTER = "INSERT INTO Register (reg_id, reg_name, reg_email) VALUES (?, ?, ?)";
	
	public Register getRegisterById(int regId) {
		return jdbcTemplate.queryForObject(SQL_FIND_Register, new Object[] { regId }
		, new RegisterMapper());
	}
	
	public List<Register> getAllRegisters() {
		return jdbcTemplate.query(SQL_GET_ALL,new RegisterMapper());
	}
	
	public int insertRegister(Register reg) {
		return jdbcTemplate.update(SQL_INSERT_REGISTER, reg.getReg_id(), reg.getReg_name(), reg.getReg_email());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	

}
