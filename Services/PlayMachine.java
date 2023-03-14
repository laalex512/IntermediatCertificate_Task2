package IntermediatCertificate.Services;

import IntermediatCertificate.Toy;
import java.util.List;

public class PlayMachine {
	public void playRaffle(List<Toy> toysToRaffle, int countPlays, List<String> toysToWin){
		Raffler raffler = new Raffler(toysToRaffle);
		for (int i = 0; i < countPlays; i++){
			raffler.raffleToy(toysToWin);
		}
	}
}
