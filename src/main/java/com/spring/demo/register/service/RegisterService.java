package com.spring.demo.register.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.register.HelloWorld;
import com.spring.demo.register.Register;
import com.spring.demo.register.dao.RegisterDAO;
import com.spring.demo.register.dao.RegisterDaoImpl;


public class RegisterService {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		RegisterDAO regDAO = (RegisterDAO)context.getBean("RegisterService");

		System.out.println("List of person is:");
		
		Register r = regDAO.getRegisterById(1);
		
		System.out.println(r.getReg_name());
		
		Register reg = new Register(8, "Maanvi","maanvi@gmail.com");
		
		regDAO.insertRegister(reg);
		
		for (Register p : regDAO.getAllRegisters()) {
			System.out.println(p);
			
		}
	}
}
