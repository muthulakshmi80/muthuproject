package readfile1;


import java.io.File;
import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import utilityClasses.TestListener;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfile1 {


	public static XSSFSheet excelSheet;
	public static XSSFCell cell;
	public static WebDriver driver;
	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// workbook = WorkbookFactory.create(new File("D:\\VA\\Infy\\excel\\macro_enabled.xls"));

		excelSheet = Readfile1.excelSheet("C:\\Users\\laksh\\Desktop\\check.xlsx", "FILE HANDLE");
		for (int i = 0; i<= 50; i++) {
			// Load URL getting.
			driver.get("https://rezerwacja.luxmed.pl/start/portalpacjenta");
			// Locate element for login and password input and send data to inputs.
		//	driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(5) > a:nth-child(2) > font:nth-child(1) > font:nth-child(1)")).click();
		//	driver.navigate().to("https://www.luxmed.pl/");
			driver.findElement(By.cssSelector("input[placeholder='Login']"))
			.sendKeys(excelSheet.getRow(i).getCell(0).getStringCellValue());
			driver.findElement(By.xpath("//input[@placeholder='Password']"))
			.sendKeys(excelSheet.getRow(i).getCell(1).getStringCellValue());
			// Click to the button for login.
			driver.findElement(By.xpath("//form[@action='https://portalpacjenta.luxmed.pl/PatientPortal/Account/LogIn']//div//div//button[@type='submit']")).click();
		}
		driver.close();
	}
	public static XSSFSheet excelSheet(String Path, String SheetName) {

		try {
			System.out.println(Path);
			// Open the Excel file
			File excel = new File(Path);
			FileInputStream fis = new FileInputStream(excel);
			XSSFWorkbook book = new XSSFWorkbook(fis); 
			XSSFSheet sheet = book.getSheetAt(0);

		
			
		/*	FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);*/
		} catch (Exception e) {
			System.out.println(e);
		}//catch
		return null;
	}
	

}




/*	public static  void main(String args[]) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.luxmed.pl/");
		driver.manage().window().maximize();
		File file =    new File("C:\\Users\\laksh\\Desktop\\check.xls");


		FileInputStream inputStream = new FileInputStream(file);


		HSSFWorkbook wb=new HSSFWorkbook(inputStream);

		HSSFSheet sheet=wb.getSheet("FILE HANDLE");
		//Iterate through each row from first sheet
		Iterator<Row> rowIterator = sheet.iterator();


		while (rowIterator.hasNext())
		{
			Row row = rowIterator.next();

			//For each row iterate through each columns
			Iterator <Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext())
			{

				Cell cell = cellIterator.next();
				if(cell.getColumnIndex()==0)
				{
					
					driver.findElement(By.xpath("//*[@id=\"headerTop\"]/p/a[1]")).click();
					 driver.findElement(By.name("Login")).sendKeys(cell.getStringCellValue());
					 driver.findElement(By.name("Password")).sendKeys(cell.getStringCellValue());
					 driver.findElement(By.xpath("//*[@id=\"ShowSignsLogInRow\"]/button")).click();
					 Thread.sleep(30);
				}
				        
			}
			
		}


	}*/
	
	
	
	
	
//}


