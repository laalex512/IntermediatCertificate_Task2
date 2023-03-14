package IntermediatCertificate;

public class Toy {
	public static int idCounter =  0;
	private int toyId;
	private String toyName;
	private int toyCount;
	private int toyWeight;

	public Toy(String toyName, int toyCount, int toyWeight) {
		this.toyId = ++this.idCounter;
		this.toyName = toyName;
		this.toyCount = toyCount;
		this.toyWeight = toyWeight;
	}

	public int getToyId(){
		return this.toyId;
	}

	public int getToyWeight() {
		return toyWeight;
	}

	public int getToyCount() {
		return toyCount;
	}

	public String getToyName() {
		return toyName;
	}

	public void updateToyCount(int toyCount) {
		this.toyCount += toyCount;
	}

	public void setToyWeight(int toyWeight) {
		this.toyWeight = toyWeight;
	}


	@Override
	public String toString() {
		return "{" +
			 "toyId=" + this.toyId +
			 ", toyName='" + this.toyName + '\'' + ", count = " + this.toyCount +
			 '}';
	}
}
