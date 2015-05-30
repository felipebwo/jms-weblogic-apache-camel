package poc.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.poc.jms_weblogic_camel.PessoaFisica;

import poc.camel.to.PessoaFisicaTO;

public class ProcessorSendJMS implements Processor {

	public void process(Exchange exchange) throws Exception {

		PessoaFisica pessoaFisicaRequest = exchange.getIn().getBody(PessoaFisica.class);
		
		//Convert Serializable
		PessoaFisicaTO pessoaFisicaTO = new PessoaFisicaTO();
		pessoaFisicaTO.idStelo = pessoaFisicaRequest.getIdStelo();
		pessoaFisicaTO.cpf  = pessoaFisicaRequest.getCpf();
		
		
		exchange.getOut().setBody(pessoaFisicaTO);

	}

}
