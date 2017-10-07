package classes;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import generated.consultationS.CUSWS;
import generated.consultationS.CUSWSResponse;


public class ConsultationServiceClient extends WebServiceGatewaySupport {
	CUSWS request = null;
	JAXBElement<CUSWSResponse> response = null;

	@SuppressWarnings("unchecked")
	public JAXBElement<CUSWSResponse> getResponse() {
		try {
			response = (JAXBElement<CUSWSResponse>) getWebServiceTemplate().marshalSendAndReceive(request);
		} catch (WebServiceIOException e) {
			System.out.println("Connection Problems");
			response = null;
		} catch(Exception e){
			e.printStackTrace();
			response = null;

		}
		
		return response;
	}

	public CUSWS getRequest() {
		return request;
	}

	public void setRequest(CUSWS request) {
		this.request = request;
	}


}
