package com.TestNG.Oct1;


public class ExcelSheet_DataProvider {
	
	//step 0 add poi apache dependencies in pom.xml file
	// step 1 create or use the created excel sheet which has the data
	// step 2 make sure the sheet names are correct 
	// step 3 copy the excel sheet and put it inside the package where you want to keep your code 
	// step 4 make sure excel sheet is updated, you cant change it after its copied
	// step 5 create the Object of FileInputStream class and pass the path of the excel sheet in its constructor 
public void excel_SheetTN(String sheetName) {//if your excel sheet has multiple tabs this is how you specify which tab to use
	
	// step 5 create the Object of FileInputStream class and pass the path of the excel sheet in its constructor 
	//FileInputStream ip = new FileInputStream();
	//step 6 Create the Object of XSSFworkbook class
	//XSSFWorkbook workbook = new XSSFWorkbook(ip);
	//step 7 use the workbook reference to address individual sheets
	//XSSFSheet sheet = ((XSSFWorkbook) workbook).get(sheetName);// specify what sheet you want to use
	// step 8 identify the rows and columns of each sheet 
	//int rows = sheet.getLastRowNum();// gives you total num or rows
	//int cols = sheet.getRow(0).getLastCellNum();//gives total num of cols 
	//step 9 Create a 2-Dimensional Object Array and then return the object array 
	//Object[][] data = new Object[rows][cols];
	//for (int i=0; i<rows; i++) {
		//XSSFRow row = sheet.getRow(i+1);
		//for(int j =0; j<cols; j++) {
			//XSSFCell cell = row.getCell(j);
			//CellType celltype = cell.getCellType();
			
			//switch(celltype) {
			//case STRING:
				//data[i][j] = cell.getStringCellValue();
				
			//case NUMERIC:
				//data[i][j] = Integer.toString((int)cell.getNumericCellValue());
		}
	
	
	


}


