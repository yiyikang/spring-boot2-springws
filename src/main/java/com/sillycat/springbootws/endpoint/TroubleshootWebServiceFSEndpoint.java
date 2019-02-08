package com.sillycat.springbootws.endpoint;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

import com.intuit.developer.ArrayOfString;

@Endpoint
public class TroubleshootWebServiceFSEndpoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(TroubleshootWebServiceFSEndpoint.class);

	public String serverVersion() {
		LOGGER.info("enter method server version");
		return "1.0";
	}

	public String clientVersion(String strVersion) {
		LOGGER.info("enter method client version");
		return null;
	}

	public ArrayOfString authenticate(String strUserName, String strPassword) {
		LOGGER.info("enter method authenticate, strUserName:" + strUserName + " strPassword:" + strPassword);
		ArrayOfString arrayOfString = new ArrayOfString();
		arrayOfString.getString().add(UUID.randomUUID().toString());
		arrayOfString.getString().add("NONE");
		return arrayOfString;
	}

	public String connectionError(String ticket, String hresult, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	public String sendRequestXML(String ticket, String strHCPResponse, String strCompanyFileName, String qbXMLCountry,
			int qbXMLMajorVers, int qbXMLMinorVers) {
		// TODO Auto-generated method stub
		return null;
	}

	public int receiveResponseXML(String ticket, String response, String hresult, String message) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getLastError(String ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	public String closeConnection(String ticket) {
		// TODO Auto-generated method stub
		return null;
	}

}
