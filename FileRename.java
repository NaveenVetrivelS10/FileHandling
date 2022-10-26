package FileHandaling;

import java.io.File;

public class FileRename 
{
	public static void main(String[] args) 
				{	
		            File folder=new File("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\test.xlsx");
		            
			        File newName=new File("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\Renamed.xlsx");
			        boolean renameSuccess=folder.renameTo(newName);
			        System.out.println("renameSuccess "+ newName);
			        
			      
				}

}
