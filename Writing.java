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
		                
		              //Reading data from cell	row and column both are there
		                sheet.getRow(2).getCell(1).setCellValue("Ofline");
		                //Row is there column is not there
		                sheet.getRow(2).createCell(2).setCellValue("input1"); 
		              //Row and   column both are not there
		                sheet.createRow(4).createCell(2).setCellValue("input2");
		                
		                
		                
		                wb.write(new FileOutputStream("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\Book.xlsx"));
		              	
		                
		                
	        }
}



