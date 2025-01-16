package Task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {


	 public static void main(String[] args) {
	        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("camel-context.xml"))
	        {
	            System.out.println("Application context started.");
	            Thread.sleep(600000); // 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println("Application context closed.");
	    }

}

