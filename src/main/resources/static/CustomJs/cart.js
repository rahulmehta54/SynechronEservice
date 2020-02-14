function placeOrder(cartId) {

	var formData = {
		"id" : cartId
	}

	$.ajax({
		url : "/placeOrder",
		type : 'POST',
		data : JSON.stringify(formData),
		contentType : "application/json",
		success : function(data) {

			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');

			if (data.status == "success") {
				location.href = "/payment?cartId=" + cartId;
			} else {
				$("#catStatus").text(data.status);
			}

		},
		error : function(data) {
			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');
			$("#catStatus").text(data.status);
			// alert("ddd error" + data.status);
		}

	});

}

function deleteFromCart(cartId) {
	$("#serviceProviderId").val(cartId);

	$('#modal-default').modal('show');

}

$("#deleteServiceProvider")
		.click(
				function() {
					var id = $("#serviceProviderId").val();

					$
							.ajax({
								url : "/deleteFromCart/" + id,
								type : 'GET',
								success : function(data) {

									$('#modal-default').modal('hide');
									$('#modal-status').modal('show');

									if (data.status == "success") {
										$("#catStatus")
												.text(
														"Service Provider successfully deleted from cart.");
										location.reload();
									} else {
										$("#catStatus").text(data.status);
									}

								},
								error : function(data) {
									$('#modal-default').modal('hide');
									$('#modal-status').modal('show');
									$("#catStatus").text(data.status);
									// alert("ddd error" + data.status);
								}

							});
				})

$("#ok").click(function() {
	location.reload();
})
