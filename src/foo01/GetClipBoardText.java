package foo01;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetClipBoardText {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		DataFlavor rtfFlavor = null;
		try {
			rtfFlavor = new DataFlavor("text/rtf");
			Object data = clipboard.getData(rtfFlavor);
			if (data != null && data instanceof InputStream) {
				// System.out.println("yes!");
			} else {
				System.err.println("data, "+ data + ", is null, or data not an input stream");
				System.exit(-1);
			}
			// System.out.println("data type: " + data.getClass());
			
			StringBuilder sb = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) data));
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println(sb);
		} catch (ClassNotFoundException | UnsupportedFlavorException | IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
