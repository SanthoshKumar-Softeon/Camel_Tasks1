package nettycomponent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Responceconf implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		String input = exchange.getIn().getBody(String.class);
        System.out.println("Processing message: " + input);

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String modifiedMessage = "Hello You sent: \"" + input + "\" at " + timestamp;

        // Set the modified message as the response
        exchange.getIn().setBody(modifiedMessage);
    
	}

}
