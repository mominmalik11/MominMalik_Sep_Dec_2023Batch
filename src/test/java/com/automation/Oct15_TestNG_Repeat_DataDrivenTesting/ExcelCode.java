package com.automation.Oct15_TestNG_Repeat_DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelCode {
	public WebDriver driver;
	public ChromeOptions options;
	
	
	
	@Test(dataProvider = "TNLogin")
	public void loginTNTest(String username, String password ) {// do not forget to parameterize this!
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("#input-email")).sendKeys(username);
		driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		Assert.assertTrue((driver.findElement(By.cssSelector("#column-right > div > a:nth-child(13)")).isDisplayed()));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
	}
	

	
	@DataProvider(name = "TNLogin")
	public Object[][] getExcelLoginData() throws Exception {
		
		Object[][] data = ExcelCode.readFromExcelSheet("LoginTN");// you use the class name above and method name below and @DataProvider name
		return data;
		
		//now you write test case above after making Object Array and DataProvider( this is the last thing you should add)
		
		
	}
	
	
	// create a Staic Method to write my excel code

	public static Object[][] readFromExcelSheet (String sheetName) throws Exception {// write excel code inside this method
		// Step 1 excelsheet is a file, so you use FileInputStream and create an object for it

		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\automation\\Oct15_TestNG_Repeat_DataDrivenTesting\\ExcelData.xlsx"); // pass excel sheet through this
				
		//Step 2- We used Properties Class to handle .properties file, in this case we will use XSSFWorkbook class to handle Excel sheet
		
		XSSFWorkbook workbook = new XSSFWorkbook(ip);// this ip reference shows where the excel file is located. It is also known as Workbook
		
		//Step 3- You have to address individual sheets in Workbook. Use the workbook reference to call specific methods
		
		XSSFSheet sheet = workbook.getSheet(sheetName);// this getSheet() method returns XSSFSheet
		
		//Step 4- you have to manage rows and cols. First you acknowledge the big work book, then the sheet name, then the rows/cols 
		
		int rows = sheet.getLastRowNum();//There might be a million rows so this ensures it takes care of the last row up
		int cols = sheet.getRow(0).getLastCellNum();// you use the row # to datamine cols #, not the other way around. Rows have cols but not all cols have rows
		
		//Step 5- you doing parameterization. why use excel? Not all data will fit in here so you need excel data as reference 
			//We have to implement @DataProvider.
			// what is Rule 1 of @dataProvider? It will return a 2-D Object Array RMR THIS
		//Create a 2-D object Array
		
		Object[][] data = new Object[rows][cols];// the above reference will take care of # of rows and cols
		// you need to traverse between the excel sheet to every row and col and use the data- this is done using nested for Loop
		
		//outer for loop- is for rows
		//inner for loop- is for cols
		
		for (int i = 0; i<rows; i++) {
			XSSFRow row =  sheet.getRow(i+1);// the data in excel starts on row 2 since row 1 is all headers//this is the outer for loop
			
			for(int j = 0; j<cols; j++) {// this is the outer for loop
			XSSFCell cell =	row.getCell(j);
			//another thing we need to take care of, the datatype present in individual column
			CellType celltype = cell.getCellType();//import using apachePOI not micrsoft
			
			switch(celltype) {// this lets you use different datatype that might be present in cols such as alphabet, numbers, decimals,symbols, etc
			case STRING:
				data[i][j] = cell.getStringCellValue();
				break;
				
			case NUMERIC:
				data [i][j] = Integer.toString((int)cell.getNumericCellValue());// you need to convert this to String using Wrapper Classes; aka converting phonenumber into string from int
				break;
				
			case BOOLEAN:// true or false	
				data[i][j] = cell.getBooleanCellValue();
				break;
		}
				
				
		}
					
		}
		
		//after swithcTO method return data;
		
		return data; // switch void up top to object array
		// now you create a @DataProvider
		
		
		
		
		}
	
	

}
