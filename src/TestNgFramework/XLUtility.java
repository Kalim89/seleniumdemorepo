package TestNgFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility
{
	public FileInputStream fis;
	public	FileOutputStream fos;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
    String path=null;
    
    XLUtility(String path)
    {
    	path=this.path;
    }
     
    public int getRowNum(String sheetName) throws IOException
    {
    	fis=new FileInputStream(path);
    	workbook=new XSSFWorkbook(fis);
    	sheet=workbook.getSheet(sheetName);
    	int rowcount =sheet.getLastRowNum();
    	workbook.close();
    	fis.close();
    	return rowcount;
    }
    
    public int getCellNum(String sheetname,int rownum) throws IOException
    {
    	fis=new FileInputStream(path);
    	workbook=new XSSFWorkbook(fis);
    	sheet=workbook.getSheet(sheetname);
    	row=sheet.getRow(rownum);
    	int cellcount=row.getLastCellNum();
    	workbook.close();
    	fis.close();
    	return cellcount;
    	
    	
    }
    public String getCellData(String sheetname,int rownum,int colnum) throws IOException
    {
    	fis=new FileInputStream(path);
    	workbook = new XSSFWorkbook(fis);
    	sheet=workbook.getSheet(sheetname);
    	row=sheet.getRow(rownum);
    	cell=row.getCell(colnum);
        DataFormatter formatter= new DataFormatter();
        String data;
        try {
        	data=formatter.formatCellValue(cell);
        }
        catch(Exception e)
        {
        	data="";
        }
        workbook.close();
        fis.close();
        return data;
    	
    }
    public void setCellData(String sheetname,int rownum,int colnum,String data) throws IOException
    {
    	fis= new FileInputStream(path);
    	workbook=new XSSFWorkbook(fis);
    	sheet=workbook.getSheet(sheetname);
    	row =sheet.getRow(rownum);
    	cell=row.createCell(colnum);
    	cell.setCellValue(data);
    	fos=new FileOutputStream(path);
    	workbook.write(fos);
    	workbook.close();
    	fis.close();
    	fos.close();
    	
    	
    	
    }
    public void setForeGroundColorGreen(String sheetname,int rownum,int colnum) throws IOException
    {
    	fis=new FileInputStream(path);
    	workbook=new XSSFWorkbook(fis);
    	sheet = workbook.getSheet(sheetname);
    	row=sheet.getRow(rownum);
    	cell=row.getCell(colnum);
    	style=workbook.createCellStyle();
    	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	cell.setCellStyle(style);
    	fos=new FileOutputStream(path);
    	workbook.write(fos);
    	workbook.close();
    	fos.close();
    	fis.close();
    	
    	
   }
    public void setForeGroundColorRed(String sheetname,int rownum,int colnum) throws IOException
    {
    	fis=new FileInputStream(path);
    	workbook=new XSSFWorkbook(fis);
    	sheet = workbook.getSheet(sheetname);
    	row=sheet.getRow(rownum);
    	cell=row.getCell(colnum);
    	style=workbook.createCellStyle();
    	style.setFillForegroundColor(IndexedColors.RED.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	cell.setCellStyle(style);
    	fos=new FileOutputStream(path);
    	workbook.write(fos);
    	workbook.close();
    	fos.close();
    	fis.close();
    	
    }
}
