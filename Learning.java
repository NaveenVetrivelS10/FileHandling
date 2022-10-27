package FileHandaling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Learning 
{
	    public static void main(String[] args) throws IOException 
	    {
	                File file = new File("D:/Trainning/FileHandling/Practice/SubFolder/Book.xlsx"); 
	                                                                                                
	                FileInputStream fis = new FileInputStream(file);
	     	          XSSFWorkbook wb = new XSSFWorkbook(fis);
	                XSSFSheet sheet = wb.getSheetAt(0);
	                int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	                for(int i=0;i<rowCount+1;i++)
	                {
	                	Row row=sheet.getRow(i);
	                
	                for(int j=0;j<row.getLastCellNum();j++)	
	                {
	            	   System.out.println(row.getCell(j).getStringCellValue());
	                }
	                System.out.println();
	                }
	    
        }
}

