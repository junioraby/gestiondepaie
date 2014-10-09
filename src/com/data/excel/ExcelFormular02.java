package com.data.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFormular02 {
	public static void readSheetWithFormula()
	{
	    try
	    {
	        FileInputStream file = new FileInputStream(new File("C:/Users/Junior Aby/Desktop/TutoVideo/formulaDemo.xlsx"));
	 
	        //Create Workbook instance holding reference to .xlsx file
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
	         
	        //Get first/desired sheet from the workbook
	        XSSFSheet sheet = workbook.getSheetAt(0);
	 
	        //Iterate through each rows one by one
	        Iterator<Row> rowIterator = sheet.iterator();
	        while (rowIterator.hasNext()) 
	        {
	            Row row = rowIterator.next();
	            //For each row, iterate through all the columns
	            Iterator<Cell> cellIterator = row.cellIterator();
	             
	            while (cellIterator.hasNext()) 
	            {
	                Cell cell = cellIterator.next();
	                //Check the cell type after eveluating formulae
	                //If it is formula cell, it will be evaluated otherwise no change will happen
	                switch (evaluator.evaluateInCell(cell).getCellType()) 
	                {
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue() + "\t");
	                        break;
	                    case Cell.CELL_TYPE_STRING:
	                        System.out.print(cell.getStringCellValue() + "\t");
	                        break;
	                    case Cell.CELL_TYPE_FORMULA:
	                        //Not again
	                        break;
	                }
	            }
	            System.out.println("");
	        }
	        file.close();
	    } 
	    catch (Exception e) 
	    {
	        e.printStackTrace();
	    }
	}
}
