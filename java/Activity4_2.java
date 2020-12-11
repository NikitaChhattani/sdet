package JavaActivity8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\NikitaChhattani\\Desktop\\Defects.txt");
		//boolean fstatus=file.createNewFile();
		
		File FileUtil=FileUtils.getFile("C:\\Users\\NikitaChhattani\\Desktop\\Defects.txt");
		System.out.println("Data in the file :"+FileUtils.readFileToString(FileUtil, "UTF8"));
		
		File destdirectory= new File("C:\\Users\\NikitaChhattani\\Desktop\\PythonWork2");
		FileUtils.copyFileToDirectory(file, destdirectory);
		
		File newFile= FileUtils.getFile(destdirectory, "newFile.txt");
		String newFileData=FileUtils.readFileToString(newFile, "UTF8");
		
		System.out.println("Data in directory file :"+newFileData);
		
		
		
	}

}
