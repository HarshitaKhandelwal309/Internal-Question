
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class one extends HttpServlet
{

public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{

res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String name = req.getParameter("Username");
String pass = req.getParameter("UserPass");

if(name.equals("harshita"))
{
        if(pass.equals("root"))
        {
              pw.println("Login Successfully!");
        }
        else
        {
              pw.println("Wrong Password Try Again");
        }
}
else
{
      pw.println("Wrong Password");
}



pw.close();
}

}
