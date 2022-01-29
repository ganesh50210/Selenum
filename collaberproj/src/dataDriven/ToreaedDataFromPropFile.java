package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToreaedDataFromPropFile {

	public static void main(String[] args) throws IOException {
		  FileInputStream fis=new  FileInputStream("./testResource/testData.properties" );
		  Properties prop=new Properties();
		  prop.load(fis);
		  System.out.print(prop.getProperty("defaultUsername"));
		  
		  
	}

}
