function placeOrder(cartId) {
	alert("Sdsdsd");
	$.ajax({
		url : "/placeOrder/" + cartId,
		type : 'GET',
		success : function(data) {

			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');
			alert("status=" + data.status);
			if (data.status == "success") {
				location.href = "/payment/" + cartId;
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