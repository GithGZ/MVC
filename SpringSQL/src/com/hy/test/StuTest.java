package com.hy.test;

import com.hy.action.StuAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StuTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/hy/applicationContext.xml");
        StuAction stuAction = (StuAction) context.getBean("stuAction");
        stuAction.stuAction();
    }
}
