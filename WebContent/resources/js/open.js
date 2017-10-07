	$("document").ready(function($) {
		$(".progress").hide();
		$("#account_form").submit(function(event) {
			// Prevent the form from submitting via the browser.
			event.preventDefault();
			$(".progress").show();
			sendOpen();
		});
	});
	function sendOpen() {
		var data = {}
		$("#account_form input").each(function(){
			data[$(this).attr("name")]=$(this).val();
			});
		$.ajax({
			type : "post",
			data: data,
			url : "account/",
			timeout : 100000,
			success : function(data) {
				$(".progress").hide();
				if (data.indexOf("T_24_ERROR") >= 0){
					if (data.indexOf("OVERRIDE") >= 0){
					swal('ERROR...','Compte Deja Existant','error')
					}
					else{
						swal('ERROR...',data,'error')
					}
				}
				if (data.indexOf("SUCCESS") >= 0){
					swal('Success!','Compte Créé!','success')
				}
				if(data=="null--null")
//					window.location.replace("http://localhost:5555/WebServiceApp/error500");
				window.location.href = '/WebServiceApp/error500';


			},
			error : function(e) {

			}
		});
	}