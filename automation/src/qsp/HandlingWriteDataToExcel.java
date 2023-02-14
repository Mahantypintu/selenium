package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingWriteDataToExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("pass");
	//convert java readable form to external resource file(like excel)
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	// save the actual workbook in write mode
	wb.write(fos);
	// specific file should be close while writing data to excel;
	wb.close();
}
}
