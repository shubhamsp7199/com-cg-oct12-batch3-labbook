package labbook_8;

import java.io.*;

/**
 * 
 *Write a program to do the following operations using Thread:
•	Create an user defined Thread class called as “CopyDataThread .java” .
•	This class will be designed to copy the content from one file “source.txt ” 
	to another file “target.txt” and after every 10 characters copied,   
	“10 characters are copied” message  will be shown to user.(Keep delay of 5 seconds after every 10 characters  read.)
•	Create another class “FileProgram.java” which will create above thread. 
	Pass required File Stream classes to   CopyDataThread constructor and implement the above functionality.

 *
 */

public class FileProgram {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File file = new File("File1");
		file.createNewFile();
		
		FileWriter f1 = new FileWriter(file);
		f1.write("Hi..!!! Have a nice day..!!!!");
		File f2 = new File("File2");

		CopyDataThread obj = new CopyDataThread(f1, f2);

	}

}