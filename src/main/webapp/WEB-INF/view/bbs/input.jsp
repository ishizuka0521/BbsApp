<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>input</title>
</head>
<body>




	<h1>掲示板 入力フォーム</h1>
	<s:form method="POST">
            名前:<html:text property="name" />
            コメント:<html:text property="comment" />
            <html:hidden property="sub" value="投稿しました" />
		<input type="reset" value="リセット">
		<s:submit property="result" value="送信"/>

	</s:form>
<div>${sub}</div>
<div>${del}</div>
	<c:forEach var="bbs" items="${results}">
		<s:form method="POST">
			<div style="border: solid 1px #333">
				<div style="float: left; width: 100px">${f:h(bbs.id)}</div>
				<div style="float: left; width: 100px">${f:h(bbs.name)}</div>
				<div style="float: left; margin-left: 10px">${f:h(bbs.comment)}</div>

				 <html:hidden property="id" value="${f:h(bbs.id)}" />
				 <html:hidden property="del" value="削除しました" />
				<s:submit property="delete" value="削除" />

				<br style="clear: both" />
			</div>
		</s:form>
	</c:forEach>

</body>
</html>