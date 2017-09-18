package foo01;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Date;

public class PtDataFromClipbrd {
	private static final String DOB_CLUE = "Code Sts:";

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		try {
			String text = (String) clipboard.getData(DataFlavor.stringFlavor);
			if (text == null || text.trim().isEmpty()) {
				// !! throw exception
			}
			Patient patient = createPatientData(text);
		} catch (UnsupportedFlavorException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Patient createPatientData(String clipboardText) {
		String[] lines = clipboardText.split("\n");
		if (lines.length == 0) {
			// !! throw exception
		}
		
		Date dob = null;
		String mrnVidant = null;
		
		String name = lines[0];
		for (String line : lines) {
			if (line.contains(DOB_CLUE)) {
				
			}
		}

	}
}
