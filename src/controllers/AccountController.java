package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import classes.AccountServiceClient;
import generated.ouvertureS.BCPDIGOUVCPTEPPH;
import generated.ouvertureS.BCPDIGOUVCPTEPPHResponse;

@org.springframework.stereotype.Controller
@RequestMapping("account")
public class AccountController extends WebServiceGatewaySupport {
	@Autowired
	BCPDIGOUVCPTEPPH request;
	JAXBElement<BCPDIGOUVCPTEPPHResponse> response = null;

	@Autowired
	@Qualifier("accountServiceClientBean")
	AccountServiceClient sc;
	


	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	public @ResponseBody String goMain(HttpServletRequest req, HttpServletResponse res) {
		response = null;
		String message=null;
		String successIndicator=null;
		
		request.getWebRequestCommon().setUserName("MEHDI01");
		request.getWebRequestCommon().setCompany("MA0011001");
		request.getWebRequestCommon().setPassword("a123*123");
		
		request.getACCOUNTBCPOUVDIGITALPPHType().setClient(req.getParameter("client"));
		request.getACCOUNTBCPOUVDIGITALPPHType().setCategory(req.getParameter("categorie"));
		request.getACCOUNTBCPOUVDIGITALPPHType().setIntituleducompte1(req.getParameter("intitule_du_compte"));
		request.getACCOUNTBCPOUVDIGITALPPHType().setDevise("MAD");
		request.getACCOUNTBCPOUVDIGITALPPHType().setLPLURALACC(req.getParameter("ll"));
		
		sc.setRequest(request);
		response =  sc.getResponse();
		if(response!=null){
			message = response.getValue().getStatus().getSuccessIndicator().toString();
			successIndicator = response.getValue().getStatus().getMessages().get(0);
		}
		System.out.println(message+"--"+successIndicator);
		return  message+"--"+successIndicator;
	}


	


}
