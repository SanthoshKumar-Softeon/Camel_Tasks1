package SpliterTask;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Splitervalue {

    private final Set<String> differentIDs = new HashSet<>();

    public void splitall(org.apache.camel.Exchange exchange) {
        // Extract the full data item as a Map
        Map<String, Object> splitdata = exchange.getIn().getBody(Map.class);

        if (splitdata != null) {
            String listobjectID = (String) splitdata.get("workListId");

            if (listobjectID != null && differentIDs.add(listobjectID)) {
            	
                 System.out.println("ListID: " + listobjectID);
                System.out.println("Data: " + splitdata);
            }
        }
    }
}
