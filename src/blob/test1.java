package blob;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int maxSize = 1*1024*1024;
		String encoding = "UTF-8";
		
		String ImageName = request.getParameter("Image");
		System.out.println(ImageName);
		
		ServletContext context = getServletContext(); //���ø����̼ǿ� ���� ������ ServletContext ��ü�� ���� ��. 
		String saveDir = context.getRealPath("inputImage"); //�����θ� ������
		
		//MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
	}
}
