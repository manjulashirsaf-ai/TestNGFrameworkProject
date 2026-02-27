package MostAksed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {

		//#1 : Using FileReader & BufferedReader
		FileReader fileRead = new FileReader("C:\\Users\\rajas\\OneDrive\\Desktop\\Hi.txt");
		BufferedReader buffRead = new BufferedReader(fileRead);
		
		String str;
		while((str = buffRead.readLine()) != null) {
			
			System.out.println(str);
		}
		
		buffRead.close();
		
		//#2 - Using File & Scanner
		File file = new File("C:\\Users\\rajas\\OneDrive\\Desktop\\Hi.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}
		
		//#3 - 
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter("\\Z");
		System.out.println(scanner.next());
		
		//#1 - Writing to File using FileWriter & BufferedWriter
		FileWriter fileWrite = new FileWriter("C:\\Users\\rajas\\OneDrive\\Desktop\\Hello.txt");
		BufferedWriter buffWrite = new BufferedWriter(fileWrite);
		
		buffWrite.write("Hello, I Love both Selenium & JAVA");
		buffWrite.write("\n");
		buffWrite.write("But most of all, I Love Coding");
		buffWrite.newLine();
		buffWrite.write("Ok then let's call it off");
		buffWrite.newLine();
		buffWrite.append("Finished !!!!");
		
		buffWrite.close();
		System.out.println("Finished writing to a file");
	}
}
