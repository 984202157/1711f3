<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<LINK href="css/css.css" type="text/css" rel="stylesheet">
<script  type="text/javascript" src="/resource/jquery-1.8.3.js"></script>
<script type="text/javascript">

 $(function() {
	$.post("listt",function(re){
		for(var i in re){
			$("#t1").append("<option value='"+re[i].tid+"'>"+re[i].tname+"</option>");
		}
	},"json")
	

	$.post("listp",function(re){
		for(var i in re){
			$("#p1").append("<option value='"+re[i].pid+"'>"+re[i].pname+"</option>");
		}
	},"json")
}) 
	

	


</script>
</head>
<body>
<form action="/add" method="post" enctype="multipart/form-data">
	 商品名称:<input type="text" name="gname"><br>
	 英文名称:<input type="text" name="ename">	<br>
	  种类:<select name="tid" id="t1" >
			<option value="0">请选择种类</option>
		</select><br>
		
	品牌:<select name="pid" id="p1" >
			<option value="0">请选择品牌</option>
		</select>  <br>
	尺寸:<input type="text" name="gsize"><br>
	单价(元):<input type="text" name="price"><br>
	数量:<input type="text" name="gcount"><br>
	标签:<input type="text" name="biaoqian"><br>
	商品图片:<input type="file" name="myFile"><br>
	<button>提交</button>
</form>

	

</body>
</html>