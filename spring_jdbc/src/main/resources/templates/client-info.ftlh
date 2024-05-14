<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h4> info oh cliens </h4>
<b>name: </b>${client.name}<br>
<b>balans: </b>${client.balans}<br>
<hr>
<form action="/client/delete/${client.id}" method="post">
    <input type="submit" value="delete cleint"/>
</form>
</body>
</html>