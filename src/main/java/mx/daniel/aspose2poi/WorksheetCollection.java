package mx.daniel.aspose2poi;

import org.apache.poi.ss.usermodel.Sheet;

public class WorksheetCollection {
	
	private int currentIndex = -1;
	
	private org.apache.poi.ss.usermodel.Workbook poiWorkbook;
	
	public WorksheetCollection(org.apache.poi.ss.usermodel.Workbook poi) {
		this.poiWorkbook = poi;
	}
	
	public int add() {
		this.poiWorkbook.createSheet();
		return ++currentIndex;
	}
	
	public Worksheet get(int pos) {
		Sheet poiSheet = this.poiWorkbook.getSheetAt(pos);
		return new Worksheet(poiSheet);
	}
	
	public Worksheet get(String sheetName) {
		Sheet poiSheet = this.poiWorkbook.getSheet(sheetName);
		return new Worksheet(poiSheet);
	}
	
}
