package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import ie.gmit.sw.Db4o.DocumentRunner;

public class ComparatorImpl extends UnicastRemoteObject implements Comparator {
	
	private static final long serialVersionUID = 1L;
	private DocumentRunner Dr; ArrayList<String> list2 = new ArrayList<String>();
	protected ComparatorImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	
		
	}

	@Override
	public void Compare(ArrayList<String> list1) {
				
		
	}
}
