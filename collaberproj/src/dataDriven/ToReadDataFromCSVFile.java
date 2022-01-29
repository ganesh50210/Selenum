package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ToReadDataFromCSVFile {

	public static void main(String[] args) throws Exception  {
		 
		FileReader   fr=new FileReader("./testResource/testData.csv");
		CSVReader csvreader=new CSVReader(fr);
		String[] userdata = csvreader.readNext();
		System.out.print(userdata[4]);
		

	}

}
