package multiThreadedHS.util;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import multiThreadedHS.driver.Driver;
import multiThreadedHS.util.Results;
import multiThreadedHS.threads.ThreadWorker;

public class FileProcessor {
	public FileProcessor(String filePath) {
		try {
			ThreadWorker.br = new BufferedReader(new FileReader(filePath));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}	

	public String readLine(BufferedReader br) {
	String line = "";
	try {
		line = br.readLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return line;
}
}
