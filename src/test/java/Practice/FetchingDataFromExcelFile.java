package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Appu\\OneDrive\\Desktop\\SeleniumNotebook\\ExceleSheets\\Flowers.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Flowers");
//		Row r = sh.getRow(2);
//		Cell c = r.getCell(2);
////		String value = c.getStringCellValue();
//		DataFormatter df = new DataFormatter();
//		String value = df.formatCellValue(c);
//		System.out.println(value);
		
		ExcelUtility eu = new ExcelUtility();
		String value1 = eu.getDataFromExcel("Flowers", 3, 4);
		System.out.println(value1);
		
		String value2 = eu.getDataFromExcel("animal", 3, 3);
		System.out.println(value2);
		
		String value3 = eu.getDataFromExcel("actors", 3, 3);
		System.out.println(value3);
	}
}
