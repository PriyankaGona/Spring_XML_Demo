package com.spring.demo.register.dao;

import java.util.List;

import com.spring.demo.register.Register;

public interface RegisterDAO {
	
	Register getRegisterById(int id);
	List<Register> getAllRegisters();
	
	int insertRegister(Register register);
}
