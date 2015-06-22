<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>input</title>
</head>
<body>
	<h1>掲示板 入力フォーム</h1>
	<s:form method="POST">
            name:<html:text property="name" />
            コメント:<html:text property="comment" />
		<s:submit property="result" />

	</s:form>

	<c:forEach var="bbs" items="${results}">
		<div style="border: solid 1px #333">
			<div style="float: left; width: 100px">${f:h(bbs.name)}"/></div>
			<div style="float: left; margin-left: 10px">${f:h(bbs.comment)}"/></div>
			<br style="clear: both" />
		</div>
	</c:forEach>
</body>
</html>