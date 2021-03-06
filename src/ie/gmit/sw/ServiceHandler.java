package ie.gmit.sw;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/UploadServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)

public class ServiceHandler extends HttpServlet{

	private String environmentalVariable = "blah";
	private static int jobNumber = 0;
	private ArrayList<String> txtFileIn = new ArrayList<String>();
	private ArrayList<String> result = new ArrayList<String>();
	/**
	 * initilaize
	 * method starts the main components 
	 * 
	 */
	public void init() throws ServletException {
		ServletContext ctx = getServletContext(); // The servlet context is the
													// application itself.

		environmentalVariable = ctx.getInitParameter("SOME_GLOBAL_OR_ENVIRONMENTAL_VARIABLE");
	}
	
	/**
	 * do get method 
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter(); 
		String title = req.getParameter("txtTitle");
		String taskNumber = req.getParameter("frmTaskNumber");
		Part part = req.getPart("txtDocument");
		

		out.print("<html><head><title>A JEE Application for Measuring Document Similarity</title>");
		out.print("</head>");
		out.print("<body>");

		if (taskNumber == null) {
			taskNumber = new String("T" + jobNumber);
			jobNumber++;
		}
		
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/poll");
			dispatcher.forward(req, resp);
			// Check out-queue for finished job with the given taskNumber
		}

		// Output some headings at the top of the generated page
		/*out.print("<H1>Processing request for Job#: " + taskNumber + "</H1>");
		out.print("<H3>Document Title: " + title + "</H3>");
		out.print("<h3>Uploaded Document</h3>");
		out.print("<font color=\"0000ff\">");
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(part.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			txtFileIn.add(line);
		}
		Comparator cp = new ComparatorImpl();
		try {
			cp.addNewFileToDatabase(title, jobNumber, txtFileIn);
			result = cp.Compare(txtFileIn);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		out.println(result.toString());
		//out.print(txtFileIn.toString());
		out.print("</font>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}