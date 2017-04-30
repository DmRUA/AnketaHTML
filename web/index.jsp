<%--
  Created by IntelliJ IDEA.
  User: DmRG
  Date: 04.03.2017
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Анкета</title>
</head>
<body>
<h1>Заполните анкету и ответьте на вопросы:</h1>
<form action="/anketa" method="post">
    <div style="text-align: center; text-align: center;">
        <table cellpadding=5 cellspacing=3 border=2>
            <tr bgcolor="#008080">
                <td valign=top>
                    <label>Введите имя:<br><input type="text" name="name"></label><br>
                </td>
                <td valign=top>
                    <label>Введите фамилию:<br><input type="text" name="surname"></label><br>
                </td>
            </tr>
            <tr bgcolor="#008080">
                <td align=left colspan=2>
                    <label>Возраст:<br><input type="text" name="age"></label><br>
                </td>
            </tr>
            <tr bgcolor="#008080">
                <td valign=top>
                    <h3>Выберите свой пол:</h3>
                    <input type="radio" name="sex" value="man" checked>man<br>
                    <input type="radio" name="sex" value="woman">woman<br>
                    <input type="radio" name="sex" value="unknown">unknown<br>
                </td>
                <td valign=top>
                    <h3>Состоите вы в браке:</h3>
                    <input type="radio" name="married" value="Yes" checked>Yes<br>
                    <input type="radio" name="married" value="No">No<br>
                </td>
            </tr>
            <tr bgcolor="#008080">
                <td valign=top>
                    <h3>Где вы любите отдыхать:</h3>
                    <input type="radio" name="travel" value="Ukraine" checked>Ukraine<br>
                    <input type="radio" name="travel" value="Europe">Europe<br>
                    <input type="radio" name="travel" value="Asia">Asia<br>
                    <input type="radio" name="travel" value="USA">USA<br>
                </td>
                <td valign=right colspan=2>
                    <h3>Какая музыка вам интересна?</h3>
                    <input type="checkbox" name="music" value="Rock">Rock
                    <input type="checkbox" name="music" value="Pop">Pop
                    <input type="checkbox" name="music" value="Lounge">Lounge
                    <input type="checkbox" name="music" value="Trance">Trance
                    <input type="checkbox" name="music" value="Jazz">Jazz
                    <input type="checkbox" name="music" value="Rep">Rep
                </td>
            </tr>
            <tr bgcolor="#008080">
                <td align=center colspan=2>
                    <input type="submit" value="Подтвердить">
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>