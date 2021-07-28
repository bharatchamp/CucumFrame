package ExcelUtility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetReadData {
	
	public static String  readData(String path,int row,int col) {
		
		String data="";
		try {
			
			FileInputStream fs = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheetAt(0);
			data = sheet.getRow(row).getCell(col).getStringCellValue();
			
			
		} catch (Exception e) {


			System.out.println("issuu in readdata");
		}
		return data;
		
	}
}
