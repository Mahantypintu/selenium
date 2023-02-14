package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingReadDataExcel {
 public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	// to load and read the excel file
	Workbook wb = WorkbookFactory.create(fis);
	//get control of sheet,row,cell and then read
	String data = wb.getSheet("Create Customer").getRow(1).getCell(2).getStringCellValue();
	System.out.println(data);
}
}
