package FileHandaling;

import java.io.File;

public class SubFolder 
{
		public static void main(String[] args) 
		{
	        File folder=new File("D:\\Trainning\\FileHandling\\Practice\\SubFolder");
	        boolean present=folder.exists();
	        System.out.println(" Folder created: "+" "+present);
	        if(present ==false)
	        {
	            folder.mkdirs();
	        }
	        present=folder.exists();
	        System.out.println("Already folder created: "+" "+present);
	    }

}


