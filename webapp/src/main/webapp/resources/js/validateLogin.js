$(document).ready(
		
		function() {

			// validate signup form on keyup and submit
			$("#loginForm").validate(
					{
						rules : {
							
							password : {
								required : true,
								minlength : 5
							},
							
							email : {
								required : true,
								email : true,
							},
						},
						highlight : function(element) {
							$(element).closest('.control-group').removeClass(
									'success').addClass('error');
						},
						success : function(element) {
							element.text('OK!').addClass('valid').closest(
									'.control-group').removeClass('error')
									.addClass('success');
						}
					});

		}
);
