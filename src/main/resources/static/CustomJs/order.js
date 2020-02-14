function changeStatus(id) {
	$.ajax({
		url : "/changeBookingStatus?id=" + id,
		type : 'GET',
		success : function(data) {

			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');

			if (data.status == "success") {
				$("#catStatus").text("Unbooked Service Provider.");
			} else {
				$("#catStatus").text(data.status);
			}

			setTimeout(function() {
				location.reload();
			}, 5000);

		},
		error : function(data) {
			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');
			$("#catStatus").text(data.status);
			// alert("ddd error" + data.status);
		}

	});
}