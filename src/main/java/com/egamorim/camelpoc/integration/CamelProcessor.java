package com.egamorim.camelpoc.integration;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.egamorim.camelpoc.domain.Application;

public class CamelProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Application body = exchange.getIn().getBody(Application.class);
		System.out.println(exchange.getFromRouteId());
		System.out.println("Processor working: " + body.toString());
	}

}
