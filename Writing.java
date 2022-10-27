package FileHandaling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 


public class Writing 
{
		    public static void main(String[] args) throws Exception
		    {
		                File file = new File("D:/Trainning/FileHandling/Practice/SubFolder/Book.xlsx"); 
		                                                                                                
		                FileInputStream fis = new FileInputStream(file);
		     	        XSSFWorkbook wb = new XSSFWorkbook(fis);
		                XSSFSheet sheet = wb.getSheet("sheet2");//ReadSheet
		                String data=sheet.getRow(2).getCell(1).toString();
		                System.out.println(data);
		                //update to leave to ofline
		                sheet.getRow(2).getCell(1).setCellValue("Ofline");     //Reading data from cell	row and column both are there
		                sheet.getRow(2).createCell(2).setCellValue("input1");   //Row is there column is not there
		                sheet.createRow(4).createCell(2).setCellValue("input2");//Row and   column both are not there
		                
		                
		                wb.write(new FileOutputStream("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\Book.xlsx"));
		              	
		                
		                
	        }
}



