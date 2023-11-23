package org.example;

import co1.BeanTest;
import co1.Config;
import co1.Milad;
import co1.WorkMilad;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("app run ...");


//        var context = new  GenericXmlApplicationContext("file:/Users/kiarash.shamaii/Documents/javaClass/ramin105/javaReview/session3/springMilad/config.xml");

        var context = new AnnotationConfigApplicationContext(Config.class);
        //milad new not
        //milad context make it
        //loosely couple context Milad
        BeanTest m =(BeanTest) context.getBean("hasan");
        System.out.println(m.getName());
//        WorkMilad m = context.getBean(WorkMilad.class);
//        System.out.println( m.getMilad().getName());
    }
}
