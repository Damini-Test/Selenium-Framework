package PracticeForInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\\\Users\\\\91899\\\\OneDrive\\\\Registration1.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook workbook = new WorkbookFactory.create(f);

		Sheet sheet = workbook.getSheet("");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(2);

		String data = cell.toString();
		System.out.println(data);

	}

}
