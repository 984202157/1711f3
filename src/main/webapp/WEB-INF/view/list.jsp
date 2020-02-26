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
	

	
 
function dd(re) {
	alert(re)
}
function tj() {
	location="toadd";
}
function fy(pageNum) {
	$("[name=pageNum]").val(pageNum);
	$("form").submit();
}
</script>
</head>
<body>
<form action="/list" method="post">
	 <input type="button" value="添加" onclick="tj()">
	 种类:<select name="tid" id="t1" >
			<option value="0">请选择种类</option>
		</select>
		
	品牌:<select name="pid" id="p1" >
			<option value="0">请选择品牌</option>
		</select> 
		 
	单价范围<input type="text" name="price1" value="${con.price1 }">到<input type="text" name="price2" value="${con.price2 }">
	商品名称:<input type="text" name="gname"  value="${con.gname }">
	<input type="hidden" name="pageNum">
	<button>搜索</button>
</form>
<table>
	<tr>
		<td>商品编号</td>
		<td>商品名称</td>
		<td>英文名称</td>
		
		<td>尺寸</td>
		<td>单价(元)</td>
		<td>数量</td>
		<td>标签</td>
		<td>商品图片</td>
	</tr>
	<c:forEach items="${page.list }" var="g" varStatus="count">
	<tr>
		<td>${count.count+page.startRow-1 }</td>
		<td>${g.gname }</td>
		<td>${g.ename }</td>
		<td>${g.gsize }</td>
		<td>${g.price }</td>
		<td>${g.gcount}</td>
		<td>${g.biaoqian }</td>
		<td><img  style="width: 50px;height: 50px" alt="失败" src="file/${g.gpic }"> </td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="100">
			<button onclick="fy(1)">首页</button>
			<button onclick="fy(${page.prePage==0?1:page.prePage})">上一页</button>
			<button onclick="fy(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
			<button onclick="fy(${page.pages})">尾页</button>
			${page.pageNum }/${page.pages }页,${page.total }条
		</td>
	</tr>
</table>
	

</body>
</html>