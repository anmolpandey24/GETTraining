package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Customer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context=new ClassPathXmlApplicationContext("cust-bean.xml");
        
        Customer cust=(Customer) context.getBean("cust");
        System.out.println(cust);
    }
}
