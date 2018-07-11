package com.egamorim.camelpoc.integration;

import static com.egamorim.camelpoc.integration.Routes.*;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egamorim.camelpoc.domain.Application;

@RestController
public class CamelController {

	@Autowired
	ProducerTemplate producerTemplate;

	@RequestMapping(value = "/", method=RequestMethod.POST)
	public ResponseEntity<?> startCamel(@RequestBody Application application) {

		producerTemplate.sendBody(FIRST_ROUTE, application);
		
		return new ResponseEntity<>("OK", HttpStatus.OK);

	}
}
