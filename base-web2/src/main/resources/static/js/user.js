$(function(){

	var table = $("#table");
	var getAllUser = $("#getAllUser");
	
	getAllUser.click(function(){
		$.ajax({
			url : "./demo/user/all",
			type: "GET",
			dataType : "json",
			success: function(response){
				for(var i = 0; i < response.length; i++){
					table.append(
						"<tr>"
							+"<td>"+response[i].userId+"</td>"
							+"<td>"+response[i].username+"</td>"
							+"<td>"+response[i].password+"</td>"
							+"<td>"+response[i].age+"</td>"
						+"</tr>"
					);				
				}				
			}
		});
	});


	
});