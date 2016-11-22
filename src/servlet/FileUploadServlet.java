package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

// A partir de 3.0. Esto evita usar web.xml
@WebServlet("/FileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FileUploadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if (isMultipart) {
			FileItemFactory factory = new DiskFileItemFactory();

			ServletFileUpload upload = new ServletFileUpload(factory);

			try {
				List<FileItem> items = upload.parseRequest(request);
				Iterator<FileItem> iterator = items.iterator();
				while (iterator.hasNext()) {
					FileItem item = (FileItem) iterator.next();
					if (!item.isFormField()) {
						String fileName = item.getName();
						String root = getServletContext().getRealPath("/");
						System.out.println(root);

						File path = new File(root + "/uploads");
						System.out.println("**** " + path);

						if (!path.exists()) {
							path.mkdirs();
						}

						File uploadedFile = new File(path + "/" + fileName);
						System.out.println(uploadedFile.getAbsolutePath());

						item.write(uploadedFile);
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
