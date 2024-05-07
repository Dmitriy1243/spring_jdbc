<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h4>Товары со всей России</h4>
<form action="/" method="get">
    Поиск по названию объявления: <input type="text" name="name"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list clients as client>
    <div>
        <p><b>${client.name}</b> ${client.balans} руб. | <a href="/client/${client.id}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Client hti no</h3>
</#list>
<hr>
<h3>Создать новый client</h3>
<form action="/client/create" method="post">
    Название объявления: <input type="text" name="name"/><br><br>

    balans: <input type="number" name="name"/><br><br>
    <input type="submit" value="Добавить"/>
</form>
</body>
</html>