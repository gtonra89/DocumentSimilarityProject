package ie.gmit.sw;

import java.io.File;
import java.util.ArrayList;

public class Document {
	private String DocumentTitle;
	private ArrayList<String> list = new ArrayList<String>();

	public Document(String documentTitle, ArrayList<String> list) {
		super();
		DocumentTitle = documentTitle;
		this.list = list;
	}

	public Document() {
		// TODO Auto-generated constructor stub
	}

	public String getDocumentTitle() {
		return DocumentTitle;
	}

	public void setDocumentTitle(String documentTitle) {
		DocumentTitle = documentTitle;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Line :"+ i +" Is -->" + list.get(i).toString()+ "\n");
		}
	}

}
