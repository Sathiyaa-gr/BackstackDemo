package demoUtility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataFetching {
	@DataProvider(name="logindetails")
	public Object[][] getExceldata() throws IOException  {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\anbuj\\eclipse-workspace\\bstackdemoProject1\\src\\test\\java\\demoUtility\\login.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet s1=  wb.getSheet("Valid");
        
        int rowcount=s1.getPhysicalNumberOfRows();
        int colcount=s1.getRow(0).getPhysicalNumberOfCells();
        
        Object[][] data = new Object[rowcount - 1][colcount]; // Skip header
        DataFormatter format = new DataFormatter();
       
        for (int i = 1; i < rowcount; i++) {
            Row row = s1.getRow(i);
            for (int j = 0; j < colcount; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] =format.formatCellValue(cell) ; // convert to string
            }
        }
        wb.close();
        fis.close();
        return data ;
        
	}
	

}
