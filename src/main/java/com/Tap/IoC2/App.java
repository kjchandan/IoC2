package com.Tap.IoC2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Tap.IoC2.Imp.Teacher_bharath;
import com.Tap.IoC2.Imp.Teacher_chandan;

public class App {
  public static void main(String[] args) {
    
	  ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	  
	  Teacher_chandan ct = (Teacher_chandan) ac.getBean("ct");
	  Teacher_bharath bt = (Teacher_bharath) ac.getBean("bt");
	  
	  ct.teaches();
	  bt.teaches();
	  
	  System.out.println(ct);
	  System.out.println(bt);
	  
	  
	  
	  
  }
}
