package poc.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import poc.camel.to.PessoaFisicaTO;

public class ProcessorReceiverJMS implements Processor {

	public void process(Exchange exchange) throws Exception {

		PessoaFisicaTO pessoaFisicaTO = exchange.getIn().getBody(PessoaFisicaTO.class);
		System.out.println(pessoaFisicaTO.cpf);
		
		Thread.sleep(10000);
		
		System.out.println("Assyncrono.............");

	}

}