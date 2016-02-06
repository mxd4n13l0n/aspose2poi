package mx.daniel.aspose2poi;

import org.apache.poi.ss.usermodel.Sheet;

public class Worksheet {
	private String sheetName;
	private Sheet sheet;
	public Worksheet() {
		
	}
	
	public Worksheet(Sheet sheet) {
		this.sheet = sheet;
		sheetName = sheet.getSheetName();
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		this.sheetName = string;
		//this.sheet.
	}
	
	public String getName() {
		return this.sheetName;
	}

	public Cells getCells() {
		return new Cells(sheet);
	}

	public ErrorCheckOptionCollection getErrorCheckOptions() {
		// TODO Auto-generated method stub
		return null;
	}

}
