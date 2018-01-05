package ie.gmit.sw;


import com.db4o.*;
import com.db4o.config.*;
import com.db4o.query.*;
import com.db4o.ta.*;

import xtea_db4o.XTEA;
import xtea_db4o.XTeaEncryptionStorage;

import java.util.*;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocumentRunner {
	private ObjectContainer db = null;
	private List<Document> files = new ArrayList<Document>();
	
	public DocumentRunner() {
		init(); //Populate the customers collection
		
		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		config.common().add(new TransparentActivationSupport()); //Real lazy. Saves all the config commented out below
		config.common().add(new TransparentPersistenceSupport()); //Lazier still. Saves all the config commented out below
		config.common().updateDepth(7); //Propagate updates
		
		//Use the XTea lib for encryption. The basic Db4O container only has a Caesar cypher... Dicas quod non est ita!
		config.file().storage(new XTeaEncryptionStorage("password", XTEA.ITERATIONS64));
		
		/*
		config.common().objectClass(Patient.class).cascadeOnUpdate(true);
		config.common().objectClass(Patient.class).cascadeOnActivate(true);
		config.common().objectClass(MDTReview.class).cascadeOnUpdate(true);
		config.common().objectClass(MDTReview.class).cascadeOnActivate(true);
		config.common().objectClass(User.class).cascadeOnUpdate(true);
		config.common().objectClass(HospitalList.class).cascadeOnUpdate(true);
		config.common().objectClass(TumourSet.class).cascadeOnUpdate(true);
		config.common().objectClass(GPLetter.class).cascadeOnUpdate(true);
		*/

		//Open a local database. Use Db4o.openServer(config, server, port) for full client / server
		db = Db4oEmbedded.openFile(config, "files.data");
		
		addToDatabase();
	}
	
	private void addToDatabase(){
		for (Document d: files){
			
			for(int i = 0 ; i < d.getList().size(); i++){
				System.out.println("file ->" + d.getList().get(i).toString()+ "\n");
			}
			db.store(d); //Adds the customer object to the database
		}
		db.commit(); //Commits the transaction
		//db.rollback(); //Rolls back the transaction
	}
	
	
	
	private void init(){
		ArrayList<String> doc = new ArrayList<String>();
		 // The name of the file to open.
        String fileName = "files/bitcoin.txt";
        
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	doc.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "file not found '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
		
		Document D1 = new Document();
		D1.setDocumentTitle(fileName);
		D1.setList(doc);
		
		files.add(D1);
		
	}

	public static void main(String[] args) {
		new DocumentRunner();
	}
}
