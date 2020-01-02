package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pages.BaseTest;

public class ReadExcelFile extends BaseTest{
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static FileInputStream fis;
	
	
	@SuppressWarnings("deprecation")
//	public static Object[][] getData() throws IOException
//	//public static void getData() throws IOException
//	{
//		int i=0,j=0;
//		
//		try {
//			 fis=new FileInputStream(current_path+"\\src\\main\\resources\\testdata\\EmployeeListData.xlsx");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		wb=new XSSFWorkbook(fis);
//		sheet=wb.getSheetAt(0);
//		Object [][] obj=new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];
//		Iterator<Row> rowi=sheet.rowIterator();
//		i=0;
//		while(rowi.hasNext())
//		{
//			Row row=rowi.next();
//			
//			Iterator<Cell> celli=row.cellIterator();		
//			j=0;
//			while(celli.hasNext())
//			{
//				Cell cell=celli.next();
//				if(cell==null)
//				{
//					System.out.println("Cell type is NULL");
//					obj[i][j]=" NULL ";
//					
//				}
//				if(cell.getCellType()==CellType.BLANK || cell.getCellType()==CellType._NONE) 
//				{
//				 
//					System.out.println("Cell type is NULL");
//					obj[i][j]=" BLANK ";
//				}	
//				else if(cell.getCellType().equals(CellType.BLANK) || cell.getCellType().equals(CellType._NONE))
//				{
//					System.out.println("Cell type is NULL");
//					obj[i][j]=" NONE ";	
//				}
//				else {
//				System.out.print(cell.getCellType()+ ":: "+cell.toString()+" ");
//				obj[i][j]=cell.toString();
//				}
//				j++;
//			}
//			System.out.print(" J="+j);
//			System.out.println("i="+ i);
//			i++;
//		}
//		return obj;
//	}

	
	public static Object[][] getData(String filename,int sheetNumber) throws IOException
	//public static void getData() throws IOException
	{
		int i=0,j=0;
		
		try {
			 fis=new FileInputStream(current_path+"\\src\\main\\resources\\testdata\\"+filename+".xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(sheetNumber);
		Object [][] obj=new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()-1];
		int cellnum=sheet.getRow(0).getLastCellNum();

		Iterator<Row> rowi=sheet.rowIterator();
		i=0;
		while(rowi.hasNext())
		{
			Row row=rowi.next();
						
			for(j=1;j<cellnum;j++)
			{
				Cell cell=row.getCell(j);
				//int colnumber=cell.getColumnIndex();
	
				if(cell==null)
				{
					System.out.print("Cell type is NULL");
					obj[i][j-1]=" NULL ";
					
				}
				else if(cell.getCellType()==CellType.BLANK || cell.getCellType()==CellType._NONE) 
				{
				 
					System.out.println("Cell type is NULL");
					obj[i][j]=" BLANK ";
				}	
				else if(cell.getCellType().equals(CellType.BLANK) || cell.getCellType().equals(CellType._NONE))
				{
					System.out.println("Cell type is NULL");
					obj[i][j]=" NONE ";	
				}
				else {
				System.out.print(cell.getCellType()+":: "+cell.toString()+" ");
				obj[i][j-1]=cell.toString();
				}
				
			}
			//System.out.print(" J="+j);
			//System.out.println("i="+ i);
			i++;
		}
		return obj;
	}

	public static int getRowCount(String filename,int sheetNumber) throws IOException
	{
		try {
			 fis=new FileInputStream(current_path+"\\src\\main\\resources\\testdata\\"+filename+".xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(sheetNumber);
		return sheet.getLastRowNum()+1;
	}
	
	public static int getColCount(String filename,int sheetNumber) throws IOException
	{
		try {
			 fis=new FileInputStream(current_path+"\\src\\main\\resources\\testdata\\"+filename+".xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(sheetNumber);
		return sheet.getRow(0).getLastCellNum()-1;
	}	
}
