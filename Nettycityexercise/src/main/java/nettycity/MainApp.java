package nettycity;

import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
 
    public static void main(String... args)   {
    	 
            try {
                 ClassPathXmlApplicationContext applicationContext =  
                        new ClassPathXmlApplicationContext("camelcontext.xml");

                 SpringCamelContext camelContext = SpringCamelContext.springCamelContext(applicationContext, false);

                 System.out.println("Starting Camel with REST application...");
                camelContext.start();

                 Thread.sleep(Long.MAX_VALUE);
             } catch (Exception e) {
                System.err.println("Error starting the Camel application: " + e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("Camel application stopped.");
            }
    }

}

