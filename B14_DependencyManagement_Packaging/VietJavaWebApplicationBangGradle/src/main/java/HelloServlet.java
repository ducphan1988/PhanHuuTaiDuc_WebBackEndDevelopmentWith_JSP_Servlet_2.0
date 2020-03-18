import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloServlet", urlPatterns = "/calculate")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float soThuNhat = Float.parseFloat(request.getParameter("soThuNhat"));
        float soThuHai = Float.parseFloat(request.getParameter("soThuHai"));
        char phepTinh = request.getParameter("phepTinh").charAt(0);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        try {
            float ketQua = Calculator.calculate(soThuNhat, phepTinh, soThuHai);
            printWriter.println("ketQua == "+ketQua);
        } catch (Exception ex) {
            printWriter.println("lỗi == "+ex);
        }

        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
