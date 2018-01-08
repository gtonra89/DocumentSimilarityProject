package ie.gmit.sw;

import java.util.ArrayList;

public interface Comparator {
	/**
	 * An Interface implementation
	 * @param list1
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	public ArrayList<String> Compare(ArrayList<String> list1) throws Exception, Throwable;
	
	public void addNewFileToDatabase(String Title, int DocId, ArrayList<String> list) throws Exception, Throwable;

}
