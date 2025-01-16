package Mainaggregate;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;

public class myAggregateStrategy implements AggregationStrategy {

	@Override
	 public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange; // If this is the first exchange, just return it
        }

        // Retrieve body from both exchanges
        String oldBody = oldExchange.getIn().getBody(String.class);
        String newBody = newExchange.getIn().getBody(String.class);

        // Combine the bodies with a separator
        String aggregatedBody = oldBody + "," + newBody;

        // Set the aggregated body into the old exchange
        oldExchange.getIn().setBody(aggregatedBody);

        // Return the old exchange with the updated body
        return oldExchange;
    }

}
