package foo01;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class MinParseDetailedReport {
	public static void main(String[] args) throws ClipboardParseException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();

		try {
			Object datum = clipboard.getData(DataFlavor.stringFlavor);
			if (datum == null || !(datum instanceof String)) {
				String exceptionText = "data: " + datum + ", is either null or invalid";
				throw new ClipboardParseException(exceptionText);
			}
			String text = datum.toString();
			System.out.println(text);
		} catch (UnsupportedFlavorException | IOException e) {
			e.printStackTrace();
		}
	}
}

class ClipboardParseException extends Exception {

	public ClipboardParseException(String text) {
		super(text);
	}
	
}