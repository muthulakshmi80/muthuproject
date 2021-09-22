package luxuser;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*public class ReadExcelFile {
	
	
	
	    public static  void main(String args[]) throws IOException {
	        
	        File file =    new File("C:\\Users\\laksh\\Desktop\\check.xls");

	        
	        FileInputStream inputStream = new FileInputStream(file);

	       
	        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
	        
	        HSSFSheet sheet=wb.getSheet("FILE HANDLE");
	        
	       
	        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        
	        for(int i=0;i<=rowCount;i++){
	            
	           
	            int cellcount=sheet.getRow(i).getLastCellNum();
	            
	           
	            System.out.println("Row"+ i+" data is :");
	            
	            for(int j=0;j<cellcount;j++){
	                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
	            }
	            System.out.println();
	        }
	    }
	}*/

public class ReadExcelFile {

	public static  void main(String args[]) throws IOException {

		
		File file =    new File("C:\\Users\\laksh\\Desktop\\check.xls");
		
		FileInputStream inputStream = new FileInputStream(file);

		HSSFWorkbook wb=new HSSFWorkbook(inputStream);

		
		HSSFSheet sheet=wb.getSheet("FILE HANDLE");


		HSSFRow row2=sheet.getRow(0);

		HSSFCell cell=row2.getCell(1);
		HSSFCell cell1=row2.getCell(2);
		HSSFCell cell2=row2.getCell(3);
		HSSFCell cell3=row2.getCell(4);
		

		
		String user= cell.getStringCellValue();
		String user1= cell1.getStringCellValue();
		String user2= cell2.getStringCellValue();
		String user3= cell3.getStringCellValue();

		//Printing the address
		System.out.println("Username is:"+ user);
		System.out.println("Username is:"+ user1);
		System.out.println("Username is:"+ user2);
		System.out.println("Username is:"+ user3);
		
	}
}
