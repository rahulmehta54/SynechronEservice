$("#addCategory").click(function() {

	$("#addCategoryDiv").show();
	$("#tableDiv").hide();

})

$(document).ready(function() {
	$("#id").val("");
	console.log(typeof $("#refresh").val());
	if ($("#refresh").val() == 'true') {

		location.href = "/category";
	} else {
		if ($("#errorMessageStatus").val() != "") {
			$("#addCategoryDiv").show();
			$("#tableDiv").hide();

		} else {
			$("#addCategoryDiv").hide();
			$("#tableDiv").show();
		}
	}

});

function editCategory(id, category) {

	$("#addCategoryDiv").show();
	$("#tableDiv").hide();
	$("#id").val(id);
	$("#name").val(category);

}

function deleteCategory(id) {

	$("#catId").val(id);

	$('#modal-default').modal('show');

}

$("#deleteCategory").click(function() {
	var id = $("#catId").val();

	$.ajax({
		url : "/deleteById/" + id,
		type : 'GET',
		success : function(data) {

			$('#modal-default').modal('hide');
			$('#modal-status').modal('show');

			if (data.status == "success") {
				$("#catStatus").text("Successfully deleted Category");
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

$("#categoryList").click(function() {
	$("#addCategoryDiv").hide();
	$("#tableDiv").show();
	$("#id").val("");
})