package com.demo.assignment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Resource resource= new ClassPathResource("beans.xml");
    	BeanFactory factory= new XmlBeanFactory(resource);
    	
    	Emp e1=(Emp) factory.getBean("clerk");
    	Emp e2=(Emp) factory.getBean("prg");
    	Emp e3=(Emp) factory.getBean("mng");
    	
    	System.out.println("--------------EMPLOYEE DETAILS-------------");
    	System.out.println(e1);
    	System.out.println(e2);
    	System.out.println(e3);
    	
    	System.out.println("--------------APPRAISAL-------------");
    	e1.raiseSalary();
    	e2.raiseSalary();
    	e3.raiseSalary();
    	
    	System.out.println("--------------AFTER APPRAISAL-------------");
    	System.out.println(e1);
    	System.out.println(e2);
    	System.out.println(e3);
    }
}
