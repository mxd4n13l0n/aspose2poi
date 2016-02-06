package mx.daniel.aspose2poi.unittest;

import org.junit.Before;
import org.junit.Test;

import mx.daniel.aspose2poi.Cells;
import mx.daniel.aspose2poi.Workbook;
import mx.daniel.aspose2poi.Worksheet;

public class TestWriteOnCells {
	private Workbook workbook;
	private static final String testPath = "src\\test\\resources\\";
	
	
	@Before
	public void crearObjetoWorkbook() {
		workbook = new Workbook();
	}
	
	@Test
	public void testCeldasHolaMundo() {
		Worksheet worksheet = workbook.getWorksheets().get(0);
		Cells cells = worksheet.getCells();
		cells.get("AA21").setValue("HOLA MUNDO!!");
		cells.get("A1").setValue(10000);
		
		String nombreArchivo = testPath + "cellsHelloWorld.xlsx";
		workbook.save(nombreArchivo);
	}
}
