package mx.daniel.aspose2poi.wrappers;

import java.math.BigDecimal;
import java.util.Date;

import mx.daniel.aspose2poi.Cell;
import mx.daniel.aspose2poi.Style;

public class CellWrapper implements Cell {
	private org.apache.poi.ss.usermodel.Cell c;
	public CellWrapper(org.apache.poi.ss.usermodel.Cell c) {
		this.c = c;
	}

		public void setValue(String string) {
		c.setCellValue(string);
	}

	
	public Style getStyle() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setStyle(Style styleTitCom) {
		// TODO Auto-generated method stub
		
	}

	
	public void setValue(Integer valor) {
		c.setCellValue(valor);
	}


	public void setValue(BigDecimal valor) {
		c.setCellValue(valor.toString());
	}


	public void setValue(Date valor) {
		c.setCellValue(valor);
	}


	public void setFormula(String formula) {
		// TODO Auto-generated method stub
		
	}

}
