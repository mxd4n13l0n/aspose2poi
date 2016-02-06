package mx.daniel.aspose2poi;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import mx.daniel.aspose2poi.helpers.CellTranslator;
import mx.daniel.aspose2poi.wrappers.CellWrapper;

public class Cells {
	private Sheet sheet;

	public Cells(Sheet sheet) {
		this.sheet = sheet;
	}

	public Cell get(String string) {
		int rownum = CellTranslator.getRowIndex(string);
		int cellnum = CellTranslator.getCellIndex(string);

		Row r = lookForCell(cellnum);
		org.apache.poi.ss.usermodel.Cell cell = lookForRow(r, rownum);
		return new CellWrapper(cell);

	}

	public void setColumnWidth(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	private Row lookForCell(int rownum) {
		Row r = sheet.getRow(rownum);
		if (r == null) {
			r = sheet.createRow(rownum);
		}
		return r;
	}
	
	private org.apache.poi.ss.usermodel.Cell lookForRow(Row r, int cell) {
		org.apache.poi.ss.usermodel.Cell c = r.getCell(cell); 
		if (c == null) {
			c = r.createCell(cell);
		}
		return c;
	}

}
