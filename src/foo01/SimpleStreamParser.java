package foo01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SimpleStreamParser {
	private BufferedReader reader;

	public SimpleStreamParser(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream));
	}
}
