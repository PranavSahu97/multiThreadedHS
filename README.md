# multiThreadedHS

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in multiThreadedHS/src folder.

-----------------------------------------------------------------------
## Instruction to clean:
Go into the src folder and compile
####Command: ant clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:
Go into the src folder and compile
####Command: ant all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:
Go into the src folder and compile
####Command: 
ant run -Dargs="Value of N input_file output_file debugger_value"

Example:

The last argument is the Logger value. 
ant run -Darg="2 input1.txt input2.txt output.txt 1"


-----------------------------------------------------------------------
## Description
Assignment Goal
Apply the design principles you have learned so far to develop a multi-threaded sort program.
Team Work
•	You need to work alone on this assignment.
•	You cannot discuss with anyone the design pattern(s) to be used for this assignment.
Programming Language
You are required to use Java.
Compilation Method
•	You are required to use ANT to compile the code.
Policy on sharing of code
•  EVERY line of code that you submit in this assignment should be written by you. Do NOT show your code to any other group. Our code-comparison software can very easily detect similarities.
•  Post to the listserv if you have any questions about the requirements. Do NOT post your code to the listserv asking for help with debugging. However, it is okay to post design/concept questions on programming in Java/C/C++.
Project Description
Multi-threaded Fan-in for Heap Merge sort
•	Assume that there are N number of input files, the names of which will be provided to you in the command line. The value of N will also be provided in the command line. It will be the first command line argument. Validate that the value of N is between 1 to 3. Each input file will have well formed 4 digit integers varying from 00000 to 99999. For example, input1.txt could have such values.
•	12345
•	23455
•	12345
•	12345
•	12345
•	23455
•	34255
•	Here is an example of what you you should accept from the following args: N input1.txt, input2.txt, input3.txt output.txt debugValue
•	Spawn N threads to read from the input file. Depending on the value of N, create N appropriate data structures to store the input values. Each thread should do the following:
o	Thread-M should read from inputM.txt and store the values in an appropriate data structure.
o	The data in the data structure should be sorted (write your own sort method, instead of using an in-built sort method. If you use code from anywhere for sorting, you are required to cite it both in the Java class file and also in your README.md)).
o	Thread-M should insert/write its data into a data structure in Results.java that is shared by all the threads. Do not make anyting static in Results; instead pass the same reference of Results to all threads. You should not do a sorted insert in Results, but intead try to insert in the first available slot in the data structure. Use a synchronized method in Results to insert or use a data structure in Results that is synchronized by default.
•	You should use the join call to wait for the N threads to read from the input files and store their data in the shared data structure.
•	Perform Merge Sort on the shared data structure. [If you use code from another source for merge-sort, you should cite it in the class file where you have the code, and also in the README.md file.]
•	From the Driver, call a method on the results instance to print the contents of Results in output.txt in ascending order.
•	The inputs may not be unique (some entries may repeat). So, they should also be repeated in output.txt.
•	Your driver code should do the following:
o	Read command line arguments.
o	Create an instance of Results
o	Create N threaded Objects (instances of ThreadWorker class). You can pass the reference to Results in the constructor of each ThreadedWorker.
o	Start the N threaded Objects
o	
o	Call an instance of the class in util/ package that does merge sort, and pass it an instance of Results so it can access the data that was written by all the threads.
o	After the Merge sort is completed, call a method in Results, via the method in FileDisplayInterface, to write the data stored in Results to output.txt,which should be in non-descreasing order if merge sort succeeded.
o	In your README.md, briefly justify your choice of data structures in this assignment.
o	Create and use your own MyLogger scheme for debugging. Use the Logger to ensure that all N threads ran.
Code Organization
•	Your directory structure should be the following:
•	 -firstName_lastName_assign_4
•	   ---multiThreadedHS
•	   ----- README.md
•	     ----- src
•	          ----- build.xml
•	          ---multiThreadedHS
•	       	   ----------driver
•	           -----------------Driver.java
•	           ----------util
•	           -----------------HeapSort.java
•		   -----------------Results.java
•		   -----------------FileProcessor.java
•	      	   -----------------FileDisplayInterface.java	   
•	   	   -----------------StdoutDisplayInterface.java
•	      	   -----------------MyLogger.java	   
•	           ----------threads
•		   -----------------ThreadWorker.java
•	           ----------other packages and classes that you need
•	




-----------------------------------------------------------------------
## Justification
->I created a thread object in a for loop in the driver file. So based on value of N, I spawn that many threads.
->The thread object call the fileInsert function and then calls run function.
->In the ThreadWorker class, I have a fileInsert function  which reads file input and stores in the data stucture that is 
a List. 
->So based on the input N, that many lists are created. 
-> Once the data structures are created, I add all of them to the ArrayList created in Results class. 
->After all lists are added to that ArrayList, I call the Merge Sort to sort the data and then write the sorted data to the output file.  

####Time complexity
->Adding data to the ArrayList takes a time complexity of O(n).
->Time complexity of Merge Sort Algorithm is o(n * log n).

#### Driver.java
Contains the main method.

####ThreadWorker.java
Contains the main logic for creating Data Structures for every new thread. 

####MyLogger.java
Debug Values Added.

####Reference for Merge Sort
https://www.codexpedia.com/java/java-merge-sort-implementation/


-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: 07/22/2019.


