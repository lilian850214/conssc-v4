package v4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conssc.test.testA;

public class test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
		testA a=(testA)ac.getBean("a");
		a.testa();
		
	}

}
