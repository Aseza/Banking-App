package controllers;

import java.util.Arrays;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import classes.ConsultationServiceClient;
import generated.consultationS.CUSWS;
import generated.consultationS.CUSWSResponse;

@org.springframework.stereotype.Controller
public class ConsultationController extends WebServiceGatewaySupport {
	@Autowired
	CUSWS request;
	JAXBElement<CUSWSResponse> response = null;
	
	@Autowired
	@Qualifier("consultationServiceClient")
	ConsultationServiceClient sc;

	@RequestMapping("/")
	public ModelAndView goMain() {
		ModelAndView mv = new ModelAndView("main");
		

		return mv;
	}
	@RequestMapping("/logout")
	public ModelAndView goLogOut() {
		ModelAndView mv = new ModelAndView("logout");

		return mv;
	}

	@RequestMapping("/checkInfoMain")
	public ModelAndView goCheckInfo(@RequestParam(value="transactionID") String transaction)
			throws ServletException, IOException {
		ModelAndView mv = new ModelAndView("checkInfoMain");	
		request.getWebRequestCommon().setUserName("MEHDI01");
		request.getWebRequestCommon().setPassword("a123*123");
		request.getWebRequestCommon().setCompany("MA0011001");
		request.getCUSTOMERType().setTransactionId(transaction);
		sc.setRequest(request);
		response = sc.getResponse();
		String status = null;
		List<String> msg = null;
		String gender = null;
		String id = null;
		List<String> gShortNames = Arrays.asList("");
		List<String> gCountries = Arrays.asList("");

		if (response != null && response.getValue().getStatus().toString() != "") {
			status = response.getValue().getStatus().getSuccessIndicator().toString();
			msg = response.getValue().getStatus().getMessages();
			if (sc.getResponse().getValue().getCUSTOMERType() != null) {
				gShortNames = response.getValue().getCUSTOMERType().getGSHORTNAME().getSHORTNAME();
				gCountries = response.getValue().getCUSTOMERType().getGCOUNTRY().getCOUNTRY();
				gender = response.getValue().getCUSTOMERType().getGENDER();
				id = response.getValue().getCUSTOMERType().getId();
			}
		}
		mv.addObject("status", status);
		mv.addObject("msg", msg);
		mv.addObject("gShortNames", gShortNames.get(0));
		mv.addObject("gCountries", gCountries.get(0));
		mv.addObject("gender", gender);
		mv.addObject("id", id);
		return mv;
	}



	@RequestMapping("/error500")
	public ModelAndView goError() {
		ModelAndView mv = new ModelAndView("error500");
		return mv;
	}
	
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value = "error", required = false) String error, 
							  @RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView("login");
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		

		return model;

	}

}
