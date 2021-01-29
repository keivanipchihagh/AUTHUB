package objectSerialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String fileAddress = "students.ser";
		ReadObjectFromFile read = null;
		WriteObjectToFile write = null;

		File students = new File(fileAddress);
		if (students.exists())
			students.delete();

		try {
			write = new WriteObjectToFile(fileAddress);
			read = new ReadObjectFromFile(fileAddress);

			write.writeToFile(new Student(17, "Ali", "Mohammadi", 17.5));
			write.writeToFile(new Student(19, "Mohammad", "Akbari", 16.75));

			write.closeConnection();

			// Reading the first student
			Student std = (Student) read.readFromFile();
			System.out.print(std.getAge() + "\t");
			System.out.print(std.getFamilyName() + "\t");
			System.out.print(std.getName() + "\t");
			System.out.print(std.getGrade() + "\t");
			System.out.println(std.isLegal());

			// Reading the second student
			Student std2 = (Student) read.readFromFile();
			System.out.print(std2.getAge() + "\t");
			System.out.print(std2.getFamilyName() + "\t");
			System.out.print(std2.getName() + "\t");
			System.out.print(std2.getGrade() + "\t");
			std2.calculateLegality();
			System.out.println(std2.isLegal());
			
			read.closeConnection();
			
		} catch (FileNotFoundException | EOFException | ClassNotFoundException e) {
			System.out.println("error writing to the file!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
