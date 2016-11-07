/**
 * 
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author franz
 *
 */
public class MainApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		System.out.println("Your Message: " + obj.getMessage());
		
		HelloSailor sailor = (HelloSailor) context.getBean("helloSailor");
		System.out.println("Sailor: " + sailor.getName());
	}

}
