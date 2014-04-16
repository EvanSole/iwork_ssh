<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户更新</title>
</head>
<body>
	<s:form action="updateUser">
		<s:hidden name="user.id" value="%{#request.user.id}" ></s:hidden>
		<s:textfield name="user.userName" value="%{#request.user.userName}" label="userName"></s:textfield>
		<s:textfield name="user.userEmail" value="%{#request.user.userEmail}" label="userEmail"></s:textfield>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>
