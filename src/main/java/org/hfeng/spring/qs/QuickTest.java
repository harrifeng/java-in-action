package org.hfeng.spring.qs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class QuickTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("bean.xml");
        Action action = (Action)ctx.getBean("TheAction");
        System.out.println(action.execute("Rod Johnson"));
    }
}
