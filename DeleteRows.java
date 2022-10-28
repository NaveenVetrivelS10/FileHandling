package FileHandaling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DeleteRows 
{
	 public static void main(String[] args) throws Exception
	    {
	                File file = new File("D:/Trainning/FileHandling/Practice/Book.xlsx"); 
	                                                                                                
	                FileInputStream fis = new FileInputStream(file);
	     	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	                XSSFSheet sheet = wb.getSheet("sheet1");//ReadSheet
	                XSSFRow removeRow=sheet.getRow(2);
	                sheet.removeRow(removeRow);
	                FileOutputStream out=new FileOutputStream(new File("D:/Trainning/FileHandling/Practice/Book.xlsx"));
	                wb.write(out);
	                System.out.println("Row removed successfully");
	                wb.close();
	                fis.close();
	                
	                
	               
	               
}
}
