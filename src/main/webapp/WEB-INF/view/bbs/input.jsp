<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>input</title>

<style type="text/css">

<!--
body {  background-color:#FAEBD7; color:#000000; }
h1 { text-align:center; font-size:2em; }
h2 { font-size:1.25em; }

table { margin-left: auto; margin-right: auto;}
span.confirm{color:red;}
span.result{ text-align:center;}
span.title{font-size:1.5em;}
span.comment{font-size:1.2em;}

div.confirm{text-align:center;  font-weight:bold; background-color:#FFF5EE;  }
div.sub{ border-style:dotted; margin:50px 200px; padding:20px 5px 20px 5px; background-color:#FFFAF0; }


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




	<c:forEach var="bbs" items="${results}">

		<s:form method="POST">

		<table >
				<tr><td>No.${f:h(bbs.id)}
				　　<span class="title">${f:h(bbs.title)}</span></td></tr>
				<tr><td>名前:${f:h(bbs.name)}</tb>
				　　<tb>投稿日時:${f:h(bbs.uptime)}</td></tr>
				<tr><td> <span class="comment"> 　${f:h(bbs.comment)}</span></td>

				 <html:hidden property="id" value="${f:h(bbs.id)}" />
				 <html:hidden property="del" value="削除しました" />
				<tr><td><s:submit property="delete" value="削除" />


		</table>
		</s:form>

		<HR size="2">

	</c:forEach>

	<s:form method="POST">
	<div class="sub">
  	<table >
           <tr><td> タイトル:<html:text size="30" property="title" /></td></tr>
            <tr><td>名前:<html:text property="name" /></td></tr>
            <tr><td>コメント:<html:text size="50" property="comment" /></td></tr>
            <html:hidden property="sub" value="投稿しました" />
		<tr><td><input type="reset" value="リセット"><s:submit property="result" value="送信"/> </td></tr>
	</table>
	</div>
	</s:form>

	<HR size="2">

</body>
</html>