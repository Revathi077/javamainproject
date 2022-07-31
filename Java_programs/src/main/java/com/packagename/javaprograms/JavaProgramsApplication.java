package com.packagename.javaprograms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class JavaProgramsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaProgramsApplication.class, args);
		System.out.println("hello");
		//Control_statements a=new Control_statements();
		//a.nestedif();
		//a.ladderif();
		//a.ternaryop();
		//a.switchcase();
		//a.switchenumcase();
	//a.nestedswitch();
		//a.wapperswitch();
		Loops l=new Loops();
		//l.nestedforloop();
		//l.foreachloop();
		//l.labledforloop();
		//l.unlimitedloop();
		//l.whileloop();
		l.dowhile();
	}
		

}
