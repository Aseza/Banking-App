package controllers;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import classes.AjaxResponse;
import classes.ClientServiceClient;
import generated.creationS.BCPDIGCREAPPH1;
import generated.creationS.BCPDIGCREAPPH1Response;



@org.springframework.stereotype.Controller
@RequestMapping("create")
public class ClientController extends WebServiceGatewaySupport {
	@Autowired
	BCPDIGCREAPPH1 request;
	
	@Autowired
	AjaxResponse aRes;
	
	@Autowired
	@Qualifier("creationServiceClientBean")
	ClientServiceClient sc;
	
	JAXBElement<BCPDIGCREAPPH1Response> response = null;

	@RequestMapping("/")
	public @ResponseBody String goMain(HttpServletRequest req, HttpServletResponse res) {
		//RUST GAME
		request.getWebRequestCommon().setUserName("MEHDI01");
		request.getWebRequestCommon().setPassword("a123*123");
		request.getWebRequestCommon().setCompany("MA0011001");
		
		request.getCUSTOMERBCPCREADIGITALPPHType().getGSHORTNAME().getNomusuel().add(req.getParameter("nom_usuel"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGSHORTNAME().getNomusuel().get(0);
		request.getCUSTOMERBCPCREADIGITALPPHType().getGSTREET().getAdresse1().add(req.getParameter("adresse1"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGLLADDRESS().getMLLADDRESS().get(0).getSgLLADDRESS().getComplementdadresse().add(req.getParameter("complement_adresse"));;
		request.getCUSTOMERBCPCREADIGITALPPHType().getGTOWNCOUNTRY().getVille().add(req.getParameter("ville"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGPOSTCODE().getCodePostal().add(req.getParameter("code_postal"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGCOUNTRY().getPays().add(req.getParameter("pays"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setAgenteconomique(req.getParameter("agent_economique"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setGestionnaireprincipal(req.getParameter("gestionnaire_principal"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setPaysdeNationalite(req.getParameter("pays_de_nationalite"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setIdentifiantmarcheprincipal(req.getParameter("Identifiant_marche_principal"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setPaysderesidence(req.getParameter("pays_de_residence"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGVISTYPE().getConfidentialitedesdonneespersonnelle().add(req.getParameter("confidentialite_des_donnees_personnelle"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGLEGALID().getMLEGALID().get(0).setDatededelivrance(req.getParameter("date_de_delivrance"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGLEGALID().getMLEGALID().get(0).setDatefindevalidite(req.getParameter("date_fin_de_validite"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGLEGALID().getMLEGALID().get(0).setLieudedelivrance(req.getParameter("lieu_de_delivrance"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGLEGALID().getMLEGALID().get(0).setTypedelaPiecedIdentite(req.getParameter("type_de_la_piece_d_identite"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGLEGALID().getMLEGALID().get(0).setNumerodelaPiecedIdentite(req.getParameter("numero_de_la_piece_d_identite"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGLEGALID().getMLEGALID().get(0).setNomsurPiecedIdentite(req.getParameter("nom_sur_piece_d_identite"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setCivilite(req.getParameter("civilite"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setPrenom(req.getParameter("prenom"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setNomdeFamille(req.getParameter("nom_de_famille"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setDatedenaissance(req.getParameter("date_de_naissance"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setSituationfamiliale(req.getParameter("situation_familiale"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGSMS1().getTelephoneGSM().add(req.getParameter("telephone_gsm"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGEMAIL1().getAdresseemail().add(req.getParameter("adresse_email"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGEMPLOYMENTSTATUS().getMEMPLOYMENTSTATUS().get(0).setProfession(req.getParameter("profession"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGEMPLOYMENTSTATUS().getMEMPLOYMENTSTATUS().get(0).setDevisesalairePP(req.getParameter("devise_salaire_pp"));
		request.getCUSTOMERBCPCREADIGITALPPHType().getGEMPLOYMENTSTATUS().getMEMPLOYMENTSTATUS().get(0).setSalaire(req.getParameter("salaire"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setPLACEOFBIRTH(req.getParameter("place_of_birth"));
		request.getCUSTOMERBCPCREADIGITALPPHType().setCTRYOFBIRTH(req.getParameter("ctry_of_birth"));
		

		sc.setRequest(request);
		response = sc.getResponse();
		if(response!=null)
		aRes.setInfo(response.getValue().getStatus().getSuccessIndicator().toString());
		if(response!=null && response.getValue().getStatus().getSuccessIndicator().toString() != "SUCCESS"){
			aRes.setMessage(response.getValue().getStatus().getMessages().get(0));
		}
		else{
			aRes.setMessage("Success");
		}
		System.out.println(aRes.getInfo()+"--"+aRes.getMessage());
		return aRes.getInfo()+"--"+aRes.getMessage();
	}


	


}
