package nettycomponent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
        System.out.println("Starting Spring Camel TCP/IP Server...");
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("camelcontext1.xml")) {
            context.start();
            System.out.println("Server is running. Press Ctrl+C to stop.");
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

