package FileHandaling;

import java.io.File;

public class Delete 
{
	
			public static void main(String[] args) 
			{
				 File folder=new File("D:\\Trainning\\FileHandling\\Practice\\SubFolder\\test.xlsx");
				 folder.delete();
		        boolean present=folder.exists();
		        System.out.println(" File present: "+" "+present);
		        

			}



}
