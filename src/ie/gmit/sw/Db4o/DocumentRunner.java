package ie.gmit.sw.Db4o;

import com.db4o.*;
import com.db4o.config.*;
import com.db4o.query.*;
import com.db4o.ta.*;

import xtea_db4o.XTEA;
import xtea_db4o.XTeaEncryptionStorage;

import java.util.*;

import javax.servlet.ServletException;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class DocumentRunner {
	private ObjectContainer db = null;
	private List<Document> files = new ArrayList<Document>();

	public DocumentRunner() {
		
		init(); // Populate the customers collection

		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		config.common().add(new TransparentActivationSupport()); // Real lazy Saves all the config commented out below
		config.common().add(new TransparentPersistenceSupport()); // Lazier Saves all the config commented out below
		config.common().updateDepth(7); // Propagate updates
		config.file().storage(new XTeaEncryptionStorage("password", XTEA.ITERATIONS64));

		/*
		 * config.common().objectClass(Patient.class).cascadeOnUpdate(true);
		 * config.common().objectClass(Patient.class).cascadeOnActivate(true);
		 * config.common().objectClass(MDTReview.class).cascadeOnUpdate(true);
		 * config.common().objectClass(MDTReview.class).cascadeOnActivate(true);
		 * config.common().objectClass(User.class).cascadeOnUpdate(true);
		 * config.common().objectClass(HospitalList.class).cascadeOnUpdate(true)
		 * ; config.common().objectClass(TumourSet.class).cascadeOnUpdate(true);
		 * config.common().objectClass(GPLetter.class).cascadeOnUpdate(true);
		 */

		// Open a local database. Use Db4o.openServer(config, server, port) for
		// full client / server
		db = Db4oEmbedded.openFile(config, "files.data");
		addToDatabase();// call method on after init()  and db setup
	}
	
	/**
	 * calls the adds to database method 
	 * and adds the latest arraylist 
	 * of Document Objects
	 */
	private void addToDatabase() {
		for (Document d : files) {
			
			/*
			 * testing purposes
			 * to check if files are added correctly
			 */
			for (int i = 0; i < d.getList().size(); i++) {
				System.out.println("file line number :" + i + " --> " + d.getList().get(i).toString() + "\n");
			}
			db.store(d); // Adds the document object of files  to the database
		}
		db.commit(); // Commits the transaction
	}

	private void init() {
		ArrayList<String> doc = new ArrayList<String>();
		// The name of the file to open.
		String fileName = "files/bitcoin.txt";
		String fileName2 = "files/transactions.txt";
		String fileName3 = "files/ProofOfWork.txt";
		
		
		doc = Readfile.Readfile(fileName);
		Document D1 = new Document();
		D1.setDocumentID(1);
		D1.setList(doc);
		D1.setDocumentTitle(fileName);
		
		doc = Readfile.Readfile(fileName2);
		Document D2 = new Document();
		D2.setDocumentID(2);
		D2.setList(doc);
		D2.setDocumentTitle(fileName2);
		
		doc = Readfile.Readfile(fileName3);
		Document D3 = new Document();
		D3.setDocumentID(3);
		D3.setList(doc);
		D3.setDocumentTitle(fileName3);

		files.add(D1);
		files.add(D2);
		files.add(D3);
	}

	public static void main(String[] args)throws Exception{
		new DocumentRunner();
		System.out.println("being called");
	}
}
