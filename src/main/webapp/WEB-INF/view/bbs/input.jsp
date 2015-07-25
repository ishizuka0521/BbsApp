<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>input</title>

<style type="text/css">

<!--
body { text-align:center; background-color:#FAF0E6; color:#000000; }
h1 { font-size:2em; }
h2 { font-size:1.25em; }

c:forEach { ; }

div.confirm{ color:red; font-weight:bold; font-size:1.25em; }
div.name
div.comment
-->

</style>

</head>
<body>



	<h1>掲示板</h1>
	<h2>投稿</h2>
	<s:form method="POST">
            名前:<html:text property="name" />
            <p>コメント:<html:text property="comment" /></p>
            <html:hidden property="sub" value="投稿しました" />
		<input type="reset" value="リセット">
		<s:submit property="result" value="送信"/>

	</s:form>
<div class=confirm >${sub}</div>
<div class=confirm >${del}</div>

	<c:forEach var="bbs" items="${results}">
		<s:form method="POST">
			<b> No.${f:h(bbs.id)} </b>
				名前:${f:h(bbs.name)}
				投稿日時:${f:h(bbs.uptime)}
				<p>${f:h(bbs.comment)}</p>

				 <html:hidden property="id" value="${f:h(bbs.id)}" />
				 <html:hidden property="del" value="削除しました" />
				<s:submit property="delete" value="削除" />

				<br style="clear: both" />

		</s:form>
	</c:forEach>

</body>
</html>