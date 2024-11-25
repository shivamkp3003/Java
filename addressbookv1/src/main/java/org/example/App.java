package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        User u2 = (User) ctx.getBean("user");
//        System.out.println(u2);

        u2.setUserName("vishwas");
        u2.setEmailId("vishwas@loudthat.com");
        u2.setPhoneNumber(new PhoneNumber("91", "1234567890"));
        System.out.println(u2);
//        User u1 = (User) ctx.getBean("user");
//        u1.setUserName("vishwas");
//        u1.setEmailId("vishwas@cloudthat.com");
//        System.out.println( u1 );
//        System.out.println("Printing u2 again");
//        System.out.println(u2);


    }
}
