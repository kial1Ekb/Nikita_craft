<!DOCTYPE html>
<html lang="ru" xmlns:sec="http://www.thymeleaf.org/extras/spring-security">
<head>
<meta charset="UTF-8">
<title>Отзыв</title>
<link rel="stylesheet" th:href="@{/css/review.css}" media="screen">
<link rel="stylesheet" th:href="@{/css/nicePage.css}" media="screen">
<link id="u-theme-google-font" rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
<link id="u-page-google-font" rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">

</head>
<body>
<h1>BUYSELL</h1>
<hr>
<h4>Панель администратора</h4>
<table border="1">
  <tr>
    <th>Email</th>
    <th>Номер телефона</th>
    <th>Активность</th>
    <th>Роли</th>
    <th>Бан</th>
    <th>Редактирование</th>
    <th>Подробная информация</th>
  </tr>
  <#list users as user>
    <tr>
      <th>${user.username}</th>
      <th>${user.phone_number}</th>
      <th><#if user.active>true<#else>false</#if></th>
      <th><#list user.roles as role>${role}</#list></th>
      <th>
        <form action="/admin/user/ban/${user.id}" method="post">
          <input type="submit" value="Бан">
        </form>
      </th>
      <th><a href="/admin/user/edit/${user.id}">Редактировние</a></th>
      <th><a href="/user/${user.id}">Подробная информация</a></th>
    </tr>
  <#else>
    <h3>Пользователей нет</h3>
  </#list>
</table>
</body>
</html>