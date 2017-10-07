package classes;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import generated.creationS.BCPDIGCREAPPH1;
import generated.creationS.BCPDIGCREAPPH1Response;

public class ClientServiceClient extends WebServiceGatewaySupport {
	BCPDIGCREAPPH1 request = null;
	JAXBElement<BCPDIGCREAPPH1Response> response = null;

	@SuppressWarnings("unchecked")
	public JAXBElement<BCPDIGCREAPPH1Response> getResponse() {
		try {
			response = (JAXBElement<BCPDIGCREAPPH1Response>) getWebServiceTemplate().marshalSendAndReceive(request);
		} catch (WebServiceIOException e) {
			System.out.println("Connection Problems");
			response = null;
		} catch(Exception e){
			e.printStackTrace();
			response = null;

		}
		
		return response;
	}

	public BCPDIGCREAPPH1 getRequest() {
		return request;
	}

	public void setRequest(BCPDIGCREAPPH1 request) {
		this.request = request;
	}


}
