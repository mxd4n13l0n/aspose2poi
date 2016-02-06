package mx.daniel.aspose2poi.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CellTranslator {

	public static int getRowIndex(String s) {
		Pattern pattern = Pattern.compile("([A-Z]*)[0-9]*");
		Matcher matcher = pattern.matcher(s);
		String letrasRow = "A";
		if (matcher.find())
		{
			letrasRow = matcher.group(1);
		}
		return conteoRow(letrasRow);
	}

	public static int getCellIndex(String s) {
		Pattern pattern = Pattern.compile("[A-Z]*([0-9]*)");
		Matcher matcher = pattern.matcher(s);
		String letrasCell = "1";
		if (matcher.find())
		{
			letrasCell = matcher.group(1);
		}
		return Integer.parseInt(letrasCell) - 1;
	}
	
	
	private static int conteoRow(String letrasRow) {
		int size = letrasRow.length();
		int conteo = 0;
		int base = 'Z' - 'A' + 1;
		for (int i = 0; i < size; i++) {
			char letra = letrasRow.charAt(size-i-1);
			int letraEnEntero = charToInt(letra);
			int valorCalculado = letraEnEntero * (int)Math.pow(base,i);
			conteo += valorCalculado;
		}
		return conteo - 1;
		
	}
	
	private static int charToInt(char c) {
		return (c - 'A') + 1;
	}
	
}
