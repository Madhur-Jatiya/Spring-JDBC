package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcproject");
        
        String query = "insert into student(id, name, city) values(?,?,?)";
        
        int result = template.update(query,3,"Anurag Jain", "Sagar");
        System.out.println("Insert Successfully" + result);
    }
}
