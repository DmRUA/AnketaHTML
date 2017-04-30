package dmr.ua;

/**
 * Created by DmRG on 03.03.2017.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@WebServlet("/anketa")
public class AnketaServlet extends HttpServlet {
    private List<Anketa> anketaList = Collections.synchronizedList(new ArrayList<Anketa>());

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        String married = request.getParameter("married");
        String relaxTravel = request.getParameter("travel");
        String[] music = request.getParameterValues("music");
        anketaList.add(new Anketa(name, surname, age, sex, married, relaxTravel, music));
        HttpSession httpSession = request.getSession(true);
        httpSession.setAttribute("list", anketaList);
        response.sendRedirect("statistic.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}
