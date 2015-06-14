<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/common/common.jsp" %>
<script type="text/javascript" src="<%=basePathHeader%>/js/biz/homePage/homePage.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>股票分析</title>
</head>
<body>
<table class="table table-hover" >
	<caption >股票价格</caption>
   <thead>
      <tr>
         <th>名称</th>
         <th>代码</th>
         <th>价格</th>
      </tr>
   </thead>
   <tbody id="stockInfo">
      <tr>
         <td>Tanmay</td>
         <td>Bangalore</td>
         <td>560001</td>
      </tr>
      <tr>
         <td>Sachin</td>
         <td>Mumbai</td>
         <td>400003</td>
      </tr>
      <tr>
         <td>Uma</td>
         <td>Pune</td>
         <td>411027</td>
      </tr>
   </tbody>
</table>
</body>
</html>