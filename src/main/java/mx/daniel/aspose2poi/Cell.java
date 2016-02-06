package mx.daniel.aspose2poi;

import java.math.BigDecimal;
import java.util.Date;

public interface Cell {

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Dan#setValue(java.lang.String)
	 */
	void setValue(String string);

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Dan#getStyle()
	 */
	Style getStyle();

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Dan#setStyle(mx.gob.cnsf.librerias.hojacalculo.aspose.Style)
	 */
	void setStyle(Style styleTitCom);

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Dan#setValue(java.lang.Integer)
	 */
	void setValue(Integer valor);

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Dan#setValue(java.math.BigDecimal)
	 */
	void setValue(BigDecimal valor);

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Dan#setValue(java.util.Date)
	 */
	void setValue(Date valor);

	/* (non-Javadoc)
	 * @see mx.gob.cnsf.librerias.hojacalculo.aspose.wrappers.Dan#setFormula(java.lang.String)
	 */
	void setFormula(String formula);

}