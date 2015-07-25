<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>input</title>

<style type="text/css">

<!--
body {  background-color:#FAEBD7; color:#000000; }
h1 { text-align:center; font-size:2em; }
h2 { font-size:1.25em; }

span.confirm{color:red;}
span.result{position:relative; top:10px; left:350px;  }
span.comment{font-size:1.2em;}

div.confirm{ font-weight:bold; background-color:#FFF5EE; text-align:center; }
div.sub{text-align:center; }


div.comment
div.result{text-align:center;}

-->

</style>

</head>
<body>



	<h1>掲示板</h1>

	<HR size="2">

<div class="confirm"  ><span class="confirm">${sub}</span></div>
<div class="confirm"  ><span class="confirm">${del}</span></div>
<HR size="2">

	<s:form method="POST">
            <div class="sub"> 名前:<html:text property="name" />
            <p>　　　　　　　　　　　　　　　　　コメント:<html:text size="50" property="comment" /></p>
            <html:hidden property="sub" value="投稿しました" />
		<input type="reset" value="リセット">
		<s:submit property="result" value="送信"/> </div>

	</s:form>

	<HR size="2">



	<c:forEach var="bbs" items="${results}">

		<s:form method="POST">

		<span class="result">
				No.${f:h(bbs.id)}
				<br>名前:${f:h(bbs.name)}
				　　投稿日時:${f:h(bbs.uptime)}
				<p> <span class="comment"> 　${f:h(bbs.comment)}</span></p>

				 <html:hidden property="id" value="${f:h(bbs.id)}" />
				 <html:hidden property="del" value="削除しました" />
				<s:submit property="delete" value="削除" />

				<br style="clear: both" />
		</span>
		</s:form>

		<HR size="2">

	</c:forEach>

</body>
</html>