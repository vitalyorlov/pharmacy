<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>User info</title>
</head>
<body>
<s:property value="user.name"/>
<s:property value="user.surname"/> <br>
Username:
<s:property value="user.username"/><br>
<h1>Choose your next action:</h1>
<a href="/user/credentials.action">Edit Credentials</a>
<a href="/user/pass.action">Edit Password</a>
<a href="/user/redirect.action">Back to dashboard</a>
<a href="/">Home</a>
</body>
</html>
