package poc.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class RetornoProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {

		exchange.getOut().setBody("Retorno OK!");

	}

}
