<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
	<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$.ajax({
				type: 'GET',
				url: 'http://localhost:7070/list',
				success: function(data){
					$("#aa").empty();
					var html = "";
					html += "<td>"+data+"</td>";
					$("#aa").append(html);
					
				}
			});
		});	
	</script>
</head>
<body>	
	<div class="">
		<div class="">
			<table class="" id="">
		    <thead>
			    <tr>
			         <th>제목</th>
			         <th>내용</th>
			         <th>등록한 ID</th>
			         <th>등록한 날짜</th>
			     </tr>
		     </thead>
		     <tbody>
		     	
			     <tr id="aa">
			     	
			     </tr>
			     <tr>
			     	<td>게시물 없음</td>
			     </tr>
		     </tbody>
		     </table>
	     </div>
	</div>
</body>
</html>