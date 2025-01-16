package Mainaggregate;

import org.apache.camel.CamelContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class MainApp {
 
    public static void main(String... args)  {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Aggregate.xml");
		CamelContext camelContext = applicationContext.getBean(CamelContext.class);
	 
		try {
			camelContext.start();
			camelContext.createProducerTemplate().sendBody("direct:start","camel aggrigation task");
			camelContext.stop();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			applicationContext.close();
		}

   }

}