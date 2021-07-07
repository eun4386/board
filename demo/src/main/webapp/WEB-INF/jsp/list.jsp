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
				url: '/list',
				contentType: 'application/json',
				success: function(data){
					$("#aa").empty();
					var html = "";
					if(data != null) {
						for(var i=0; i<data.length; i++) {
							html += "<tr onclick='boardDetail("+data[i].no+");'>"
							html += "<td>"+data[i].no+"</td>";
							html += "<td>"+data[i].title+"</td>";
							html += "<td>"+data[i].content+"</td>";
							html += "<td>"+data[i].writer+"</td>";
							html += "</tr>"
						}
					}
					else {
						html += "<td>결과가 없음</td>"
					}			
					$("#aa").append(html);
				},
				error: function() {
					alert("error 발생!!");
				}
			});
		});	
		
		function boardDetail(no) {
			location.href="/boardDetail?no="+no;
		}
		
	</script>
</head>
<body>	
	<h1>게시판</h1>
	<div class="">
		<div class="">
			<table class="" id="">
		    <thead>
			    <tr>
			         <th>번호</th>
			         <th>제목</th>
			         <th>내용</th>
			         <th>글쓴이</th>
			     </tr>
		     </thead>
		     <tbody id="aa">
		     </tbody>
		     </table>
	     </div>
	</div>
</body>
</html>