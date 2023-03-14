package IntermediatCertificate;
import IntermediatCertificate.Services.PlayMachine;
import IntermediatCertificate.Services.ToysGiver;
import java.util.ArrayList;
import java.util.List;

public class Controller {
	public void start() {
		Toy toy1 = new Toy("TeddyBear", 10, 10);
		Toy toy2 = new Toy("Car", 10, 10);
		Toy toy3 = new Toy("Robot", 10, 15);

		List<Toy> toysToRaffle = new ArrayList<>(); // список с игрушками для розыгрыша
		toysToRaffle.add(toy1);
		toysToRaffle.add(toy2);
		toysToRaffle.add(toy3);
		toy3.setToyWeight(100); // увеличиваем частоту выпадения игрушки до 100
		System.out.println(toysToRaffle); // выводим изначальный список игрушек

		List<String> toysToWin = new ArrayList<>(); // список для выигранных игрушек

		PlayMachine pm  = new PlayMachine();
		pm.playRaffle(toysToRaffle, 32, toysToWin);
		System.out.println(toysToRaffle); // выводим массив игрушек после 32 розыгрышей (пустой)
		System.out.println(toysToWin);    // выводим список выигранных игрушек

		toy1.updateToyCount(10);
		pm.playRaffle(toysToRaffle, 12, toysToWin);
		System.out.println(toysToRaffle); // выводим массив игрушек после 12 розыгрышей (пустой)
		System.out.println(toysToWin);    // выводим обновленный список выигранных игрушек

		ToysGiver tg = new ToysGiver();
		tg.giveToys(toysToWin, 30);  // выдаем 5 первых игрушек
		System.out.println(toysToWin);    // выводим обновленный список выигранных игрушек
	}
}
