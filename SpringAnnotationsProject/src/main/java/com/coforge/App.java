package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Book;
import com.coforge.beans.Order;
import com.coforge.beans.Student;
import com.coforge.configuration.BookOrderConfig;
import com.coforge.configuration.StudentConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
//        Book book=(Book) context.getBean("book");
//        System.out.println(book);
//        
//        Order ord=(Order) context.getBean("ord");
//        System.out.println(ord);
        
        Student st=(Student) context.getBean("std");
        System.out.println(st);
        
        Student st1=(Student) context.getBean("std");
        System.out.println(st1);
        
        System.out.println(st.hashCode());
        System.out.println(st1.hashCode());
    }
}
