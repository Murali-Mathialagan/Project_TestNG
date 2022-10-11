package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void all_Data() throws IOException {
		File f = new File("E:\\Murali\\SDET\\Greens Class\\Maven Project\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		// connect with row --> traverse through all the rows by using for loop
		// for calculate the number of rows by using getPhysicalNumberOfRows()
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			// Connect with Cell --> traverse through all the cells by using for loop
			// for calculate the number of cells by using getPhysicalNumberOfCells()
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				// check the cell type
				CellType type = c.getCellType();
				// specified object is equal to the enum Constant
				if (type.equals(CellType.STRING)) {
					String value = c.getStringCellValue();
					System.out.println(value);
					
				} else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					// convert double to int
					int a = (int) d; // --> Narrowing type casting 
					// convert int to String
					String value = String.valueOf(a);
					System.out.println(value);

				}

			}
		}
		wb.close();
	}

	public static void particular_Row_Data() throws IOException {
		File f = new File("E:\\Murali\\SDET\\Greens Class\\Maven Project\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);
			} else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();
				int a = (int) d;
				String value = String.valueOf(a);
				System.out.println(value);
			}
		}
		wb.close();
	}

	public static void particular_Column_Data() throws IOException {
		File f = new File("E:\\Murali\\SDET\\Greens Class\\Maven Project\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(2);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);
			} else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();
				int a = (int) d;
				String value = String.valueOf(a);
				System.out.println(value);

			}
		}
		wb.close();
	}

	public static void particular_Cell_data() throws IOException {
		File f = new File("E:\\Murali\\SDET\\Greens Class\\Maven Project\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);

		} else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int i = (int) d;
			String value = String.valueOf(i);
			System.out.println(value);
		}
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		all_Data();
		particular_Row_Data();
		particular_Column_Data();
		particular_Cell_data();
	}

}
