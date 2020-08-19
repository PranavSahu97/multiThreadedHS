package multiThreadedHS.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import multiThreadedHS.util.Results;
import multiThreadedHS.threads.ThreadWorker;
import multiThreadedHS.util.MergeSort;
import multiThreadedHS.util.MyLogger;
import multiThreadedHS.util.MyLogger.DebugLevel;

public class Driver{
	public static int N;
 	public static String inputFilePath1;
 	public static String outputFilePath;

 	public static void main(String[] args){
 			N=Integer.parseInt(args[0]);

 			if(N==1){
 			if ( (args.length != 4) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}") || args[3].equals("${arg3}")) {
		    
		    System.err.println("Error: Incorrect number of arguments. Program accepts 4 arguments.");
		    System.exit(0);
	    	}
	     }

 			else if(N==2){
 			if ( (args.length != 5) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}") || args[3].equals("${arg3}") || args[4].equals("${arg4}")) {
		    
		    System.err.println("Error: Incorrect number of arguments. Program accepts 5 arguments.");
		    System.exit(0);
	    	}
	     }

	    	else if(N==3){
 			if ( (args.length != 6) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}") || args[3].equals("${arg3}") || args[4].equals("${arg4}") || args[5].equals("${arg5}")) {
		    
		    System.err.println("Error: Incorrect number of arguments. Program accepts 6 arguments.");
		    System.exit(0);
	    	}
 		}
 		outputFilePath=args[N+1];
 		Results results=new Results();

 		int debugValue=Integer.parseInt(args[N+2]);
 		MyLogger.setDebugValue(debugValue);
 		/**
 		 * new data structure for overwriting data to solve the issue of duplication
 		 */
 		ArrayList<String> temp=new ArrayList<>();
 		if(N<1 || N>3){
 			System.out.println("Invalid Input");
 		}
 		else{
 		/**
 		 *for loop till N
 		 */ 
 		for(int i=0;i<N;i++)
		{	
			/**
			 *For Eg: If N=2, input file will be taken from args1 and args2
			 */
			inputFilePath1=args[i+1];
 			ThreadWorker t1=new ThreadWorker();
 			t1.fileInsert(args[i+1],results);
 			temp=(results.store);
 			t1.run();
		}
		System.out.println(temp);
		results.storeNewResults(temp.toString());
		results.print();
	}
  	}
}