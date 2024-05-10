package org.UtilsClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginDataProvider {

	public static String[][] getData() {

		String file_Location = "D:\\eclipseworkspace\\Naukri\\TestData\\LoginTestData.xlsx";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file_Location);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i<=lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i - 1][j] = stringCellValue;
			}

		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

}
