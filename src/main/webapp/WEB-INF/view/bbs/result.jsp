<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>result</title>
</head>
<body>
	<h1>This is result</h1>

<c:forEach var="bbs" items="${results}">
<div style="border:solid 1px #333">
<div style="float:left;width:100px">${f:h(bbs.name)}"/></div>
<div style="float:left;margin-left:10px">${f:h(bbs.comment)}"/></div>
<br style="clear:both"/>
</div>
 </c:forEach>

</body>
</html>