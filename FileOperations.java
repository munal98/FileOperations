import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students:");
		int n = sc.nextInt();
		
		generateStudentData (n);

	}

	private static void generateStudentData(int n) throws IOException {
		Random r = new Random();		
		FileWriter writer = new FileWriter("students.txt");
		
		for (int i = 0; i < n; i++) {
			//[0-1000] - [0-100], [0-100], [0-100]
			String info = "";
			//Öğrenci no
			info += r.nextInt(1000);
			info += " - ";
			//not1
			info += r.nextInt(100);
			info += ", ";
			//not2
			info += r.nextInt(100);
			info += ", ";
			//not3
			info += r.nextInt(100);
			info += "\n";
			System.out.println(info);
			writer.append(info);			
		}
		writer.close();		
	}	
	
	
	

}
