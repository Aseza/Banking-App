<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">



<head>

<!-- Title -->
<title>Main Page</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta charset="UTF-8">
<meta name="description" content="Responsive Admin Dashboard Template" />
<meta name="keywords" content="admin,dashboard" />
<meta name="author" content="Steelcoders" />
<!-- Styles -->
<link
	href="<c:url value="/resources/assets/plugins/materialize/css/materialize.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/assets/plugins/material-preloader/css/materialPreloader.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/animsition.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/assets/plugins/sweetalert/sweetalert.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/assets/css/alpha.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/assets/css/custom.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/FormStyle.css" />"
	rel="stylesheet">

<!-- <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="assets/css/bootstrap-datepicker.min.css" rel="stylesheet" type="text/css" /> -->
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="http://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="http://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>

<body>
	<div style="display: none">
		<c:url var="logoutUrl" value="/logout" />
		<form action="${logoutUrl}" id="logout" method="post">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>
	<div class="loader-bg"></div>
	<div class="loader">
		<div class="preloader-wrapper big active">
			<div class="spinner-layer spinner-blue">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
			<div class="spinner-layer spinner-spinner-teal lighten-1">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
			<div class="spinner-layer spinner-yellow">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
			<div class="spinner-layer spinner-green">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="mn-content fixed-sidebar ">
		<div class="navbar-fixed">
			<nav class="nav-extended blue-grey">
				<div class="nav-wrapper">
					<a href="#" class="center brand-logo">T24</a> <a href="#"
						data-activates="mobile-demo" class="button-collapse"><i
						class="material-icons">menu</i></a>
					<ul id="nav-mobile" class="right hide-on-med-and-down">
						<li><a href="#"
							onclick="document.getElementById('logout').submit();"><i
								class="material-icons">exit_to_app</i></a></li>
						<li><a href="#"><i class="material-icons">help_outline</i></a></li>
					</ul>
					<ul class="side-nav" id="mobile-demo">
						<li><a href="#"
							onclick="document.getElementById('logout').submit();">Log
								Out!</a></li>
						<li><a href="#">Help</a></li>
					</ul>
				</div>
				<div class="nav-content">
					<ul class="tabs tabs-transparent tabs-fixed-width">
						<li class="tab"><a class="active" href="#check">Verifier</a></li>
						<li class="tab disabled"><a href="#checkResult">Info</a></li>
						<li class="tab"><a href="#open">Ouvrir un Compte</a></li>
						<li class="tab"><a href="#create">Creer un Client</a></li>
					</ul>
				</div>
				<div class="progress">
					<div class="indeterminate"></div>
				</div>
			</nav>
		</div>

		<br /> <br /> <br />
		<main class="container animsition">
		<div id="check" class="col s12">
			<h5 class="center-align">Entrez Num de Transaction</h5>
			<form action="checkInfoMain" method="post"
				class="checkForm hoverable">
				<div class="group">
					<br /> <input placeholder="Transaction" type='text'
						id='transactionID' name='transactionID' value='C8732971' required><span
						class="highlight"></span><span class="bar"></span>
					<!--              <label>Transaction ID</label> 
 -->
				</div>
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
				<button class="button buttonBlue" type="submit">
					Verifier info
					<div class="ripples buttonRipples">
						<span class="ripplesCircle"></span>
					</div>
				</button>
			</form>
		</div>
		<div id="checkResult" class="col s12 ">
			<p>This is a parapgraph</p>
		</div>
	
		<div id="open" class="col s12 ">
			<div class="card" style="width:400px;margin:auto">
				<div class="card-content " >
					<span class="card-title center">Ouvrir Un Compte</span>
					<div class="row">
						<form id="account_form" method="get" action="account/">
							<div class="input-field col s12 ">
								<input type='text' id='client' name='client' required
									value="9527344"> <label>Client</label>
							</div>
							<div class="input-field col s12">
								<input type='number' id='categorie' name='categorie' required
									value="1001"> <label>Categorie</label>
							</div>
							<div class="input-field col s12">
								<input type='text' id='username' name='intitule_du_compte'
									required value="Mr TEST TEST"> <label>Intitule du
									Compte</label>
							</div>
							<div class="input-field col s12">
								<select id ="devise" name="devise">
									<option value="MAD" selected>MAD</option>
									<option value="1">Option 1</option>
								</select> <label>Devise</label>
							</div>
							<div class="input-field col s12">
								<input type='text' id='ll' name='ll' value="13" required> <label>LPLURALACC</label>
							</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							<div class="center"><button class=" btn-large waves-effect waves-light blue darken-3 " type="submit"
							name="action" value="Boutton">
							Create <i class="material-icons right">send</i>
						</button>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div id="create" class="col s12 ">
			<div class="card">
				<div class="card-content">
					<span class="card-title center">Creer Un Client</span>
					<form action="#" class="col s12" id="create_form">
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="nom_usuel" type="text" required
									value="MR TEST TEST" class="validate"> <label
									for="nom_usuel">Nom Usuel</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="adresse1" type="text" required value="AAAA"
									class="validate"> <label for="adresse1">Adresse
									1</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="complement_adresse" required value="ZZZZZZ"
									type="text" class="validate"> <label
									for="complement_adresse">Complement Address</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="ville" type="text" required value="780"
									class="validate"> <label for="ville">Ville</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="code_postal" type="text" value="20000" required
									class="validate"> <label for="code_postal">Code
									Postal</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="pays_de_residence" type="text" value="MA" required
									class="validate"> <label for="pays_de_residence">pays_de_residence</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="pays" type="text" value="MA" class="validate">
								<label for="pays">Pays</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="agent_economique" value="342" type="text" required
									class="validate"> <label for="agent_economique">Agent
									Economique</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="gestionnaire_principal" value="1001" type="text"
									required class="validate"> <label
									for="gestionnaire_principal">Gestionnaire Principal</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="pays_de_nationalite" value="MA" type="text"
									required class="validate"> <label
									for="pays_de_nationalite">Pays Nationalite</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="Identifiant_marche_principal" value="3" type="text"
									required class="validate"> <label
									for="Identifiant_marche_principal">Identifiant Marche
									Principal</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="numero_de_la_piece_d_identite" value="MPD456328"
									required type="text" class="validate"> <label
									for="numero_de_la_piece_d_identite">Numero de la Piece
									d'Identite</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="type_de_la_piece_d_identite" value="5" type="text"
									required class="validate"> <label
									for="type_de_la_piece_d_identite">Type de la Piece
									d'Identitel</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="nom_sur_piece_d_identite" value="QQQQQ" type="text"
									required class="validate"> <label
									for="nom_sur_piece_d_identite">"nom_sur_piece_d_identite"</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="lieu_de_delivrance" value="780" type="text"
									required class="validate"> <label
									for="lieu_de_delivrance">Lieu de delivrance</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="date_de_delivrance" value="20100101" type="text"
									required class="validate"> <label
									for="date_de_delivrance">Date de delivrance</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="date_fin_de_validite" value="20200101" type="text"
									required class="validate"> <label
									for="date_fin_de_validite">Date Fin de validite</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="prenom" type="text" value="TEST" required
									class="validate" /> <label for="prenom">Prenom</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="civilite" type="text" value="3M" required
									class="validate" /> <label for="civilite">Civilite</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="nom_de_famille" type="text" value="TEST" required
									class="validate" /> <label for="nom_de_famille">Nom de
									Famille</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="date_de_naissance" value="19800101" required
									type="text" class="validate" /> <label for="date_de_naissance">Date
									de naissance</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="situation_familiale" value="1" required type="text"
									class="validate" /> <label for="situation_familiale">Situation
									Familiale</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="telephone_gsm" value="0661123654" required
									type="text" class="validate"> <label
									for="telephone_gsm">Telephone GSM</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="adresse_email" value="TEST@GMAIL.TEST" required
									type="email" class="validate"> <label
									for="adresse_email">Adresse Email</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="profession" value="INGENIEUR" required type="text"
									class="validate"> <label for="profession">Profession</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="devise_salaire_pp" value="MAD" type="text"
									class="validate"> <label for="devise_salaire_pp">Devise
									Salaire PP</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="confidentialite_des_donnees_personnelle"
									value="VISIBLE" required type="text" class="validate">
								<label for="confidentialite_des_donnees_personnelle">confidentialite_des_donnees_personnelle</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12 m4">
								<input name="salaire" value="10000" type="text" required
									class="validate"> <label for="salaire">Salaire</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="place_of_birth" value="780" type="text" required
									class="validate"> <label for="place_of_birth">Place
									Of Birth</label>
							</div>
							<div class="input-field col s12 m4">
								<input name="ctry_of_birth" type="text" value="MA"
									class="validate" required /> <label for="ctry_of_birth">Country
									Of Birth</label>
							</div>
						</div>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />

						<button class="right btn waves-effect waves-light " type="submit"
							name="action" value="Boutton">
							Create <i class="material-icons right">send</i>
						</button>
						<br /> <br />
					</form>
				</div>
			</div>
		</div>
		</main>
	</div>

	<!-- Javascripts -->


	<script
		src="<c:url value="/resources/assets/plugins/jquery/jquery-2.2.0.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.formatter.js" />"></script>
	<script
		src="<c:url value="/resources/assets/plugins/materialize/js/materialize.min.js" />"></script>
	<script
		src="<c:url value="/resources/assets/plugins/material-preloader/js/materialPreloader.min.js" />"></script>
	<script
		src="<c:url value="/resources/assets/plugins/jquery-blockui/jquery.blockui.js" />"></script>
	<script src="<c:url value="/resources/js/animsition.min.js" />"></script>
	<script src="<c:url value="/resources/js/animsitionScript.js" />"></script>
	<script src="<c:url value="/resources/assets/js/alpha.min.js" />"></script>
	<script
		src="<c:url value="/resources/assets/plugins/sweetalert/sweetalert.min.js" />"></script>
	<script src="<c:url value="/resources/js/script.js" />"></script>
	<script src="<c:url value="/resources/js/open.js" />"></script>


</body>

</html>





