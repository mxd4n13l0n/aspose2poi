package mx.daniel.aspose2poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mx.daniel.aspose2poi.Workbook;


public class Workbook {
	private static final String NOMBRE_DEFAULT_HOJA_ASPOSE = "Sheet1";

	private XSSFWorkbook poiWorkbook;
	private FileOutputStream out;
	
	private WorksheetCollection worksheets;
	
	public Workbook(String filepath) throws Exception {
		poiWorkbook = new XSSFWorkbook(filepath);
	}
	
	public Workbook (FileInputStream fstream) {
		try {
			poiWorkbook = new XSSFWorkbook(fstream);
			worksheets = new WorksheetCollection(poiWorkbook);
		} catch (Exception e) {
			e.printStackTrace();
			//TODO: implementar handle de error
		}
		
	}

	public Workbook() {
		poiWorkbook = new XSSFWorkbook();
		worksheets = new WorksheetCollection(poiWorkbook);
		crearHojaDefault();
	}

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Workbook#getWorkshets()
	 */
	public WorksheetCollection getWorkshets() {
		return this.worksheets;
	}

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Workbook#save(java.lang.String)
	 */
	public void save(String filePath) {
		try {
			out = new FileOutputStream(new File(filePath));
			this.poiWorkbook.write(out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void crearHojaDefault() {
		this.poiWorkbook.createSheet(NOMBRE_DEFAULT_HOJA_ASPOSE);
	}

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Workbook#getWorksheets()
	 */
	public WorksheetCollection getWorksheets() {
		return this.worksheets;
	}
	
}
