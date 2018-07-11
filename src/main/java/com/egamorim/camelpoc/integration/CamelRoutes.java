package com.egamorim.camelpoc.integration;

import static com.egamorim.camelpoc.integration.Routes.FIRST_ROUTE;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		CamelProcessor processor = new CamelProcessor();
		
		from(FIRST_ROUTE)
			.id("ID_TEST")
			.log("Camel body: ${body}")
			.process(processor);

	}

}
