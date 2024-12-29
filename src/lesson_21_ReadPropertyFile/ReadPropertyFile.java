package lesson_21_ReadPropertyFile;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		FileReader fileReader = new FileReader("C:\\Users\\HP\\eclipse-workspace\\JavaLessons\\src\\lesson_21_ReadPropertyFile\\config.properties");
		properties.load(fileReader);
		System.out.println(properties.getProperty("URL"));
		System.out.println(properties.getProperty("User"));
		System.out.println(properties.getProperty("Password"));

	}

}
