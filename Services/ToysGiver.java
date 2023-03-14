package IntermediatCertificate.Services;

import IntermediatCertificate.Utils.WriteGivenToys;
import java.util.List;

public class ToysGiver {

	public void giveToys (List<String> toysList, int countGiven) {
		if (countGiven <= toysList.size()) {
			for (int i = 0; i < countGiven; i++) {
				WriteGivenToys.write(toysList.get(0), "IntermediatCertificate/Data/givenToys.txt");
				toysList.remove(0);
			}
		} else {
			System.out.println("Error. List of toys too small");
		}
	}
}
