package SpliterTask;

import org.apache.camel.spring.Main;
 
public class MainApp {
    public static void main(String[] args) throws Exception {
    	Main m = new Main();
		m.setApplicationContextUri("Spring/camelcontext.xml");
		System.out.println("Application Started");
		m.start();
		Thread.sleep(1000);
		m.stop();
		System.out.println("Application Closed");

    }
}


