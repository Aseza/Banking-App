	$("document").ready(function($) {
		$(".progress").hide();
		
		$("#create_form").submit(function(event) {
			// Prevent the form from submitting via the browser.
			event.preventDefault();
			$(".progress").show();
			sendCreate();
		});
	});
	function sendCreate() {
		var data = {}
		$("#create_form input").each(function(){
			data[$(this).attr("name")]=$(this).val();
			});
		$.ajax({
			type : "post",
			data: data,
			url : "create/",
			timeout : 100000,
			success : function(data) {
				$(".progress").hide();

				if (data.indexOf("T_24_ERROR") >= 0){
					if (data.indexOf("OVERRIDE") >= 0){
					swal('ERROR...','Client Deja Existant','error')
					}
					else{
						swal('ERROR...',data,'error')

					}
				}
				if (data.indexOf("SUCCESS") >= 0){
					swal('Success!','Client Créé!','success')
				}
			},
			error : function(e) {
				if(e.status==403){
					swal({
						  title: 'Session Expired !!',
						  text: 'Please Log Back in',
						  type: 'error',
						  confirmButtonText: 'Log in',
						  allowEscapeKey: 'false',
						  allowOutsideClick: 'false'
						}).then(function (){
							window.location.replace("http://localhost:5555/WebServiceApp/login");
							});
				}
				if( e.status==500){
//					window.location.replace("http://localhost:5555/WebServiceApp/error500");
					window.location.href = '/WebServiceApp/error500';

				}
				
				
				$(".progress").hide();
			}
		});
	}