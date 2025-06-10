package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {
  @Test
  public void f() throws Exception {
	  // Read the Data from Excel file. (spcify the file path )
	  //FileInputStream FI = new FileInputStream("C:\\Users\\mnara\\eclipse-workspace\\HybridFramework_Narayana\\src\\test\\resources\\testdata\\TestDataNew.xlsx");
	  FileInputStream FI = new FileInputStream(".\\src\\test\\resources\\testdata\\TestDataNew.xlsx");
	  Workbook w = new XSSFWorkbook(FI);
	  Sheet s = w.getSheet("Testabc");
	  Row r = s.getRow(1);
	  Cell emailAddress = r.getCell(0);
	  System.out.println(emailAddress.getStringCellValue());
	  
	  Cell passWord = r.getCell(5);
	  System.out.println(passWord.getStringCellValue());
	  
  }
}
