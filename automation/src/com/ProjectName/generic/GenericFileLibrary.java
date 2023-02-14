package com.ProjectName.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is generic class for data driven testing
 * @author Pintu
 *
 */
public class GenericFileLibrary {
/**
 * This is generic method to read data from property file
 * @param key
 * @return
 * @throws IOException
 */
 public String getPropertyData(String key) throws IOException
 {
	FileInputStream fis= new FileInputStream("./data/commondata.property");
	Properties p= new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	 return data;
 }
 /**
  * This is generic method to read data from excel file
  * @param sheet
  * @param row
  * @param cell
  * @return
  * @throws EncryptedDocumentException
  * @throws IOException
  */
 public String getExcelData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
 {
	 FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	 return data;
 }
 /**
  * This is generic method to write data to excel file
  * @param sheet
  * @param row
  * @param cell
  * @param value
  * @throws EncryptedDocumentException
  * @throws IOException
  */
 public void setExcelData(String sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException
 {
    FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
 }
}
