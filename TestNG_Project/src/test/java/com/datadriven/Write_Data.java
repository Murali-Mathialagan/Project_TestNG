package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static Logger log = Logger.getLogger(Write_Data.class);

	public static void write() throws IOException {

		BasicConfigurator.configure();
		
		File f = new File("E:\\Murali\\SDET\\Greens Class\\Maven Project\\Write Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Test Data").createRow(0).createCell(0).setCellValue("website");
		wb.getSheet("Test Data").getRow(0).createCell(1).setCellValue("userName");
		wb.getSheet("Test Data").getRow(0).createCell(2).setCellValue("password");
		wb.getSheet("Test Data").getRow(0).createCell(3).setCellValue("Fname");
		wb.getSheet("Test Data").getRow(0).createCell(4).setCellValue("Lname");
		
		wb.getSheet("Test Data").createRow(1).createCell(0).setCellValue("Adactin");
		wb.getSheet("Test Data").getRow(1).createCell(1).setCellValue("muralimariyan");
		wb.getSheet("Test Data").getRow(1).createCell(2).setCellValue("Murali@25");
		wb.getSheet("Test Data").getRow(1).createCell(3).setCellValue("Murali");
		wb.getSheet("Test Data").getRow(1).createCell(4).setCellValue("Mathiyalagan");
		
		wb.getSheet("Test Data").createRow(2).createCell(0).setCellValue("your logo");
		wb.getSheet("Test Data").getRow(2).createCell(1).setCellValue("muralimariyan8@gmail.com");
		wb.getSheet("Test Data").getRow(2).createCell(2).setCellValue("Abcd@123");
		wb.getSheet("Test Data").getRow(2).createCell(3).setCellValue("Murali");
		wb.getSheet("Test Data").getRow(2).createCell(4).setCellValue("Mathiyalagan");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		log.info("Write data Successfully");
		wb.close();

	}

	public static void main(String[] args) throws IOException {
		write();
	}

}
