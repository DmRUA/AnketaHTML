<%@ page import="dmr.ua.Anketa" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="dmr.ua.ResultStatistic" %><%--
  Created by IntelliJ IDEA.
  User: DmRG
  Date: 05.03.2017
  Time: 1:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Статистика</title>
</head>
<body>
<% List<Anketa> anketaList = (List<Anketa>) session.getAttribute("list");%>
<% int countAnswers = anketaList.size(); %>
<table cellpadding=5 cellspacing=3 border=1>
    <caption>Статистика, количество человек, что участвовали в голосовании: <%=countAnswers%>
    </caption>
    <tr>
        <th>Фильтры</th>
        <th>Информация</th>
    </tr>
    <tr>
        <td>Фильтры: Не женатые мужчины</td>
        <td><%=ResultStatistic.info(anketaList, "man", "No")%>
        </td>
        >
    </tr>
    <tr>>
        <td> Фильтры: Женатые мужчины:</td>
        <td><%=ResultStatistic.info(anketaList, "man", "Yes")%>
        </td>
    </tr>
    <tr>
        <td>Фильтры: Не замужние женщины</td>
        <td><%=ResultStatistic.info(anketaList, "woman", "No")%>
        </td>
        >
    </tr>
    <tr>>
        <td> Фильтры: Замужние женщины</td>
        <td><%=ResultStatistic.info(anketaList, "woman", "Yes")%>
        </td>
    </tr>
</table>
<a href="/anketa" >
    <p style="text-align: center">
    <button>Заполнить анкету ещё раз</button>
</a>
</body>
</html>
