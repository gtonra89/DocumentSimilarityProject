package ie.gmit.sw;

import java.io.File;
import java.util.ArrayList;

/**
 * 
 * @author garret
 * Document class the 
 * structure of the document 
 * class
 */
public class Document {
	private String DocumentTitle;
	private int documentID;
	private ArrayList<String> list = new ArrayList<String>();

	public Document(String documentTitle, int documentID, ArrayList<String> list) {
		super();
		DocumentTitle = documentTitle;
		this.list = list;
		this.documentID = documentID;
	}

	public int getDocumentID() {
		return documentID;
	}

	public void setDocumentID(int documentID) {
		this.documentID = documentID;
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
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Line :"+ i +" Is -->" + list.get(i).toString()+ "\n");
		}
		*/
	}

}
