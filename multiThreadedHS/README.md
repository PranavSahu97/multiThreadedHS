# CSX42: Assignment 4
## Name: Pranav Sahu.

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
## Description:
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


