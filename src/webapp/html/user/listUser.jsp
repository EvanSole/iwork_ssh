<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<table border="1" cellpadding="1" cellspacing="0" align="center" width="60%">
		<tr>
			<th>id</th>
			<th>userName</th>
			<th>userEmail</th>
			<th>update</th>
			<th>delete</th>
		</tr>
		<s:iterator value="#request.users" id="user">
			<tr>
				<td><s:property value="#user.id" /></td>
				<td><s:property value="#user.userName" /></td>
				<td><s:property value="#user.userEmail" /></td>
				<td><s:a href="updateUser.action?user.id=%{#user.id}">修改</s:a></td>
				<td><s:a href="deleteUser.action?user.id=%{#user.id}">删除</s:a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
