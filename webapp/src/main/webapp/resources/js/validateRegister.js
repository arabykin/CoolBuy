$(document).ready(
		function() {

			// validate signup form on keyup and submit
			$("#registerForm").validate(
					{
						rules : {
							name : {
								required : true,
								minlength : 3
							},
							password : {
								required : true,
								minlength : 5
							},
							checkPassword : {
								required : true,
								minlength : 5,
								equalTo : "#password"
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

		});
