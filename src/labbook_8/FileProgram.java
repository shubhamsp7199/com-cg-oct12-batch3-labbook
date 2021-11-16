package labbook_8;

import java.io.*;

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