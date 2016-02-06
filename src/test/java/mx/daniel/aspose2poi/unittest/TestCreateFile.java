package mx.daniel.aspose2poi.unittest;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.daniel.aspose2poi.Workbook;
import mx.daniel.aspose2poi.WorksheetCollection;

public class TestCreateFile {
	private Workbook wb;
	private static final String testPath = "src\\test\\resources\\";
	
	
	@Before
	public void crearObjetoWorkbook() {
		wb = new Workbook();
	}
	
	@Test
	public void crearArchivoExcel() {
		String nombreArchivo = testPath + "createBook.xlsx";
		wb.save(nombreArchivo);
		File f = new File(nombreArchivo);
		Assert.assertTrue(f.exists());
	}
	
	@Test
	public void crearArchivoConVariasHojas() {
		String nombreArchivo = testPath + "withManySheets.xlsx";
		WorksheetCollection sheets =  wb.getWorkshets();
		for (int i = 0; i < 10; i++) {
			int indice = sheets.add();
			sheets.get(indice).setName("My sheet " + i);
		}
		wb.save(nombreArchivo);
		File f = new File(nombreArchivo);
		Assert.assertTrue(f.exists());
		
	}
}
