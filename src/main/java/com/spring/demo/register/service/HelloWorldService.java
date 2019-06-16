package com.spring.demo.register.service;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.demo.register.HelloWorld;

public class HelloWorldService {
	public static void main(String args[]) {
		
		/*HelloWorld  h= new HelloWorld();
		h.setName("World");
		
		String name = h.sayHello();*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld service = (HelloWorld) context.getBean("helloWorldService");
		
		/*JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
		
		jdbcTemplate.execute("Insert into register(reg_id, reg_name, reg_email) values (4, 'Narendra Modi', 'narendramodi@gmail.com')");
		
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from register");
		
		for (Map<String, Object> map : queryForList) {
			for (Map.Entry<String, Object> entry :map.entrySet()) {
				System.out.println(entry.getValue());
				
			}
			
		}*/
		
		
		
		
//		String queryForObject = jdbcTemplate.queryForObject("select reg_name from register",String.class );
//		System.out.println(queryForObject);
	}
}