package IntermediatCertificate.Utils;

import java.io.FileWriter;
import java.io.IOException;

public class WriteGivenToys {
	public static void write (String message, String pathFile) {
		try (FileWriter fw = new FileWriter(pathFile, true)) {
				fw.write(message + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
