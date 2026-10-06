package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

//fetching exisisting sheet and row and updating the cell value
public class WritingDataToExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Appu\\OneDrive\\Desktop\\SeleniumNotebook\\ExceleSheets\\Flowers.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		//fetching exisisting sheet and row and updating the cell value
//		Cell cell = wb.getSheet("Animal").getRow(3).createCell(1);
//		cell.setCellValue("Rhino");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Appu\\OneDrive\\Desktop\\SeleniumNotebook\\ExceleSheets\\Flowers.xlsx");
//		wb.write(fos);
		
		ExcelUtility eutil = new ExcelUtility();
		eutil.writeDataToExcel("Actors", 4, 3, "Surya");
	}
}
