package mx.daniel.aspose2poi.unittest;

import org.junit.Assert;
import org.junit.Test;

import mx.daniel.aspose2poi.helpers.CellTranslator;

public class TestCellTranslator {

	
	@Test
	public void test1() {
		int calculado = CellTranslator.getRowIndex("CD12");
		int esperado = 81;
		Assert.assertTrue(calculado == esperado);
	}
	
	@Test
	public void test2() {
		int calculado = CellTranslator.getRowIndex("Z3");
		int esperado = 25;
		Assert.assertTrue(calculado == esperado);
	}
	
	@Test
	public void test3() {
		int calculado = CellTranslator.getRowIndex("A2");
		int esperado = 0;
		Assert.assertTrue(calculado == esperado);
	}
	
	@Test
	public void test4() {
		int calculado = CellTranslator.getCellIndex("B59");
		int esperado = 58;
		Assert.assertTrue(calculado == esperado);
	}
}
