package nettycity;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Cityprocessor  implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
	    Map<String, Object> body = exchange.getIn().getBody(Map.class);

        // Process the data (e.g., print or store)
        System.out.println("Received city data: " + body);

 	}

}
