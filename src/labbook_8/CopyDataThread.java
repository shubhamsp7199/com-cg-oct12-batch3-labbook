package labbook_8;

import java.io.*;

public class CopyDataThread extends Thread {

	public CopyDataThread(FileWriter f1, File f2) throws IOException, InterruptedException {

		
		FileReader fileread = new FileReader("f1");
		
		int a = fileread.read();
		
		FileWriter fw = new FileWriter(f2);
		int i = 0;
		
		while (a != -1) {
			fw.write((char) a);
			i++;
			
			if (i % 10 == 0) {
				System.out.println("10 characters are copied");
				sleep(500);
			}
			a = fileread.read();

		}
	}
}