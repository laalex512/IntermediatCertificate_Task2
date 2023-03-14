package IntermediatCertificate.Services;

import IntermediatCertificate.Toy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raffler {
	private List<Toy> toyList = new ArrayList<>();

	public Raffler(List<Toy> toyList) {
		this.toyList = toyList;
	}

	public void raffleToy(List<String> toysToWin){
		int sumOfWeight = 0;
		for (Toy toy : this.toyList){
			if (toy.getToyCount() == 0) {
				continue;
			}
			sumOfWeight += toy.getToyWeight();
		}
		if (sumOfWeight > 0) {
			Integer[] toysProbability = new Integer[sumOfWeight];
			int currentIndex = 0;
			for (Toy toy : this.toyList) {
				if (toy.getToyCount() == 0) {
					continue;
				}
				for (int i = currentIndex; i < currentIndex + toy.getToyWeight(); i++) {
					toysProbability[i] = toy.getToyId();
				}
				currentIndex += toy.getToyWeight();
			}
			String result = "";
			Random random = new Random();
			int winIndex = random.nextInt(0, sumOfWeight);
			for (Toy toy : this.toyList) {
				if (toy.getToyId() == toysProbability[winIndex]) {
					toy.updateToyCount(-1);
					result += toy.getToyName();
					break;
				}
			}
			toysToWin.add(result);
		} else {
			System.out.println("Error. The toys are over ");
		}
	}
}
