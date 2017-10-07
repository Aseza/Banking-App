package classes;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


import generated.ouvertureS.BCPDIGOUVCPTEPPH;
import generated.ouvertureS.BCPDIGOUVCPTEPPHResponse;

public class AccountServiceClient extends WebServiceGatewaySupport {
	BCPDIGOUVCPTEPPH request = null;
	JAXBElement<BCPDIGOUVCPTEPPHResponse> response = null;

	@SuppressWarnings("unchecked")
	public JAXBElement<BCPDIGOUVCPTEPPHResponse> getResponse() {
		try {
			response = (JAXBElement<BCPDIGOUVCPTEPPHResponse>) getWebServiceTemplate().marshalSendAndReceive(request);
		} catch (WebServiceIOException e) {
			System.out.println("Connection Problems");
			response = null;
		} catch(Exception e){
			e.printStackTrace();
			response = null;

		}
		
		return response;
	}

	public BCPDIGOUVCPTEPPH getRequest() {
		return request;
	}

	public void setRequest(BCPDIGOUVCPTEPPH request) {
		this.request = request;
	}


}
