$(function() {
	init();
	//alert(0)
})

function init() {
	$.ajax({
		type : "post",
		url : "/test/hello",
		data : {},
		dataType : "json",
		success : function(data) {
			console.log(data);
		}
	});
}