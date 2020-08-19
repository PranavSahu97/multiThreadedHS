package multiThreadedHS.threads;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

import multiThreadedHS.driver.Driver;
import multiThreadedHS.util.MergeSort;
import multiThreadedHS.util.Results;
import multiThreadedHS.util.FileProcessor;
import multiThreadedHS.util.MyLogger;
import multiThreadedHS.util.MyLogger.DebugLevel;


/**
 * @author Pranav Sahu
 *
 */
public class ThreadWorker implements Runnable {
	public static BufferedReader br=null;
	/**
	 *list that stores each value read from file
	 */
	List <String> myList=new ArrayList<String>();
	MergeSort sortFunction = new MergeSort();
	
	/**
	 * made use of synchronized function so threads spawn one after the other
	 */
	public synchronized void fileInsert(String args, Results results){
		String line="";
		
		FileProcessor fileProcessor = new FileProcessor(Driver.inputFilePath1);
		while (br != null) {
			line = fileProcessor.readLine(br);
			if (line == null) {
				break;
			}
			/**
			 *line should be inserted in list
			 */
			myList.add(line);
			MyLogger.writeMessage("Insertion done in list",DebugLevel.INSERT);
			try {
				
			}catch(NumberFormatException e) {
				System.exit(0);
			}
		
		}
		
		/**
		 *add all lists created when thread is created into the common list data structure defined in results
		 */ 
		
	 	results.store.addAll(myList);
	 	 /**
	 	  *call the merge sort function to sort data in the ArrayList
	 	  */
	 	sortFunction.mergeSort(results.store);
	 	MyLogger.writeMessage("Sorting done in list", DebugLevel.SORT);
	 	
       for(int i=0;i<results.store.size();i++)
			System.out.println("l:"+results.store.get(i));
			
	}

	 public void run(){
       }	
}

