package com.sillycat.springbootws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class WebServiceClient {

	@SuppressWarnings("unused")
	@Autowired
	private WebServiceTemplate webServiceTemplate;

}
