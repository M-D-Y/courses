<%-- Переход объекта сессии по страницам --%>

<html>
<body>

	<H1>
		Session id:
		<%=session.getId()%></H1>

	<H1>
		Session value for "My dog"
		<%=session.getValue("My dog")%></H1>

	<FORM TYPE=POST ACTION=SessionObject.jsp>
		<INPUT TYPE=submit name=submit Value="Return">
	</FORM>

</body>
</html>
