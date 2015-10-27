$(function(){
	init();
});

function init(){
	var url = pathHeader+"/index.do";
	$.ajax({
		url:url,
		async:true,
		type:"post",
		success:function(data){
			if(data.ok == 1 && data.list.length >0){
				var list = data.list;
				var html = "";
				$.each(list,function(i,obj){
					html += createTR(obj);
				});
				$("#stockInfo").html(html);
			}
		},
		error:function(){
			alert("error");
		}
	});
}

function createTR(obj){
	var str = "<tr>"
	str += "<td>"+obj.code+"</td>";
	str += "<td>"+obj.name+"</td>";
	str += "<td>"+obj.current+"</td>";
	str += "</tr>";
	return str;
}