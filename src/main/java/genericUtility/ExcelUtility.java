package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {

	/**
	 * This is the generic method to fetch single cell data from Excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;
	}
	
	/**
	 * This is a generic method to write data to Excel File
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataToExcel(String sheetName, int rowIndex, int cellIndex,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell =  wb.getSheet(sheetName).getRow(rowIndex).createCell(cellIndex);
		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
	}
}      