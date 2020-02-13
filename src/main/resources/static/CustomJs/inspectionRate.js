$("#addInspectionRate").click(function() {

	$("#addInspectionRateDiv").show();
	$("#tableDiv").hide();

})

$(document).ready(function() {
	$("#id").val("");
	console.log(typeof $("#refresh").val());
	if ($("#refresh").val() == 'true') {

		location.href = "/inspectionRate";
	} else {
		if ($("#errorMessageStatus").val() != "") {
			$("#addInspectionRateDiv").show();
			$("#tableDiv").hide();

		} else {
			$("#addInspectionRateDiv").hide();
			$("#tableDiv").show();
		}
	}

});

function editInspectionRate(id, category) {

	$("#addInspectionRateDiv").show();
	$("#tableDiv").hide();
	$("#id").val(id);
	$("#name").val(category);

}

function deleteInspectionRate(id) {

	$("#catId").val(id);

	$('#modal-default').modal('show');

}

$("#deleteInspectionRate").click(function() {
	var id = $("#catId").val();

	$.ajax({
		url : "/deleteInspectionRateById/" + id,
		type : 'GET',
		success : function(data) {

			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');

			if (data.status == "success") {
				$("#catStatus").text("Successfully deleted Inspetion Rate");
			}

			setTimeout(function() {
				location.href = "/inspectionRate";
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
	location.href = "/inspectionRate";
})

$("#inspectionRateList").click(function() {
	$("#addInspectionRateDiv").hide();
	$("#tableDiv").show();
	$("#id").val("");
})