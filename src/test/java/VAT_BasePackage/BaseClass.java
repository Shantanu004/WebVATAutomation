package VAT_BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

	public static WebDriver driver = null;
	public Properties propForVat;
	public Properties DataPropForVat;
	
	public void loadPropertiesFileOfVAT() {
		
		propForVat = new Properties();
		File BaseDatafile = new File(System.getProperty("user.dir") +"\\BaseInfoConfig");
		try {
			FileInputStream BaseDatafis = new FileInputStream(BaseDatafile);
			propForVat.load(BaseDatafis);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	
	DataPropForVat = new Properties();
	File TestDatafile = new File(System.getProperty("user.dir")+"\\TestDataConfigForVAT");
	try {
		FileInputStream TestDatafis = new FileInputStream(TestDatafile);
		DataPropForVat.load(TestDatafis);	
	} catch (Throwable e) {
		e.printStackTrace();
	}
	}
	
	public  WebDriver intilizeBrowserAndOpenApplicationURL(String browserName) {
		if(browserName.equals("chrome")){
			driver = new ChromeDriver();
		}else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if(browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		return driver;
		}
	
	public static String generateChallanNoValueDynamically() {
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatter);
		return "Challan"+formattedTime;
	}
	
	public static Object[][] getTestDataFromExcel(String sheetName){
		XSSFWorkbook workbook = null; 
		File excelfile = new File(System.getProperty("user.dir")+"\\VatLoginCredentials.xlsx");
		try {
			FileInputStream fisExcel = new FileInputStream(excelfile);
			workbook = new XSSFWorkbook(fisExcel); 
		}catch(Throwable e){
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];

		for(int i = 0;i<rows;i++) {
			XSSFRow row = sheet.getRow(i+1);

			for(int j=0;j<cols;j++) {
				XSSFCell cell= row.getCell(j);
				CellType cellType = cell.getCellType();

				switch (cellType) { 
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;

				case NUMERIC:
					data[i][j] =  Integer.toString((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
				}
			}
		}

		return data;

	}
}
