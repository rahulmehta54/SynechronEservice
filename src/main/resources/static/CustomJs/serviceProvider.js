$("#addServiceProvider").click(function() {

	$("#addServiceProviderDiv").show();
	$("#tableDiv").hide();

})

$(document).ready(function() {
	$("#id").val("");
	console.log(typeof $("#refresh").val());
	if ($("#refresh").val() == 'true') {

		location.href = "/serviceProvider";
	} else {
		if ($("#errorMessageStatus").val() != "") {
			$("#addServiceProviderDiv").show();
			$("#tableDiv").hide();

		} else {
			$("#addServiceProviderDiv").hide();
			$("#tableDiv").show();
		}
	}

});

function editServiceProvider(id, name, mobileNumber, emailId, category_id,
		city_id, addressLine1, addressLine2, state_id, experience, rate) {

	$("#addServiceProviderDiv").show();
	$("#tableDiv").hide();
	$("#id").val(id);
	$("#name").val(name);
	$("#experience").val(experience);
	$("#state").val(state_id);
	$("#city").val(city_id);
	$("#addressLine2").val(addressLine2);
	$("#addressLine1").val(addressLine1);
	$("#categoryId").val(category_id);
	$("#emailId").val(emailId);
	$("#mobileNumber").val(mobileNumber);
	$("#rate").val(rate);

}

function deleteServiceProvider(id) {

	$("#serviceProviderId").val(id);

	$('#modal-default').modal('show');

}

$("#deleteServiceProvider").click(function() {
	var id = $("#serviceProviderId").val();

	$.ajax({
		url : "/deleteServiceProviderById/" + id,
		type : 'GET',
		success : function(data) {

			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');

			if (data.status == "success") {
				$("#catStatus").text("Successfully deleted service provider");
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

})

$("#ok").click(function() {
	location.reload();
})

$("#serviceProviderList").click(function() {
	$("#addServiceProviderDiv").hide();
	$("#tableDiv").show();
	$("#id").val("");
})

function addToCart(id) {

	$.ajax({
		url : "/addToCart/" + id,
		type : 'GET',
		success : function(data) {

			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');

			if (data.status == "success") {
				$("#catStatus").text("Service Provider added into cart.");
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
