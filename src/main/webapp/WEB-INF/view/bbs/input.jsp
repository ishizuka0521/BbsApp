<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>input</title>
    </head>
    <body>
        <h1>掲示板　入力フォーム</h1>
        <s:form method="POST">
            id:<html:text property="id" />
            name:<html:text property="name" />
            コメント:<html:text property="comment" />
            <s:submit property="result" />
        </s:form>
    </body>
</html>