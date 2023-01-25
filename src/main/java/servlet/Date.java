package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Date")
public class Date extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Date() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //現在日時を取得するコード
		java.util.Date now = new java.util.Date();
		System.out.println(now.toString());
		
		
		//レスポンスを返す
        response.setContentType("text/html; charset= UTF-8");
        PrintWriter out =response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>現在の時刻</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>現在の時刻は("+ now +")です。</p>");
        out.println("</body>");
        out.println("</html>");
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
