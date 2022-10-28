package FileHandaling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormulaFunction 
{

		public static void main(String[] args) throws IOException
		{
			
			File file=new File("D:/Trainning/FileHandling/Practice/Book.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook book=new XSSFWorkbook(fis);
			XSSFSheet sheet=book.getSheet("Sheet2");
			sheet.getRow(5).getCell(2).setCellFormula("SUM(C2:C5)");
			fis.close();
			
			FileOutputStream fos=new FileOutputStream(file);
			book.write(fos);
			book.close();
			fos.close();
			
			System.out.println("D:/Trainning/FileHandling/Practice/Book.xlsx");
		}

	}

