package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ComparatorImpl extends DocumentRunner implements Comparator {
	
	protected ComparatorImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		
	}
	/**
	* Returns the ArrayList of compared 
	* Documents.
	* @param ArayList 
	*/
	
	@Override
	public ArrayList<String> Compare(ArrayList<String> list1) throws Throwable {
		ArrayList<String> dbList = new ArrayList<String>();
		DocumentRunner dr = new DocumentRunner();
		dbList = dr.Compare(list1);
		
		return dbList;
		
	}
	
	/**
	 * Takes a String integer and ArrayList &  
	 * Adds new file to the Db4o
	 * @param String
	 * @param int
	 * @param ArrayList
	 */
	@Override
	public void addNewFileToDatabase(String Title, int DocId,ArrayList<String> list) throws Exception, Throwable {
		DocumentRunner dr = new DocumentRunner();
		dr.addNewFileToDatabase(Title, DocId, list);
	}
}
